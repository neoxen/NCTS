package com.ncts.webapp.action;


import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ncts.model.NctsUser;
import com.ncts.service.GenericManager;
import org.apache.struts2.ServletActionContext;
import com.ncts.Constants;
import com.ncts.model.User;
import com.ncts.service.UserExistsException;
import com.ncts.webapp.util.RequestUtil;
import org.springframework.mail.MailException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * Action to allow new users to sign up.
 */
public class SignupAction extends BaseAction {
    private static final long serialVersionUID = 6558317334878272308L;
    private User user;
    private String cancel;

    private GenericManager<NctsUser, String> nctsUserManager;
    private NctsUser nctsUser;

    public NctsUser getNctsUser() {
        return nctsUser;
    }

    public void setNctsUser(NctsUser nctsUser) {
        this.nctsUser = nctsUser;
    }

    public void setNctsUserManager(GenericManager<NctsUser, String> nctsUserManager) {
        this.nctsUserManager = nctsUserManager;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Return an instance of the user - to display when validation errors occur
     * @return a populated user
     */
    public User getUser() {
        return user;
    }

    /**
     * When method=GET, "input" is returned. Otherwise, "success" is returned.
     * @return cancel, input or success
     */
    public String execute() {
        if (cancel != null) {
            return CANCEL;
        }
        if (ServletActionContext.getRequest().getMethod().equals("GET")) {
            return INPUT;
        }
        return SUCCESS;
    }

    /**
     * Returns "input"
     * @return "input" by default
     */
    public String doDefault() {
        return INPUT;
    }

    /**
     * Save the user, encrypting their passwords if necessary
     * @return success when good things happen
     * @throws Exception when bad things happen
     */
    public String save() throws Exception {
        user.setEnabled(false);

        // Set the default user role on this new user
        user.addRole(roleManager.getRole(Constants.USER_ROLE));

        try {
            user = userManager.saveUser(user);
        } catch (AccessDeniedException ade) {
            // thrown by UserSecurityAdvice configured in aop:advisor userManagerSecurity 
            log.warn(ade.getMessage());
            getResponse().sendError(HttpServletResponse.SC_FORBIDDEN);
            return null; 
        } catch (UserExistsException e) {
            log.warn(e.getMessage());
            List<Object> args = new ArrayList<Object>();
            args.add(user.getUsername());
            args.add(user.getEmail());
            addActionError(getText("errors.existing.user", args));

            // redisplay the unencrypted passwords
            user.setPassword(user.getConfirmPassword());
            return INPUT;
        }

        nctsUser = new NctsUser();
        nctsUser.setUserName(user.getUsername());
        nctsUser.setPassword(user.getPassword());
        nctsUser.setSfzrxm(user.getFirstName());
        nctsUser.setSqymc(user.getWebsite());
        nctsUser.setSzch(user.getLastName());

        try{
            nctsUser = nctsUserManager.save(nctsUser);
        } catch (AccessDeniedException ade) {
            log.warn(ade.getMessage());
            getResponse().sendError(HttpServletResponse.SC_FORBIDDEN);
            return null;
        }


        saveMessage(getText("user.registered"));
        getSession().setAttribute(Constants.REGISTERED, Boolean.TRUE);

        // log user in automatically
//        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(
//                user.getUsername(), user.getConfirmPassword(), user.getAuthorities());
//        auth.setDetails(user);
//        SecurityContextHolder.getContext().setAuthentication(auth);

        // Send an account information e-mail
//        mailMessage.setSubject(getText("signup.email.subject"));
//
//        try {
//            sendUserMessage(user, getText("signup.email.message"), RequestUtil.getAppURL(getRequest()));
//        } catch (MailException me) {
//            addActionError(me.getMostSpecificCause().getMessage());
//        }

        return SUCCESS;
    }
}

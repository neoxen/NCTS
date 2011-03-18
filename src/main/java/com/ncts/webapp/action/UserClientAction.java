package com.ncts.webapp.action;

import com.ncts.client.UserService;
import com.ncts.model.NctsUser;
import com.ncts.service.GenericManager;
import com.opensymphony.xwork2.Preparable;
import org.apache.struts2.ServletActionContext;
import com.ncts.Constants;
import com.ncts.model.Role;
import com.ncts.model.User;
import com.ncts.service.UserExistsException;
import com.ncts.webapp.util.RequestUtil;
import org.springframework.mail.MailException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationTrustResolver;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by IntelliJ IDEA.
 * User: Neo
 * Date: 11-3-18
 * Time: 上午10:28
 * To change this template use File | Settings | File Templates.
 */
public class UserClientAction extends BaseAction implements Preparable{
    private static final long serialVersionUID = 6558317343878272308L;
    private List users;

    private UserService userClient;

    public List getUsers() {
        return users;
    }


    public void setUserClient(UserService userService) {
        this.userClient = userService;
    }

    public void prepare() {
        // prevent failures on new

    }

    public String list() {
        users = userClient.getUsers();
        return SUCCESS;
    }
}

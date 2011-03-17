package com.ncts.webapp.action;

import com.opensymphony.xwork2.Preparable;
import com.ncts.service.GenericManager;
import com.ncts.model.NctsUser;
import com.ncts.webapp.action.BaseAction;

import java.util.List;

public class NctsUserAction extends BaseAction implements Preparable {
    private GenericManager<NctsUser, String> nctsUserManager;
    private List nctsUsers;
    private NctsUser nctsUser;
    private String userId;

    public void setNctsUserManager(GenericManager<NctsUser, String> nctsUserManager) {
        this.nctsUserManager = nctsUserManager;
    }

    public List getNctsUsers() {
        return nctsUsers;
    }

    /**
     * Grab the entity from the database before populating with request parameters
     */
    public void prepare() {
        if (getRequest().getMethod().equalsIgnoreCase("post")) {
            // prevent failures on new
            String nctsUserId = getRequest().getParameter("nctsUser.userId");
            if (nctsUserId != null && !nctsUserId.equals("")) {
                nctsUser = nctsUserManager.get(new String(nctsUserId));
            }
        }
    }

    public String list() {
        nctsUsers = nctsUserManager.getAll();
        return SUCCESS;
    }

    public void setUserId(String  userId) {
        this. userId =  userId;
    }

    public NctsUser getNctsUser() {
        return nctsUser;
    }

    public void setNctsUser(NctsUser nctsUser) {
        this.nctsUser = nctsUser;
    }

    public String delete() {
        nctsUserManager.remove(nctsUser.getUserId());
        saveMessage(getText("nctsUser.deleted"));

        return SUCCESS;
    }

    public String edit() {
        if (userId != null) {
            nctsUser = nctsUserManager.get(userId);
        } else {
            nctsUser = new NctsUser();
        }

        return SUCCESS;
    }

    public String save() throws Exception {
        if (cancel != null) {
            return "cancel";
        }

        if (delete != null) {
            return delete();
        }

        boolean isNew = (nctsUser.getUserId() == null);

        nctsUserManager.save(nctsUser);

        String key = (isNew) ? "nctsUser.added" : "nctsUser.updated";
        saveMessage(getText(key));

        if (!isNew) {
            return INPUT;
        } else {
            return SUCCESS;
        }
    }
}
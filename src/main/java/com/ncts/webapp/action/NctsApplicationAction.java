package com.ncts.webapp.action;

import com.opensymphony.xwork2.Preparable;
import com.ncts.service.GenericManager;
import com.ncts.model.NctsApplication;
import com.ncts.webapp.action.BaseAction;

import java.util.List;

public class NctsApplicationAction extends BaseAction implements Preparable {
    private GenericManager<NctsApplication, String> nctsApplicationManager;
    private List nctsApplications;
    private NctsApplication nctsApplication;
    private String applyId;

    public void setNctsApplicationManager(GenericManager<NctsApplication, String> nctsApplicationManager) {
        this.nctsApplicationManager = nctsApplicationManager;
    }

    public List getNctsApplications() {
        return nctsApplications;
    }

    /**
     * Grab the entity from the database before populating with request parameters
     */
    public void prepare() {
        if (getRequest().getMethod().equalsIgnoreCase("post")) {
            // prevent failures on new
            String nctsApplicationId = getRequest().getParameter("nctsApplication.applyId");
            if (nctsApplicationId != null && !nctsApplicationId.equals("")) {
                nctsApplication = nctsApplicationManager.get(new String(nctsApplicationId));
            }
        }
    }

    public String list() {
        nctsApplications = nctsApplicationManager.getAll();
        return SUCCESS;
    }

    public void setApplyId(String  applyId) {
        this. applyId =  applyId;
    }

    public NctsApplication getNctsApplication() {
        return nctsApplication;
    }

    public void setNctsApplication(NctsApplication nctsApplication) {
        this.nctsApplication = nctsApplication;
    }

    public String delete() {
        nctsApplicationManager.remove(nctsApplication.getApplyId());
        saveMessage(getText("nctsApplication.deleted"));

        return SUCCESS;
    }

    public String edit() {
        if (applyId != null) {
            nctsApplication = nctsApplicationManager.get(applyId);
        } else {
            nctsApplication = new NctsApplication();
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

        boolean isNew = (nctsApplication.getApplyId() == null);

        nctsApplicationManager.save(nctsApplication);

        String key = (isNew) ? "nctsApplication.added" : "nctsApplication.updated";
        saveMessage(getText(key));

        if (!isNew) {
            return INPUT;
        } else {
            return SUCCESS;
        }
    }
}
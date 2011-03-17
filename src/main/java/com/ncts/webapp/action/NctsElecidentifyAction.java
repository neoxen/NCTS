package com.ncts.webapp.action;

import com.opensymphony.xwork2.Preparable;
import com.ncts.service.GenericManager;
import com.ncts.model.NctsElecidentify;
import com.ncts.webapp.action.BaseAction;

import java.util.List;

public class NctsElecidentifyAction extends BaseAction implements Preparable {
    private GenericManager<NctsElecidentify, String> nctsElecidentifyManager;
    private List nctsElecidentifies;
    private NctsElecidentify nctsElecidentify;
    private String identifyId;

    public void setNctsElecidentifyManager(GenericManager<NctsElecidentify, String> nctsElecidentifyManager) {
        this.nctsElecidentifyManager = nctsElecidentifyManager;
    }

    public List getNctsElecidentifies() {
        return nctsElecidentifies;
    }

    /**
     * Grab the entity from the database before populating with request parameters
     */
    public void prepare() {
        if (getRequest().getMethod().equalsIgnoreCase("post")) {
            // prevent failures on new
            String nctsElecidentifyId = getRequest().getParameter("nctsElecidentify.identifyId");
            if (nctsElecidentifyId != null && !nctsElecidentifyId.equals("")) {
                nctsElecidentify = nctsElecidentifyManager.get(new String(nctsElecidentifyId));
            }
        }
    }

    public String list() {
        nctsElecidentifies = nctsElecidentifyManager.getAll();
        return SUCCESS;
    }

    public void setIdentifyId(String  identifyId) {
        this. identifyId =  identifyId;
    }

    public NctsElecidentify getNctsElecidentify() {
        return nctsElecidentify;
    }

    public void setNctsElecidentify(NctsElecidentify nctsElecidentify) {
        this.nctsElecidentify = nctsElecidentify;
    }

    public String delete() {
        nctsElecidentifyManager.remove(nctsElecidentify.getIdentifyId());
        saveMessage(getText("nctsElecidentify.deleted"));

        return SUCCESS;
    }

    public String edit() {
        if (identifyId != null) {
            nctsElecidentify = nctsElecidentifyManager.get(identifyId);
        } else {
            nctsElecidentify = new NctsElecidentify();
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

        boolean isNew = (nctsElecidentify.getIdentifyId() == null);

        nctsElecidentifyManager.save(nctsElecidentify);

        String key = (isNew) ? "nctsElecidentify.added" : "nctsElecidentify.updated";
        saveMessage(getText(key));

        if (!isNew) {
            return INPUT;
        } else {
            return SUCCESS;
        }
    }
}
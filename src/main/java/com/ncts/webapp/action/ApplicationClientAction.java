package com.ncts.webapp.action;

import com.ncts.client.ApplicationService;
import com.ncts.client.UserService;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Neo
 * Date: 11-3-18
 * Time: 下午4:29
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationClientAction extends BaseAction {
    private static final long serialVersionUID = 655831734387822708L;

    private List nctsApplications;

    private ApplicationService applicationClient;

    public List getNctsApplications() {
        return nctsApplications;
    }


    public void setApplicationClient(ApplicationService applicationService) {
        this.applicationClient = applicationService;
    }

    public void prepare() {
        // prevent failures on new

    }

    public String list() {
        nctsApplications = applicationClient.getNctsApplications();
        return SUCCESS;
    }

}

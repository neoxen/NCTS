package com.ncts.service.impl;

import com.ncts.dao.GenericDao;
import com.ncts.model.NctsApplication;
import com.ncts.service.ApplicationService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Neo
 * Date: 11-3-18
 * Time: 下午4:06
 * To change this template use File | Settings | File Templates.
 */
@Service("applicationManager")
@WebService(serviceName = "ApplicationService", endpointInterface = "com.ncts.service.ApplicationService")
public class ApplicationServiceImpl extends GenericManagerImpl<NctsApplication, String> implements ApplicationService {
    protected GenericDao<NctsApplication, String> applicationDao;

    public ApplicationServiceImpl() {
    }

    public ApplicationServiceImpl(GenericDao<NctsApplication, String> applicationDao) {
        this.applicationDao = applicationDao;
    }

    public void setApplicationDao(GenericDao<NctsApplication, String> applicationDao) {
        this.applicationDao = applicationDao;
    }

    public List<NctsApplication> getNctsApplications() {
        return applicationDao.getAllDistinct();
    }
}

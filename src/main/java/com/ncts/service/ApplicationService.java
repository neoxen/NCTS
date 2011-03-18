package com.ncts.service;

import com.ncts.model.NctsApplication;
import com.ncts.model.User;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Neo
 * Date: 11-3-18
 * Time: 下午4:03
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface ApplicationService {

    List<NctsApplication> getNctsApplications();
}

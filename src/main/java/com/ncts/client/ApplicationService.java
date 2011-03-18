package com.ncts.client;

import com.ncts.model.NctsApplication;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Neo
 * Date: 11-3-18
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface ApplicationService {
    List<NctsApplication> getNctsApplications();
}

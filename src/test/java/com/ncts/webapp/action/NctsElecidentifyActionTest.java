package com.ncts.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import com.ncts.service.GenericManager;
import com.ncts.model.NctsElecidentify;
import com.ncts.webapp.action.BaseActionTestCase;
import org.springframework.mock.web.MockHttpServletRequest;

public class NctsElecidentifyActionTest extends BaseActionTestCase {
    private NctsElecidentifyAction action;

    @Override @SuppressWarnings("unchecked")
    protected void onSetUpInTransaction() throws Exception {
        action = new NctsElecidentifyAction();
        GenericManager nctsElecidentifyManager = (GenericManager) applicationContext.getBean("nctsElecidentifyManager");
        action.setNctsElecidentifyManager(nctsElecidentifyManager);
    
        // add a test nctsElecidentify to the database
        NctsElecidentify nctsElecidentify = new NctsElecidentify();

        // enter all required fields
        nctsElecidentify.setApplyId("LvRhSbWgOmFyGgWsQwJpErKaAhBsFaGt");
        nctsElecidentify.setCreateDate(new java.util.Date());
        nctsElecidentify.setIdentifyCode("HjDuDmNvWqGwChDcPzFpCwScObAeTfVsEwYkUkJvJhXpZfFfEx");
        nctsElecidentify.setIsValid(1560359998);
        nctsElecidentify.setSiteDomains("RjLkMjUaSzYvMtZcOdOvQfOqIoUeJrBnGnDrGwYtOtKzGyGiMcBmIyTyMtQtXlThBcAhTlJnGsSoKdRnUyOkMpEoOmQnBsOtOcGkFkUhOlZyLyIgLgTxEfAvMgTlMvKyLnCtMwIqFrQrVzLyWdTbMgWrZhQfXyHvMeBfVbOgWeVtKxMvIrFcSwDlJwGlVhCaLyQiIvPj");
        nctsElecidentify.setSnbxh("TrMaVsVkUwGlSpSzOwYnZqSwOzUiCm");
        nctsElecidentify.setVersion(new Long("1"));

        nctsElecidentifyManager.save(nctsElecidentify);
    }

    public void testSearch() throws Exception {
        assertEquals(action.list(), ActionSupport.SUCCESS);
        assertTrue(action.getNctsElecidentifies().size() >= 1);
    }

    public void testEdit() throws Exception {
        log.debug("testing edit...");
        action.setIdentifyId("-1");
        assertNull(action.getNctsElecidentify());
        assertEquals("success", action.edit());
        assertNotNull(action.getNctsElecidentify());
        assertFalse(action.hasActionErrors());
    }

    public void testSave() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        ServletActionContext.setRequest(request);
        action.setIdentifyId("-1");
        assertEquals("success", action.edit());
        assertNotNull(action.getNctsElecidentify());

        NctsElecidentify nctsElecidentify = action.getNctsElecidentify();
        // update required fields
        nctsElecidentify.setApplyId("RzXdBjNdDpGzLkFeJeNiFlAhQyMaIfTx");
        nctsElecidentify.setCreateDate(new java.util.Date());
        nctsElecidentify.setIdentifyCode("MqCkEvEtIuOyCrZaMgOdCjQyFlLuWlAzBtTmOyJnGnWeGjTcBr");
        nctsElecidentify.setIsValid(758308768);
        nctsElecidentify.setSiteDomains("LpWdNsPuSiSyNcRiWwUeNsRoHuReLuKrAbFzRqDuQeHcKrStQxPjQnUeRfSxMxOgFbCjHdFqHyQeFkAnOtTkPmFsKmGiYyCdPfKsZoNhWwJbCrQoQyBmDpQeUdZmSnEqLvZoBbBoHiHlBfUcDxGwOlPdUoOgMtPeYeXiKaRrAbBrFbSyMxTmItMyGnOpSsRyAyRoBxKq");
        nctsElecidentify.setSnbxh("EdUpOsGrMvQqCnStLaVjBzWaDqBoQb");
        nctsElecidentify.setVersion(new Long("1"));

        action.setNctsElecidentify(nctsElecidentify);

        assertEquals("input", action.save());
        assertFalse(action.hasActionErrors());
        assertFalse(action.hasFieldErrors());
        assertNotNull(request.getSession().getAttribute("messages"));
    }

    public void testRemove() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        ServletActionContext.setRequest(request);
        action.setDelete("");
        NctsElecidentify nctsElecidentify = new NctsElecidentify();
        nctsElecidentify.setIdentifyId("-2");
        action.setNctsElecidentify(nctsElecidentify);
        assertEquals("success", action.delete());
        assertNotNull(request.getSession().getAttribute("messages"));
    }
}
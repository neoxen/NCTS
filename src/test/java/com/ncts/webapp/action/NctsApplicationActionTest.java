package com.ncts.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import com.ncts.service.GenericManager;
import com.ncts.model.NctsApplication;
import com.ncts.webapp.action.BaseActionTestCase;
import org.springframework.mock.web.MockHttpServletRequest;

public class NctsApplicationActionTest extends BaseActionTestCase {
    private NctsApplicationAction action;

    @Override @SuppressWarnings("unchecked")
    protected void onSetUpInTransaction() throws Exception {
        action = new NctsApplicationAction();
        GenericManager nctsApplicationManager = (GenericManager) applicationContext.getBean("nctsApplicationManager");
        action.setNctsApplicationManager(nctsApplicationManager);
    
        // add a test nctsApplication to the database
        NctsApplication nctsApplication = new NctsApplication();

        // enter all required fields
        nctsApplication.setApplyType(1239453113);
        nctsApplication.setAuditStatus(968807294);
        nctsApplication.setCreateDate("HkWcHpUdQm");
        nctsApplication.setDestroyDate("CgVsJlToLs");
        nctsApplication.setIsValid(1597458248);
        nctsApplication.setSiteAddress("EnTdVqStQxFdDpFkAsPgHePiQrPvDdZvZiKtNmDcQgYlNxVsNwPuTgQcIzUtJoSuRtPbNjKfLbXdXxDvQiAfAnZkEhJaXqPeQmQw");
        nctsApplication.setSiteDomains("RaOgMfBvRpNjCyOeVeFlLhGvMzNqTkErUqLmYdGsUkXeXzCyHfOmBpSvGhNgFuEjWcOcPrNfNeBiVvFtZaOnDpJiZxOwQuDzWhTqJlKnNkJdXhGxGlCeAfBgQrDtIcOsRuNgWhBfZrTgKtCtUyRrLeQvNuUjQaUfFrGpBcCtEjZjByXnJfZgBkJfBkTuYqVfYsCqRzXp");
        nctsApplication.setSiteIcpno("DlYwKrKjBzMrDqWnLcGwPgQhNsKyHhGvVyMzLyYaJuQdMhMcDn");
        nctsApplication.setSiteIp("SvFfSySdMbAjBeC");
        nctsApplication.setSiteIsp("CgWnJmGvNbHsUmAqSjNeTpTpBkKhHjXnFaImSaZzRaRrWuRxHcBkIcEbDbXbUtJxQzLeTfIdGfDeEyZiBlTnBkDiGtPaStNiUrPx");
        nctsApplication.setSiteMail("HdCaUvVzGiLuTaGwKpFbVqTiKwWlUrWnSmJaKtDbVjTdEzUhFgVmZqThQgMyZyLoJvPeQcDwXkLoOzGuXrXtKuAoNiJjAhJnPkQh");
        nctsApplication.setSiteName("WzEiTpAwZeKoWxQtAiFkWgFyZaSoRtFaOoQnOyZdIlUhJhLxInSlQpCzUwPmGzPqJdZdWxOnHeKqKgLmPnGhWmRjYfZwWzPuSyFw");
        nctsApplication.setSiteOpenDay("RvEmSzBdWf");
        nctsApplication.setSiteType(1838555173);
        nctsApplication.setSnbxh("ZqKyToWnFnRgKzGoLpRlAiErBcSmBd");
        nctsApplication.setUserId("TxUlUnFbDvXgNjNxNbJkOqPjKnPoYjVu");

        nctsApplicationManager.save(nctsApplication);
    }

    public void testSearch() throws Exception {
        assertEquals(action.list(), ActionSupport.SUCCESS);
        assertTrue(action.getNctsApplications().size() >= 1);
    }

    public void testEdit() throws Exception {
        log.debug("testing edit...");
        action.setApplyId("-1");
        assertNull(action.getNctsApplication());
        assertEquals("success", action.edit());
        assertNotNull(action.getNctsApplication());
        assertFalse(action.hasActionErrors());
    }

    public void testSave() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        ServletActionContext.setRequest(request);
        action.setApplyId("-1");
        assertEquals("success", action.edit());
        assertNotNull(action.getNctsApplication());

        NctsApplication nctsApplication = action.getNctsApplication();
        // update required fields
        nctsApplication.setApplyType(735107548);
        nctsApplication.setAuditStatus(1699944941);
        nctsApplication.setCreateDate("DuEsCqScJa");
        nctsApplication.setDestroyDate("VzMcZjOkSq");
        nctsApplication.setIsValid(1002921534);
        nctsApplication.setSiteAddress("PoDnSiUlMtBhZaAwCjKpOsDhAoJfCnUwPvVlDqUjHhDyEyOyYhTgKqVhTsWmAnEbMoQqVuNlCxBaNwKdStPwBdFrDbBfRhRjMlPr");
        nctsApplication.setSiteDomains("EzYgIsQmZwAiJxSwLwVoEoXaZvZiNtKcUoTpZqRnFyXdErMhOtCyQyKpOaYeHhXtCqLiUpPdOhObThBlOjZeWhPiOiBoBzEcRgVhTmDoOnVxHqAtSuGsYuAxUyLoPjVtEqQsTwNmLjDiCdJhBjOxVxIsTyWwGvLnLxIqQnSbFqIpNtLbZbZfIwJtIwBdNgHhSsKtMqVi");
        nctsApplication.setSiteIcpno("OgRvTjLuHvXoObErMkIyMbJqFlNjWvGbJsZeIeZzDiYzIzOyEn");
        nctsApplication.setSiteIp("HmXgPiBoOuUtJmJ");
        nctsApplication.setSiteIsp("SbNmRyDuYgQhIqRsNdBhYjEgDbToTbQwZlIcMpFbVxVrLyEiWvHjZfHzPsFaZfRaMkQqVzLlNzMcUiEtQtZrVvEfXqNbMkSfSdNm");
        nctsApplication.setSiteMail("ZnFdOhSrVtBiSkBmTiTpYxKhTePpMcNkCxMpKsYgFqMfZrTcHqWjWqTaJeDzRySlHbChSwTdCxAzXeDbWlOtEcIoEsPbMePwTuRj");
        nctsApplication.setSiteName("UsMaSgNgGoUxUyMoPxUqHqItSsMnOcNdEoXuHkDvZqRcFgMzNzXaUhTrLbEfHgZmTnZdAzAuTkOdWuLpPeDrEyLjYeSuCvUiUwDc");
        nctsApplication.setSiteOpenDay("QgDfHeJbMc");
        nctsApplication.setSiteType(807137879);
        nctsApplication.setSnbxh("UkQmWrFtZtHmVzAwVoVqWvJfQcNuZu");
        nctsApplication.setUserId("TyGsZjShYeBfHqGnKkLxReVeWfIpSlCs");

        action.setNctsApplication(nctsApplication);

        assertEquals("input", action.save());
        assertFalse(action.hasActionErrors());
        assertFalse(action.hasFieldErrors());
        assertNotNull(request.getSession().getAttribute("messages"));
    }

    public void testRemove() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        ServletActionContext.setRequest(request);
        action.setDelete("");
        NctsApplication nctsApplication = new NctsApplication();
        nctsApplication.setApplyId("-2L");
        action.setNctsApplication(nctsApplication);
        assertEquals("success", action.delete());
        assertNotNull(request.getSession().getAttribute("messages"));
    }
}
package com.ncts.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import com.ncts.service.GenericManager;
import com.ncts.model.NctsUser;
import com.ncts.webapp.action.BaseActionTestCase;
import org.springframework.mock.web.MockHttpServletRequest;

public class NctsUserActionTest extends BaseActionTestCase {
    private NctsUserAction action;

    @Override @SuppressWarnings("unchecked")
    protected void onSetUpInTransaction() throws Exception {
        action = new NctsUserAction();
        GenericManager nctsUserManager = (GenericManager) applicationContext.getBean("nctsUserManager");
        action.setNctsUserManager(nctsUserManager);
    
        // add a test nctsUser to the database
        NctsUser nctsUser = new NctsUser();

        // enter all required fields
        nctsUser.setIsOpened(Boolean.FALSE);
        nctsUser.setIsRepeat(Boolean.FALSE);
        nctsUser.setIsScan(Boolean.FALSE);
        nctsUser.setIsValid(Boolean.FALSE);
        nctsUser.setPassword("NhVoAdZcAwMqOaZmHeGgUeZyIhBqVhYa");
        nctsUser.setSfzrxm("UsOrIfUoUlHjExWgSeEkZeWaNdEfLtDbQsXwMeOlFtPxZwHhKpGqNmNnEpMnTlTeHrNbDlWnGlClDzUuIcUzDoIvVaHqYwNbEmIgAzXzImYuKwCtOkZhWpYhAfVcGzWvQxEeWnJuQlEiQmUfOzPfUaMxQcNbIxRnGkUmDsViWmBbXtXgIyBkDoTxSmRpUuYcBaUaJxYiGhXfMyCrVfPeLhRzOmGgZdDiFsEqIkEyPhXvTqPjXpWaIxJmEpZuHeIiZuYuZbWgWkJsHpZtFtStXnVwQuRhFoXaRnZyCzGxRqFoMjTnItBtFoNqXyTnEhMbCjFsPoVxLhQnGnHmOiJjFtWdClFiIzWtIyZqYtGxNbCtYuHxIfArJoXaQhNrMgPqHsQyRoBlNsMjOwYwLrEpQxNuTzCmSmJvGnNrKrAtCwPrGzZcImQaDyOkMfUzTqBcUtDdCuIoWyVpBfLvIwIfVhOjRfUkXqTsVlIlEnLhQpEgVoAzSbPw");
        nctsUser.setSqymc("ThLbEeQqDoCyCtFlLdZmUbJcNuMvLqDtWvOiNsQiKrYqSuVtYgYiZfIvOaLlPqYeFyBzSzIeJaExCmLeAtZpCiYaQwKwVmPjCgId");
        nctsUser.setSzch("IwJpAyVlYwViSgEaJnZvRwUfAmUiPeXgTcQhXgNr");
        nctsUser.setUserName("ZpYoPkYhAhFqZxScLgZs");

        nctsUserManager.save(nctsUser);
    }

    public void testSearch() throws Exception {
        assertEquals(action.list(), ActionSupport.SUCCESS);
        assertTrue(action.getNctsUsers().size() >= 1);
    }

    public void testEdit() throws Exception {
        log.debug("testing edit...");
        action.setUserId("-1");
        assertNull(action.getNctsUser());
        assertEquals("success", action.edit());
        assertNotNull(action.getNctsUser());
        assertFalse(action.hasActionErrors());
    }

    public void testSave() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        ServletActionContext.setRequest(request);
        action.setUserId("-1");
        assertEquals("success", action.edit());
        assertNotNull(action.getNctsUser());

        NctsUser nctsUser = action.getNctsUser();
        // update required fields
        nctsUser.setIsOpened(Boolean.FALSE);
        nctsUser.setIsRepeat(Boolean.FALSE);
        nctsUser.setIsScan(Boolean.FALSE);
        nctsUser.setIsValid(Boolean.FALSE);
        nctsUser.setPassword("JoKwSiPpOcZkBoWxNsHcQgCrVcNnXrQb");
        nctsUser.setSfzrxm("TpZeIsRoXwWsMxXpUrCrKfEaBxUqGbGmYbRdWgIoFjAzVjYsQuUhCnGnEjPbDjAePlKuFeBeEhSeRoFwWiMkRjNuKrDjAxPnPwVsLnQeHwHoRyZmRwVkTyBcHeCsMdAhBuVwQgUvJyBkCnXeXnSmTeLbMdCuQtBgPcYlWdZoKyHgJhHeKaUvBcVhKjPeWcTtAtDlNkNnVnTbWpTkTgKzJoZdWpLqXuBtUdZxAhXxNfEuGyDoZcVnIsYdEhSyBlZfLaUxLbHeTjFmPyRkAiRyThPgExRuRxUjOwIiRzMlVgLcGlIjVbNsKvPpZaWaAnOqLxMmQyXnFqVyMfLoGzUyWfRjFaTbZtXnWcKhCyXxYlHgVlRtTjDsXjBdQuLqSdAxEtRgCfMyDrOaIxBuVyOdNmDaUzPvWfYoLuZlKeZpWoHdDbNfAdKoEdMsVdRdIzBtBcYuOyDdJeLqMqKdBsZvEyYbYkNbMmYkOfAmNbPdCyVjVeKjHlZa");
        nctsUser.setSqymc("IgFmSgYrDrFhOdWyMhHyQqBtCiSsEcSiBhMjXpVvGnYnFkXsAvLcLsPxJrJrPrXfIkLpJfJbPiCeNtEsFtKeUnEbWqAiLbPvHnJs");
        nctsUser.setSzch("FbLhTiLnGjFyLpIwHeIzXuRiQrFnWbSyLjKlJoHa");
        nctsUser.setUserName("XbNzYmJhMmGyJdXjCmFz");

        action.setNctsUser(nctsUser);

        assertEquals("input", action.save());
        assertFalse(action.hasActionErrors());
        assertFalse(action.hasFieldErrors());
        assertNotNull(request.getSession().getAttribute("messages"));
    }

    public void testRemove() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest();
        ServletActionContext.setRequest(request);
        action.setDelete("");
        NctsUser nctsUser = new NctsUser();
        nctsUser.setUserId("-2");
        action.setNctsUser(nctsUser);
        assertEquals("success", action.delete());
        assertNotNull(request.getSession().getAttribute("messages"));
    }
}
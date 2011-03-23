package com.ncts.webapp.action;

import com.opensymphony.xwork2.Action;
import com.ncts.model.User;
import com.ncts.service.UserManager;

import org.subethamail.wiser.Wiser;

public class PasswordHintActionTest extends BaseActionTestCase {
    private PasswordHintAction action;
    private UserManager userManager;

    public void setUserManager(final UserManager userManager) {
        this.userManager = userManager;
    }

    public void setPasswordHintAction(final PasswordHintAction action) {
        this.action = action;
    }

    public void testExecute() throws Exception {
        // start SMTP Server
//        Wiser wiser = new Wiser();
//        wiser.setPort(getSmtpPort());
//        wiser.start();
//
        action.setUsername("user");
        assertEquals("success", action.execute());
        assertFalse(action.hasActionErrors());

        // verify an account information e-mail was sent
//        wiser.stop();
//        assertTrue(wiser.getMessages().size() == 1);

        // verify that success messages are in the request
        assertNotNull(action.getSession().getAttribute("messages"));
    }
    
    public void testExecuteNoUserName() throws Exception {
        action.setUsername(null);
        assertEquals(Action.INPUT, action.execute());
        assertTrue(action.hasActionErrors());
    }

    public void testExecuteWrongUserName() throws Exception {
        action.setUsername("UNKNOWN123");
        assertEquals(Action.INPUT, action.execute());
        assertTrue(action.hasActionErrors());
    }

    public void testExecuteNoPasswordHintUserName() throws Exception {
        action.setUsername("manager");
        final User user = userManager.getUserByUsername("admin");
        user.setPasswordHint("  ");
        userManager.save(user);
        assertEquals(Action.INPUT, action.execute());
        assertTrue(action.hasActionErrors());
        user.setPasswordHint(null);
        userManager.save(user);
        assertEquals(Action.INPUT, action.execute());
        assertTrue(action.hasActionErrors());
    }
}

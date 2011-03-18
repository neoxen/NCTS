package com.ncts.client;

import com.ncts.model.User;
import com.ncts.service.UserExistsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Neo
 * Date: 11-3-18
 * Time: 上午10:16
 * To change this template use File | Settings | File Templates.
 */
@WebService
public interface UserService {

    /**
     * Retrieves a user by userId.  An exception is thrown if user not found
     *
     * @param userId the identifier for the user
     * @return User
     */
    User getUser(String userId);

    /**
     * Finds a user by their username.
     * @param username the user's username used to login
     * @return User a populated user object
     * @throws org.springframework.security.core.userdetails.UsernameNotFoundException
     *         exception thrown when user not found
     */
    User getUserByUsername(String username) throws UsernameNotFoundException;

    /**
     * Retrieves a list of all users.
     * @return List
     */
    List<User> getUsers();

    /**
     * Saves a user's information
     *
     * @param user the user's information
     * @throws com.ncts.service.UserExistsException thrown when user already exists
     * @return updated user
     */
    User saveUser(User user) throws UserExistsException;

    /**
     * Removes a user from the database by their userId
     *
     * @param userId the user's id
     */
    void removeUser(String userId);
}


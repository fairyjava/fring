package com.fairyoo.fring.repository;

import com.fairyoo.fring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户
 *
 * @author MengYi at 2018-12-26 21:21
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * find By Name
     *
     * @param name name
     * @return User
     * @author by MengYi at 2018-12-26 21:29
     */
    User findByName(String name);

    /**
     * find By Name Or Email
     *
     * @param name  name
     * @param email email
     * @return User
     * @author by MengYi at 2018-12-26 21:28
     */
    User findByNameOrEmail(String name, String email);
}
package com.fairyoo.fring.repository;

import com.fairyoo.fring.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户
 *
 * @author MengYi at 2018-12-26 21:21
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    /**
     * find By Name
     *
     * @param name name
     * @return User
     * @author by MengYi at 2018-12-26 21:29
     */
    UserEntity findByName(String name);

    /**
     * find By Name Or Email
     *
     * @param name  name
     * @param email email
     * @return User
     * @author by MengYi at 2018-12-26 21:28
     */
    UserEntity findByNameOrEmail(String name, String email);
}

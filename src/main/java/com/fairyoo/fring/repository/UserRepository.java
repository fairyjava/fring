package com.fairyoo.fring.repository;

import com.fairyoo.fring.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

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


    /**
     * 删除
     *
     * @param id id
     * @author MengYi at 2018-12-24 15:50
     */
    @Override
    void deleteById(Long id);


    /**
     * 统计
     *
     * @param name name
     * @return Long
     * @author MengYi at 2018-12-24 15:51
     */
    Long countByName(String name);


    /**
     * 按手机查询用户是否存在
     *
     * @param phone 手机
     * @return boolean
     * @author MengYi at 2018-12-24 15:37
     */
    boolean existsByPhone(String phone);


    /**
     * 通过机构ids查找用户列表
     *
     * @param orgIds 机构ids
     * @return List<User>
     * @author MengYi at 2018-12-24 15:38
     */
    List<UserEntity> findByOrgIdIn(List<Long> orgIds);


    /**
     * 通过姓名模糊查询
     *
     * @param pageable 分页对象
     * @param name     姓名
     * @return Page<User>
     * @author MengYi at 2018-12-24 15:39
     */
    Page<UserEntity> findByNameLike(Pageable pageable, String name);


    /**
     * 按id更新orgId
     *
     * @param orgId 机构id
     * @param id    主键id
     * @author MengYi at 2018-12-24 15:42
     * Modifying
     * Transactional // 使用事务的标识
     * Query("update ...") // 用来执行Hql的查询语句，也可以执行删除和更新操作。
     * Query 里是删除或则更新操作就必须加，以通知Spring Data 这是一个DELETE或UPDATE操作
     */
    @Modifying
    @Transactional(rollbackOn = Exception.class)
    @Query("update UserEntity u set u.orgId = :orgId where u.id = :id")
    void updateOrgIdById(@Param(value = "orgId") Long orgId, @Param(value = "id") Long id);



}

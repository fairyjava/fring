package com.fairyoo.fring.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author MengYi at 2018-12-26 21:21
 */
@Data
@Entity
@Table(name = "User")
public class UserEntity {

    /**
     * 主键id
     *
     * @author by MengYi at 2018-12-26 21:24
    */
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 手机号
     *
     * @author by MengYi at 2018-12-26 21:25
    */
    @Column(name = "phone", nullable = false)
    private String phone;

    /**
     * 姓名
     *
     * @author by MengYi at 2018-12-26 21:25
     */
    @Column(name = "name", nullable = false)
    private String name;


    /**
     * 邮箱
     *
     * @author by MengYi at 2018-12-26 21:25
     */
    @Column(name = "email", nullable = false)
    private String email;


    /**
     * 机构id
     *
     * @author MengYi at 2018-12-24 15:07
     */
    @Column(name = "OrgId", nullable = false)
    private Long orgId;


    /**
     * 创建时间
     *
     * @author by MengYi at 2019-01-02 20:12
    */
    //@Column(name = "CreationTime")
    private Date creationTime;

    /**
     * 修改时间
     *
     * @author by MengYi at 2019-01-02 20:12
    */
    @Column(name = "LastModificationTime", nullable = false)
    private Date lastModificationTime;




//    public User() {
//        super();
//    }




}

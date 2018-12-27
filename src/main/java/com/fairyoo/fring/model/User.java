package com.fairyoo.fring.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author MengYi at 2018-12-26 21:21
 */
@Data
@Entity
@Table(name = "User")
public class User implements Serializable {

    /**
     * 主键id
     *
     * @author by MengYi at 2018-12-26 21:24
    */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 手机号
     *
     * @author by MengYi at 2018-12-26 21:25
    */
    @Column(name = "phone", nullable = false)
    private String phone;

    /**
     * name
     *
     * @author by MengYi at 2018-12-26 21:25
     */
    @Column(name = "name", nullable = false)
    private String name;


    /**
     * email
     *
     * @author by MengYi at 2018-12-26 21:25
     */
    @Column(name = "email", nullable = false)
    private String email;


    public User() {
        super();
    }




}

package com.fairyoo.fring.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 城市实体类
 *
 * @author MengYi at 2018-12-27 16:50
 */
@Data
@Entity
@Table(name = "city")
public class City implements Serializable {

    /**
     * 城市编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 省份编号
     */
    @Column(name = "province_id", nullable = false)
    private Long provinceId;

    /**
     * 城市名称
     */
    @Column(name = "city_name", nullable = false)
    private String cityName;

    /**
     * 描述
     */
    @Column(name = "description", nullable = false)
    private String description;
}

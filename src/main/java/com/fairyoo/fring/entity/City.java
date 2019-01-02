package com.fairyoo.fring.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "城市实体")
public class City implements Serializable {

    /**
     * 城市id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "")
    private Long id;

    /**
     * 省份id
     */
    @Column(name = "province_id", nullable = false)
    @ApiModelProperty(value = "省份id")
    private Long provinceId;

    /**
     * 城市名称
     */
    @Column(name = "city_name", nullable = false)
    @ApiModelProperty(value = "城市名称")
    private String cityName;

    /**
     * 描述
     */
    @Column(name = "description", nullable = false)
    @ApiModelProperty(value = "描述")
    private String description;
}

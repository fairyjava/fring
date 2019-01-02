package com.fairyoo.fring.web.dtoout;

import com.fairyoo.fring.entity.CityEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 城市dto
 *
 * @author MengYi at 2019-01-02 20:18
 */
@Data
@ApiModel(value = "城市")
public class CityOut implements Serializable {

    /**
     * 城市id
     */
    @ApiModelProperty(value = "城市id")
    private Long id;

    /**
     * 省份id
     */
    @ApiModelProperty(value = "省份id")
    private Long provinceId;

    /**
     * 城市名称
     */
    @ApiModelProperty(value = "城市名称")
    private String cityName;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;


    public CityOut(){}
    public CityOut(CityEntity model){

        this.id = model.getId();
        this.provinceId = model.getProvinceId();
        this.cityName = model.getCityName();
        this.description = model.getDescription();

    }
}

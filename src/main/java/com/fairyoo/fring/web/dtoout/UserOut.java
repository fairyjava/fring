package com.fairyoo.fring.web.dtoout;

import com.fairyoo.fring.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户dto
 *
 * @author MengYi at 2019-01-02 20:09
 */
@Data
@ApiModel(value = "用户")
public class UserOut implements Serializable {

    /**
     * 主键id
     *
     * @author by MengYi at 2018-12-26 21:24
     */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /**
     * 手机号
     *
     * @author by MengYi at 2018-12-26 21:25
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 姓名
     *
     * @author by MengYi at 2018-12-26 21:25
     */
    @ApiModelProperty(value = "name")
    private String name;


    /**
     * 邮箱
     *
     * @author by MengYi at 2018-12-26 21:25
     */
    @ApiModelProperty(value = "email")
    private String email;


    /**
     * 创建时间
     *
     * @author by MengYi at 2019-01-02 20:12
     */
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creationTime;


    /**
     * 修改时间
     *
     * @author by MengYi at 2019-01-02 20:12
     */
    @ApiModelProperty(value = "修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastModificationTime;

    public UserOut() {
    }

    public UserOut(UserEntity model) {

        this.id = model.getId();
        this.phone = model.getPhone();
        this.name = model.getName();
        this.email = model.getEmail();
        this.creationTime = model.getCreationTime();
        this.lastModificationTime = model.getLastModificationTime();
    }

}

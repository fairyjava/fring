package com.fairyoo.fring.web.controller;

import io.swagger.annotations.Api;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author MengYi at 2018-12-27 19:40
 */
@Api(tags ="Swagger", value = "")
@ApiIgnore
public class SwaggerController {

    //  swagger注解
    //    swagger通过注解表明该接口会生成文档，包括接口名、请求方法、参数、返回信息的等等。
    //
    //    @Api：修饰整个类，描述Controller的作用
    //    @ApiOperation：描述一个类的一个方法，或者说一个接口
    //    @ApiParam：单个参数描述
    //    @ApiModel：用对象来接收参数
    //    @ApiProperty：用对象接收参数时，描述对象的一个字段
    //    @ApiResponse：HTTP响应其中1个描述
    //    @ApiResponses：HTTP响应整体描述
    //    @ApiIgnore：使用该注解忽略这个API
    //    @ApiError ：发生错误返回的信息
    //    @ApiImplicitParam：一个请求参数
    //    @ApiImplicitParams：多个请求参数


    //@ApiImplicitParams：用在请求的方法上，包含一组参数说明
    //@ApiImplicitParam：用在 @ApiImplicitParams 注解中，指定一个请求参数的配置信息
    //    name：参数名
    //    value：参数的汉字说明、解释
    //    required：参数是否必须传
    //    paramType：参数放在哪个地方
    //	        · header --> 请求参数的获取：@RequestHeader
    //	        · query --> 请求参数的获取：@RequestParam
    //	        · path（用于restful接口）--> 请求参数的获取：@PathVariable
    //	        · body（不常用）
    //            · form（不常用）
    //    dataType：参数类型，默认String，其它值dataType="Integer"
    //    defaultValue：参数的默认值

    //@ApiImplicitParams示列：
    //    @ApiImplicitParams({
    //            @ApiImplicitParam(name="mobile",value="手机号",required=true,paramType="form"),
    //            @ApiImplicitParam(name="password",value="密码",required=true,paramType="form"),
    //            @ApiImplicitParam(name="age",value="年龄",required=true,paramType="form",dataType="Integer")
    //    })
    //【findAllByProvinceId(@ApiParam(name="provinceId",value="省份id",required=true) @RequestParam Long provinceId)】
}

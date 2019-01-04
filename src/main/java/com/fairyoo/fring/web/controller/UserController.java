package com.fairyoo.fring.web.controller;

import com.fairyoo.fring.web.service.UserService;
import com.fairyoo.fring.util.QueryResult;
import com.fairyoo.fring.web.dtoout.UserOut;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户管理
 *   https://www.bysocket.com/?p=1929
 *
 * @author MengYi at 2018-12-26 21:19
 */
@Api(tags ="用户管理", value = "")
@RestController
@RequestMapping(value = "/user/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    /**
     * 测试action
     *
     * @return String
     * @author MengYi at 2018-12-25 11:39
     * ApiOperation(value = "") swagger的注释，用于controller的方法上，表示接口的描述
     * GetMapping("") 是@RequestMapping(method = RequestMethod.POST)的缩写。
     */
    @ApiOperation(value = "测试action")
    @GetMapping("/getString")
    public String getString() {

        return "public String getString()";
    }


    /**
     * @author MengYi at 2018-12-25 11:40
     * Autowired // 从Spring 容器中 加载Bean
     */
    @Autowired
    private UserService userService;


    /**
     * 创建用户
     *
     * @param userCreateDto userCreateDto
     * @return UserResultDto
     * @author MengYi at 2018-12-25 11:39
     * ApiOperation(value = "") swagger的注释，用于controller的方法上，表示接口的描述
     * PostMapping("") @RequestMapping(method = RequestMethod.POST)的缩写。
     */
    @ApiOperation(value = "创建用户")
    @PostMapping("/user")
    public UserOut creteUser(@RequestBody UserOut userCreateDto) {

        return userService.createUser(userCreateDto);
    }


    /**
     * 获得用户分页列表，通过姓名模糊查询
     *
     * @param name      name
     * @param pageIndex pageIndex
     * @param pageSize  pageSize
     * @return QueryResult<UserResultDto>
     * @author MengYi at 2018-12-25 11:45
     * ApiOperation(value = "") swagger的注释，用于controller的方法上，表示接口的描述
     * GetMapping("") 是@RequestMapping(method = RequestMethod.POST)的缩写。
     */
    @ApiOperation(value = "获得用户分页列表，通过姓名模糊查询")
    @GetMapping("/users/page")
    public QueryResult<UserOut> getUserPageByName(
            @RequestParam("name") String name,
            @RequestParam(value = "pageIndex", defaultValue = "1") int pageIndex,
            @RequestParam(value = "pageSize", defaultValue = "20") int pageSize) {

        return userService.getUserPageByName(name, pageIndex, pageSize);
    }


    /**
     * 通过机构ids获得用户列表
     *
     * @param orgIds orgIds
     * @return List<UserResultDto>
     * @author MengYi at 2018-12-25 11:52
     * ApiOperation(value = "") swagger的注释，用于controller的方法上，表示接口的描述
     * GetMapping("") 是@RequestMapping(method = RequestMethod.POST)的缩写。
     */
    @ApiOperation(value = "通过机构ids获得用户列表")
    @GetMapping("/users/org")
    public List<UserOut> getUsersByOrgIds(@RequestParam("orgIds") String orgIds) {
        return userService.getUserListByOrgIds(orgIds);
    }


    /**
     * 根据Id删除用户
     *
     * @param id id
     * @author MengYi at 2018-12-25 14:57
     */
    @ApiOperation(value = "根据Id删除用户")
    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }


    /**
     * 根据Id查询用户详情
     *
     * @param id id
     * @return UserDetailResultDto
     * @author MengYi at 2018-12-25 14:58
     */
    @ApiOperation(value = "根据Id查询用户详情")
    @GetMapping("/user/{id}")
    public UserOut getUserById(@PathVariable("id") Long id) {
        return userService.getUserDetail(id);
    }


    /**
     * 更新用户信息
     *
     * @param userUpdateDto userUpdateDto
     * @return UserResultDto
     * @author MengYi at 2018-12-25 14:59
     */
    @ApiOperation(value = "更新用户信息")
    @PutMapping("/user")
    public UserOut updateUser(@RequestBody UserOut userUpdateDto) {
        return userService.updateUser(userUpdateDto);
    }


    /**
     * 更新用户机构信息
     *
     * @param userUpdateOrgDto userUpdateOrgDto
     * @author MengYi at 2018-12-25 14:59
     */
    @ApiOperation(value = "更新用户机构信息")
    @PutMapping("/user/org")
    public void updateUserOrg(@RequestBody UserOut userUpdateOrgDto) {
        userService.updateOrgIdById(userUpdateOrgDto.getId(), userUpdateOrgDto.getOrgId());
    }

}

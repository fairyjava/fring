package com.fairyoo.fring.web.service;

/**
 * @author MengYi at 2019-01-04 10:15
 */

import com.fairyoo.fring.entity.UserEntity;
import com.fairyoo.fring.repository.UserRepository;
import com.fairyoo.fring.util.QueryResult;
import com.fairyoo.fring.web.dtoout.UserOut;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户Service接口
 * Service层主要是引用数据访问层的方法进行业务逻辑处理。返回Controller 需要的DTO 对象。
 * 在service层，userRepository.save(user); 就能完成保存操作。这就是Spring Data JPA 的魔法部分
 *
 * @author MengYi at 2018-12-24 15:55
 * Service // 每个Service类都需要用@Service 标签声明。
 */
@Service
public class UserService {

    private UserRepository userRepository;

    /**
     * 构造函数
     * 通过@Autowired 引用数据访问层。
     *
     * @author MengYi at 2018-12-24 15:57
     * Autowired // 从Spring 容器中 加载Bean
     */
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    /**
     * 使用Lombok
     * https://blog.csdn.net/v2sking/article/details/73431364
     *
     * @author MengYi at 2018-12-24 16:26
     */
    private void varLombok() {

        // final : 跟swift的let 一样，使用final之后变量不能重新赋值

        //使用Lombok ，java也能够像javascript一样使用弱类型定义变量了
        //val注解变量申明是final类型 [val]
        //var注解变量是非final类型   [var]

        //@NonNull：ombok将生成一个空值检查语句。对象为空则抛异常：throw new NullPointerException("person");

        //@Cleanup InputStream in = new FileInputStream(..); //@Cleanup 能够自动释放io资源

        //@Getter/@Setter


//        //翻译后: final ArrayList<String> example = new ArrayList<String>();
//        val example = new ArrayList<String>();
//        example.add("Hello, World!");
//
//        val fool = example.get(0);
//        System.out.println("fool" + fool);
//
//        // 翻译后:  final HashMap<Integer, String> map = new HashMap<Integer, String>();
//        val map = new HashMap<Integer, String>(2) {
//
//        };
//        map.put(0, "zero");
//        map.put(5, "five");
//        for (final Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
//        }


    }


    /**
     * 创建用户
     *
     * @param userDto 创建用户dto
     * @return 返回的用户DTO对象
     * @author MengYi at 2018-12-24 16:33
     */
    public UserOut createUser(UserOut userDto) {

        var user = new UserEntity();
        user.setId(0L);
        user.setPhone(userDto.getPhone());
        user.setOrgId(userDto.getOrgId());
        user.setCreationTime(new Date());
        user.setLastModificationTime(new Date());

        // 判断手机是否存在
//        val exists = userRepository.existsByPhone(user.getPhone());
//        if (exists) {
//            throw new MyException(ResultCodeEnum.ERROR_USER_MOBILE_IS_EXISTS);
//        }

        userRepository.save(user);

        var resultDto = new UserOut(user);
        return resultDto;
    }


    /**
     * 更新用户
     *
     * @param userDto 更新用户dto
     * @return 返回的用户DTO对象
     * @author MengYi at 2018-12-25 10:36
     */
    public UserOut updateUser(UserOut userDto) {

        var userOptional = userRepository.findById(userDto.getId());
//        if (!userOptional.isPresent()) {
//            throw new MyException(ResultCodeEnum.ERROR_USER_IS_NOT_FOUND);
//        }
        var user = userOptional.get();
        user.setOrgId(userDto.getOrgId());

        userRepository.save(user);

        var resultDto = new UserOut(user);
        return resultDto;
    }

    /**
     * 删除用户
     *
     * @param id id
     * @author MengYi at 2018-12-25 11:07
     */
    public void deleteUser(Long id) {

        userRepository.deleteById(id);
    }


    /**
     * 获得用户详情页DTO
     *
     * @param id id
     * @return 用户详情页DTO
     * @author MengYi at 2018-12-25 11:09
     */
    public UserOut getUserDetail(Long id) {

        var userOptional = userRepository.findById(id);
//        if (!userOptional.isPresent()) {
//            throw new MyException(ResultCodeEnum.ERROR_USER_IS_NOT_FOUND);
//        }
        var user = userOptional.get();

        var resultDto = new UserOut(user);
        return resultDto;
    }


    /**
     * 通过姓名模糊查询分页列表
     *
     * @param name 姓名
     * @param pageIndex pageIndex
     * @param pageSize  pageSize
     * @return QueryResult<UserResultDto>
     * @author MengYi at 2018-12-25 11:18
     */
    public QueryResult<UserOut> getUserPageByName(String name, int pageIndex, int pageSize) {

        Pageable pageable = PageRequest.of(pageIndex, pageSize, Sort.Direction.DESC, "creationTime");

        Page<UserEntity> userPage = userRepository.findByNameLike(pageable, "%" + name + "%");
        List<UserEntity> userList = userPage.getContent();
        List<UserOut> userResultDtoList = userList.stream().map(e -> new UserOut(e)).collect(Collectors.toList());

        return new QueryResult((int) userPage.getTotalElements(), userResultDtoList);
    }


    /**
     * 通过机构ids获得用户列表
     *
     * @param orgIdsStr orgIdsStr
     * @return 通过机构ids获得用户列表
     * @author MengYi at 2018-12-25 11:51
     */
    public List<UserOut> getUserListByOrgIds(String orgIdsStr) {

        //字符串数组转换为集合
        List<Long> orgIds = Arrays.stream(orgIdsStr.split(","))
                .map(Long::parseLong)
                .collect(Collectors.toList());

        List<UserEntity> userList = userRepository.findByOrgIdIn(orgIds);

        return userList.stream().map(e -> new UserOut(e)).collect(Collectors.toList());
    }


    /**
     * 更新用户的机构
     *
     * @param id    用户主键
     * @param orgId 机构id
     * @author MengYi at 2018-12-25 11:22
     */
    public void updateOrgIdById(Long id, Long orgId) {
        userRepository.updateOrgIdById(orgId, id);
    }


}

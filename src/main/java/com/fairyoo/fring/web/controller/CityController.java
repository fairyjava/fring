package com.fairyoo.fring.web.controller;

import com.fairyoo.fring.entity.CityEntity;
import com.fairyoo.fring.repository.CityRepository;
import com.fairyoo.fring.web.dtoout.CityOut;
import io.swagger.annotations.*;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 城市管理
 *
 * @author MengYi at 2018-12-27 17:00
 */
@Api(tags = "城市管理", value = "城市管理")
@RestController
@RequestMapping(value = "/fring/api/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    /**
     * 按id获取单个城市
     *
     * @param id id
     * @return 城市实体
     * @author by MengYi at 2018-12-27 20:08
     */
    @ApiOperation(value = "按id获取单个城市")
    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
    public CityOut findOneCity(@PathVariable("id") Long id) {

        var cityEntityOptional = cityRepository.findById(id);
        //throw new MyException(ResultCodeEnum.ERROR_USER_IS_NOT_FOUND);
        var city = cityEntityOptional.get();

        return new CityOut(city);
    }

    /**
     * 按provinceId查询城市列表
     *
     * @param provinceId 省份id
     * @return 城市实体列表
     * @author by MengYi at 2018-12-27 20:08
     * 【findAllByProvinceId(@ApiParam(name="provinceId",value="省份id",required=true) @RequestParam Long provinceId)】
     */
    @ApiOperation(value = "按provinceId查询城市列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "provinceId", value = "省份id", required = true, paramType = "query", dataType = "Long", defaultValue = "2")
    })
    @RequestMapping(value = "/citys", method = RequestMethod.GET)
    public List<CityOut> findAllByProvinceId(@RequestParam Long provinceId) {

        var list = cityRepository.findAllByProvinceId(provinceId);

        redisTemplate.opsForList().leftPush("user:list", list.toString());
        stringRedisTemplate.opsForValue().set("user:name", "张三");

        var outs = list.stream().map(CityOut::new).collect(Collectors.toList());
        return outs;
    }

    /**
     * 新增城市实体
     *
     * @param dto 城市实体
     * @author by MengYi at 2018-12-27 20:08
     */
    @ApiOperation(value = "新增城市实体")
    @RequestMapping(value = "/city", method = RequestMethod.POST)
    public void createCity(@RequestBody CityOut dto) {

        var model = new CityEntity();
        model.setId(0L);
        model.setCityName(dto.getCityName());
        model.setDescription(dto.getDescription());
        model.setProvinceId(dto.getProvinceId());

        cityRepository.save(model);
    }

    /**
     * 修改城市实体
     *
     * @param dto 城市实体
     * @author by MengYi at 2018-12-27 20:07
     */
    @ApiOperation(value = "修改城市实体")
    @RequestMapping(value = "/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody CityEntity dto) {

        var model = new CityEntity();
        model.setId(dto.getId());
        model.setCityName(dto.getCityName());
        model.setDescription(dto.getDescription());
        model.setProvinceId(dto.getProvinceId());

        cityRepository.save(model);
    }

    /**
     * 按id删除城市
     *
     * @param id 主键id
     * @author by MengYi at 2018-12-27 20:07
     */
    @ApiOperation(value = "按id删除城市")
    @RequestMapping(value = "/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityRepository.deleteById(id);
    }
}

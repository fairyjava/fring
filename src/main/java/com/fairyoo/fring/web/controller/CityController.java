package com.fairyoo.fring.web.controller;

import com.fairyoo.fring.model.City;
import com.fairyoo.fring.repository.CityRepository;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 城市管理
 *
 * @author MengYi at 2018-12-27 17:00
 */
@Api(tags = "城市管理", value = "")
@RestController
@RequestMapping(value = "/fring/api/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CityController {

    @Autowired
    private com.fairyoo.fring.repository.CityRepository cityRepository;


    /**
     * 按id获取单个城市
     *
     * @param
     * @return 城市实体
     * @author by MengYi at 2018-12-27 20:08
     */
    @ApiOperation(value = "按id获取单个城市")
    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        City city = cityRepository.findById(id).get();
        return city;
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
    public List<City> findAllByProvinceId(@RequestParam Long provinceId) {
        return cityRepository.findAllByProvinceId(provinceId);
    }

    /**
     * 新增城市实体
     *
     * @param city 城市实体
     * @author by MengYi at 2018-12-27 20:08
     */
    @ApiOperation(value = "新增城市实体")
    @RequestMapping(value = "/city", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        cityRepository.save(city);
    }

    /**
     * 修改城市实体
     *
     * @param city 城市实体
     * @author by MengYi at 2018-12-27 20:07
     */
    @ApiOperation(value = "修改城市实体")
    @RequestMapping(value = "/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityRepository.save(city);
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

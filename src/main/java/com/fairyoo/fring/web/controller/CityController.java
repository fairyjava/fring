package com.fairyoo.fring.web.controller;

import com.fairyoo.fring.model.City;
import com.fairyoo.fring.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 城市
 *
 * @author MengYi at 2018-12-27 17:00
 */
@RestController
@RequestMapping(value = "/fring/api/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CityController {

    @Autowired
    private com.fairyoo.fring.repository.CityRepository cityRepository;

    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        City city = cityRepository.findById(id).get();
        return city;
    }

    @RequestMapping(value = "/citys?provinceId", method = RequestMethod.GET)
    public List<City> findAllCity(@RequestParam Long provinceId) {
        return cityRepository.findAllByProvinceId(provinceId);
    }

    @RequestMapping(value = "/city", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        cityRepository.save(city);
    }

    @RequestMapping(value = "/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityRepository.save(city);
    }

    @RequestMapping(value = "/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityRepository.deleteById(id);
    }
}

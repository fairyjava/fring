package com.fairyoo.fring.repositoryTest;

import com.fairyoo.fring.model.City;
import lombok.var;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author MengYi at 2018-12-27 17:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {


    @Autowired
    private com.fairyoo.fring.repository.CityRepository cityRepository;

    @Test
    public void findOneCity() throws Exception {

        var cityOptional = cityRepository.findById(1L);
        var city = !cityOptional.isPresent() ? null : cityOptional.get();
    }


    @Test
    public void findAllCity() throws Exception {
        var citys = cityRepository.findAllByProvinceId(1L);
    }


    @Test
    public void createCity() throws Exception {
        var city = new City();
        city.setId(2L);
        city.setCityName("sdfdsf");
        city.setDescription("dsgsdg sdsd ");
        city.setProvinceId(2L);
        cityRepository.save(city);
    }


    @Test
    public void modifyCity() throws Exception {
        var city = new City();
        city.setId(2L);
        city.setCityName("sdfdsf");
        city.setDescription("dsgsdg sdsd ");
        city.setProvinceId(2L);
        cityRepository.save(city);
    }


    @Test
    public void deleteById() throws Exception {
        var citys = cityRepository.findAll();
        if (citys != null && citys.isEmpty() == false) {
            var first = citys.get(0);
            cityRepository.deleteById(first.getId());
        }

    }

}
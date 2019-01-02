package com.fairyoo.fring.repository;

import com.fairyoo.fring.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * 城市
 *
 * @author MengYi at 2018-12-27 16:50
 */
public interface CityRepository extends JpaRepository<City, Long> {

    /**
     * 获取城市信息列表
     * @param provinceId provinceId
     * @return List<City>
     */
    List<City> findAllByProvinceId(long provinceId);

    /**
     * 根据城市 ID，获取城市信息
     *
     * @param id id
     * @return Optional<City>
     */
    @Override
    Optional<City> findById(@Param("id") Long id);

    /**
     * 新增|修改
     *
     * @param city city
     * @return Long
     * @author by MengYi at 2018-12-27 16:58
    */
    @Override
    City save(City city);



    /**
     * 删除
     *
     * @param id id
     * @author by MengYi at 2018-12-27 16:57
     */
    @Override
    void deleteById(Long id);
}

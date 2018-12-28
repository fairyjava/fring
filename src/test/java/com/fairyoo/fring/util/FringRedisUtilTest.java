//package com.fairyoo.fring.util;
//
//import com.fairyoo.fring.model.City;
//import lombok.var;
//import org.assertj.core.api.Assertions;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
///**
// * @author MengYi at 2018-12-28 15:38
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class FringRedisUtilTest {
//
//    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//
//    @Autowired
//    FringRedisUtil redisUtil;
//
//    /**
//     * @auther: zhangyingqi
//     * @date: 16:23 2018/8/29
//     * @param: []
//     * @return: org.springframework.ui.ModelMap
//     * @Description: 执行redis写/读/生命周期
//     */
//    public void getRedis(){
//        redisUtil.set("20182018","这是一条测试数据", 1);
//        Long resExpire = redisUtil.expire("20182018", 60, 1);//设置key过期时间
//        logger.info("resExpire="+resExpire);
//        String res = redisUtil.get("20182018", 1);
//
//        //测试Redis保存对象
//        var u = new City();
//        u.setProvinceId(24L);
//        u.setCityName("冯绍峰");
//        redisUtil.set("user:1", u.toString(), 1);
//
//        var c = redisUtil.get("user:1",1);
//
//
//        Assertions.assertThat(true);
//    }
//
//}

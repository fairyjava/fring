package com.fairyoo.fring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * fring application
 *
 * @author by MengYi at 2018-12-26 15:22
*/
@EnableScheduling //@Scheduled(fixedRate)如何保证固定速度执行? 为了保证fixedRate任务真的可以按照设置的速度执行，无疑需要引入异步执行模式，确保schedule调度的任务不会被单线程执行阻塞。这里引入注解@EnableAsync和@Async。
@EnableAsync      //@Scheduled(fixedRate)如何保证固定速度执行? 为了保证fixedRate任务真的可以按照设置的速度执行，无疑需要引入异步执行模式，确保schedule调度的任务不会被单线程执行阻塞。这里引入注解@EnableAsync和@Async。
@SpringBootApplication
@ServletComponentScan
public class FringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FringApplication.class, args);
        System.out.println("服务启动URL地址：http://localhost:9002/swagger-ui.html");


        //TODO springboot整合shiro-登录认证和权限管理 http://www.ityouknow.com/springboot/2017/06/26/springboot-shiro.html
        //TODO 邮件服务  http://www.ityouknow.com/springboot/2017/05/06/springboot-mail.html
        //TODO Spring boot中mongodb的使用  http://www.ityouknow.com/springboot/2017/05/08/springboot-mongodb.html
        //TODO linux搭建分布式文件系统FastDFS并整合spring boot   https://blog.csdn.net/xcg132566/article/details/79163790


        //TODO nginx

    }

}


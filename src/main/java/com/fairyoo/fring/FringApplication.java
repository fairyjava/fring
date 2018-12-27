package com.fairyoo.fring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * fring application
 *
 * @author by MengYi at 2018-12-26 15:22
*/
@SpringBootApplication
@ServletComponentScan
public class FringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FringApplication.class, args);
        System.out.println("服务启动URL地址：http://localhost:9002/demo/v1/hello");
    }

}


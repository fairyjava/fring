package com.fairyoo.fring.configs;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * application.properties中：com.fairyoo.fring
 * 配置在application.properties中
 *
 * @author MengYi at 2018-12-26 14:12
 * Component和@Configuration作为配置类的差别： https://blog.csdn.net/long476964/article/details/80626930
 */
@Data
@Component
public class FringPropertyComponent {

    @Value("${com.fairyoo.fring.name}")
    private String name;


    @Value("${com.fairyoo.fring.description}")
    private String description;

}

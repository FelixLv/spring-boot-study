package org.felix.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/23
 * Time: 下午1:32
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ApplicationWithBusinessException {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationWithBusinessException.class,args);
    }
}

package org.felix.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/23
 * Time: 下午5:11
 */
@Configuration
@EnableAutoConfiguration
public class ApplicationWithCustomBanner {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationWithCustomBanner.class,args);
    }
}

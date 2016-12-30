package org.felix.spring.boot;

import org.felix.spring.boot.listeners.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/29
 * Time: 下午5:10
 */
@SpringBootApplication
public class ApplicationWithCustomListeners {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApplicationWithCustomListeners.class);
        application.addListeners(new ApplicationStartedEventListener());
        application.addListeners(new ApplicationEnvironmentPreparedEventListener());
        application.addListeners(new ApplicationPreparedEventListener());
        application.addListeners(new ApplicationReadyEventListener());
        application.addListeners(new ApplicationFailedEventListener());
        application.run(args);
    }
}

package org.felix.spring.boot.listeners;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/29
 * Time: 下午5:12
 */
public class ApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent>{
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("trigger application started event");
    }
}

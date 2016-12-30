package org.felix.spring.boot.listeners;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/29
 * Time: 下午5:21
 */
public class ApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent>{
    @Override
    public void onApplicationEvent(ApplicationFailedEvent applicationFailedEvent) {
        System.out.println("trigger application failed event");
    }
}

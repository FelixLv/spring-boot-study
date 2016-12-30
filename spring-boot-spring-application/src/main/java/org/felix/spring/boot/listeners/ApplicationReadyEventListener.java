package org.felix.spring.boot.listeners;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/29
 * Time: 下午5:20
 */
public class ApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent>{
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("trigger application ready event");
    }
}

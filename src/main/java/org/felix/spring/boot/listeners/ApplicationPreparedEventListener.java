package org.felix.spring.boot.listeners;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/29
 * Time: 下午5:20
 */
public class ApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent>{
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        System.out.println("trigger application prepared event");
    }
}

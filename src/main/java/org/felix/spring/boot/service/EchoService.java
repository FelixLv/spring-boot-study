package org.felix.spring.boot.service;

import org.felix.spring.boot.exception.BusinessException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/23
 * Time: 下午1:53
 */
@Component
public class EchoService implements InitializingBean{
    @Override
    public void afterPropertiesSet() throws Exception {
        throw new BusinessException("business exception");
    }
}

package org.felix.spring.boot.exception;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/23
 * Time: 下午1:20
 */
public class BusinessException extends RuntimeException {

    public BusinessException(String msg){
        super(msg);
    }
}

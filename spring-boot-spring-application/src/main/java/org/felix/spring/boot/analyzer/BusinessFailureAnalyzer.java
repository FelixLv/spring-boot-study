package org.felix.spring.boot.analyzer;

import org.felix.spring.boot.exception.BusinessException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/23
 * Time: 下午1:22
 */
public class BusinessFailureAnalyzer extends AbstractFailureAnalyzer<BusinessException> {
    BusinessFailureAnalyzer(){

    }

    @Override
    protected FailureAnalysis analyze(Throwable throwable, BusinessException e) {
        return new FailureAnalysis("business description","business action",e);
    }
}

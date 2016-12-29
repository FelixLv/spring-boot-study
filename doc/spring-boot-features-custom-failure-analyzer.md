### 自定义FailureAnalyzer

#### Step1:自定义异常
```java
public class BusinessException extends RuntimeException {

    public BusinessException(String msg){
        super(msg);
    }
}
```
#### Step2:自定义FailureAnalyzer
```java
public class BusinessFailureAnalyzer extends AbstractFailureAnalyzer<BusinessException> {
    BusinessFailureAnalyzer(){

    }

    @Override
    protected FailureAnalysis analyze(Throwable throwable, BusinessException e) {
        return new FailureAnalysis("business description","business action",e);
    }
}
```
#### Step3:配置FailureAnalyzer
```
org.springframework.boot.diagnostics.FailureAnalyzer=\
org.felix.spring.boot.analyzer.BusinessFailureAnalyzer
```
#### Step4:定义一个Service被Spring初始化抛出该异常
```java
@Component
public class EchoService implements InitializingBean{
    @Override
    public void afterPropertiesSet() throws Exception {
        throw new BusinessException("business exception");
    }
}
```
#### Step5:构建一个Spring Application
```java
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class ApplicationWithBusinessException {
    public static void main(String[] args) {
   SpringApplication.run(ApplicationWithBusinessException.class,args);
    }
}
```
#### Step6:运行Spring Application
```
***************************
APPLICATION FAILED TO START
***************************

Description:

business description

Action:

business action
```

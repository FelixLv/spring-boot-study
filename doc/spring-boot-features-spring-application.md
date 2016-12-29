# 快速构建你的第一个SpringApplication

`SpringApplication`提供了一种最简单的方式来启动应用，那就是通过`main`函数，只需要一行代码就可以启动应用。

```java
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
```

运行`main`函数，会输出如下信息

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.4.2.RELEASE)

2016-12-23 11:33:32.897  INFO 46716 --- [           main] org.felix.spring.boot.Application        : Starting Applicationwith PID 46716
2016-12-23 11:33:35.251  INFO 46716 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
2016-12-23 11:33:35.268  INFO 46716 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.6
2016-12-23 11:33:37.305  INFO 46716 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2016-12-23 11:33:37.312  INFO 46716 --- [           main] org.felix.spring.boot.Application        : Started Application in 6.004 seconds (JVM running for 6.987)
```

这里省略了一些信息的输出，从这些输出的信息可以看到

*     Spring Boot的版本
*     Spring Boot内置了一个`Apache Tomcat/8.5.6`的Tomcat
*     默认的启动端口为`8080`
*     默认的日志输出级别为`INFO`
*     Spring Application启动的进程(`PID`)为46716

## 启动时失败
### FailureAnalyzer
`Spring Boot`从`1.4`版本之后新增了`FailureAnalyzer`接口，它可以拦截异常，并将其转换为更易读的诊断信息。比如当`Spring Application`试图使用已被占用的端口时，将显示如下信息

```
***************************
APPLICATION FAILED TO START
***************************

Description:

The Tomcat connector configured to listen on port 8196 failed to start. The port may already be in use or the connector may be misconfigured.

Action:

Verify the connector's configuration, identify and stop any process that's listening on port 8196, or configure this application to listen on another port.
```

`Spring Boot-1.4.2-RELEASE`版本内置了以下几个`FailureAnalyzer`

* `BeanCurrentlyInCreationFailureAnalyzer`
* `BeanNotOfRequiredTypeFailureAnalyzer`
* `BindFailureAnalyzer`
* `ConnectorStartFailureAnalyzer`
* `NoUniqueBeanDefinitionFailureAnalyzer`
* `PortInUseFailureAnalyzer`
* `ValidationExceptionFailureAnalyzer`

你可以从`spring-boot-1.4.2-RELEASE.jar`里的`META-INF/spring.factories`找到上述几个`FailureAnalyzer`

### FailureAnalyzer小结
* `Spring Application`默认是开启`FailureAnalyzer`的，并没有提供关闭的配置
* `FailureAnalyzer`的配置只能通过配置文件注入
* 如果你没有为异常定义自己的`FailureAnalyzer`,你仍然可以通过`--debug`来打印诊断信息，比如`java -jar myproject-0.0.1-SNAPSHOT.jar --debug`

## 自定义Banner
## 自定义SpringApplication
## 流式构建的API(Fluent builder API)
## 事件与监听
## WebEnvironment
## 获取Spring Application运行时的参数
## 自定义Runner
## 应用退出
## Admin功能





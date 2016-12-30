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
## 应用事件和监听器

除了通常的Spring框架的事件，比如`ContextRefreshedEvent`，一个`SpringApplication`还会发送一些额外的应用事件。

> 你不能使用`@Bean`去注册一个监听器去监听在`ApplicationContext`被创建之前触发的那些事件上。你可以通过`SpringApplication.addListeners(…​)`或者`SpringApplicationBuilder.listeners(…​)`来注册。
> 如果你想自动注册这些监听器不管应用以何种方式启动，你可以在你的工程下创建一个文件`META-INF/spring.factories`，然后引用以下配置
```
org.springframework.context.ApplicationListener=com.example.project.MyListener
```

当你的应用程序运行时，应用事件按下列顺序发送：
1. `ApplicationStartedEvent`:启动时发送该事件
2. `ApplicationEnvironmentPreparedEvent`:`Environment`加载完成，但是上下文未创建发送该事件
3. `ApplicationPreparedEvent`:上下文加载完成，但是spring bean未加载完成发送该事件
4. `ApplicationReadyEvent`:启动完成发送该事件，整个应用程序处于就绪状态
5. `ApplicationFailedEvent`:启动时异常发送该事件

## WebEnvironment
## 获取应用程序启动时的参数
如果你使用`SpringApplication.run(Application.class,args)`来启动一个`Spring Application`，然后你又希望你在自己定义的`Bean`里用到这些参数，那么你可以通过注入一个`ApplicationArguments`来获取，`ApplicationArguments`提供了各种各样的方式来获取参数。

```java
import org.springframework.boot.*
import org.springframework.beans.factory.annotation.*
import org.springframework.stereotype.*

@Component
public class MyBean {

    @Autowired
    public MyBean(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();
        // if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
    }

}
```

当然，`Spring Boot`会根据`Environment`来注册一个`CommandLinePropertySource`，你可以通过`@Value`来获取
## 使用`ApplicationRunner`或者`CommandLineRunner`

如果你想在`Spring Application`启动时运行自己的一些代码，你可以自己定义一个`Bean`，实现接口`ApplicationRunner`或者`CommandLineRunner`。`Spring Application`会在`SpringApplication.run(…​)`之前去调用他们。

`ApplicationRunner`和`CommandLineRunner`的区别在于`ApplicationRunner`使用了`String... args`作为参数，`ApplicationRunner`使用了`ApplicationArguments`作为参数。

```java
import org.springframework.boot.*
import org.springframework.stereotype.*

@Component
public class MyBean implements CommandLineRunner {

    public void run(String... args) {
        // Do something...
    }

}
```

如果你定义了多个`Runner`，然后又希望他们是有序去执行的，两种方式供你选择

* 实现接口`org.springframework.core.Ordered`
* 使用注解`org.springframework.core.annotation.Order`

## 优雅退出

任何一个`Spring Application`都会向`JVM`注册一个`Shutdown Hook`以便`ApplicationContext`在`Spring Application`退出的时候能够优雅的关闭。

* 实现接口`DisposableBean`
* 使用注解`@PreDestroy`
* 实现接口`org.springframework.boot.ExitCodeGenerator`，在`Spring Application`退出的时候能返回自己定义的`exit code`

## Admin功能





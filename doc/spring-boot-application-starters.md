# Spring Boot application starters

http://docs.spring.io/spring-boot/docs/1.4.2.RELEASE/reference/html/using-boot-build-systems.html#using-boot-starter

## Database

| Name | Description | Pom  |
| --- | --- | --- |
|`spring-boot-starter-data-redis`|集成了`Spring Data Redis`和[redis](https://redis.io/),`redis`是一种`NoSQL`数据库|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-data-redis/pom.xml)|
|`spring-boot-starter-data-mongodb`|集成了`Spring Data MongoDB`和[mongodb](https://www.mongodb.com/),`mongodb`是一种`NoSQL`数据库|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-data-mongodb/pom.xml)|
|`spring-boot-starter-data-neo4j`|集成了`Spring Data Neo4j`和[Neo4j](https://neo4j.com/),`Neo4j`是一种图数据库|[Pom](https://github.com/spring-projects/spring-boot/tree/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-data-neo4j/pom.xml)|
|`spring-boot-starter-data-couchbase`|集成了`Spring Data Couchbase`和[Couchbase](https://www.couchbase.com/),`couchbase`是一种`NoSQL`数据库|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-data-couchbase/pom.xml)|
|`spring-boot-starter-data-cassandra`|集成了`Spring Data Cassandra`和[cassandra](http://cassandra.apache.org/),`cassandra`是一种开源的分布式`NOSQL`数据库,最早由`facebook`开发,后捐赠给`Apache`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-data-cassandra/pom.xml)|
|`spring-boot-starter-data-gemfire`|集成了`Spring Data GemFire`和[GemFire](https://pivotal.io/big-data/pivotal-gemfire),`GemFire`是一种`NoSQL`数据库|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-data-gemfire/pom.xml)|

## Servlet Container

这篇[文章](http://www.programcreek.com/2013/04/what-is-servlet-container/)解释了什么是一个`Servlet Container`。目前`Servlet Container`有很多，详细可以参考[维基百科](https://en.wikipedia.org/wiki/Web_container#List_of_Servlet_containers)。`spring-boot`集成了以下几款开源的`Servlet Container`：

* [`tomcat`](http://tomcat.apache.org/tomcat-8.0-doc/index.html)：`tomcat`是`spring-boot`默认集成的`Servlet Container`。
* [`undertow`](http://undertow.io/index.html)：`undertow`是一款轻量级、灵活的、可嵌入的、并支持`Web Socket`协议的开源容器。
* [`jetty`](https://eclipse.org/jetty/)：`jetty`是一款由`eclipse`维护的开源容器，目前使用也很广泛。

| Name | Description | Pom  |
| --- | --- | --- |
|`spring-boot-starter-tomcat`|是`spring-boot-starter-web`默认集成的容器|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-tomcat/pom.xml)|
|`spring-boot-starter-undertow`|集成了`undertow`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-undertow/pom.xml)|
|`spring-boot-starter-jetty`|集成了`jetty`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-jetty/pom.xml)|

## Rest

> `Rest`是`representational state transfer`的缩写，意思是表达性状态转换。`Rest`是一种架构风格，它包含了一个分布式超文本系统中对于组件、连接器和数据的约束。[想了解更多关于Rest点击此处](https://www.ibm.com/developerworks/cn/java/j-lo-SpringHATEOAS/)
> `HATEOAS`是`Hypermedia as the engine of application state`的缩写，意思是超媒体即应用状态引擎。`HATEOAS`是`Rest`架构风格中最复杂的约束，也是构建成熟`Rest`服务的核心。

`JAX-RS`是`Java API for RESTful Web Services`的缩写，是一个Java编程语言的应用程序接口，支持按照`Rest`架构风格创建Web服务。目前已知的`JAX-RS`有4种，`Jersey`是其中的一种实现，由`Sun`开发的产品级质量的`JAX-RS`的参考实现。当然，`Jersey`也支持`HATEOAS`约束。

`spring-hateoas`和`spring-data-rest`是`spring`旗下的两个子项目，`spring-data-rest`包含了`spring-hateoas`，虽然`spring-hateoas`实现了`HATEOAS`，但是`spring-data-rest`并没有真正的实现`JAX-RS`规范。

`spring-boot`提供了以下几种来快速构建`Rest`服务：

| Name | Description | Pom  |
| --- | --- | --- |
|`spring-boot-starter-web`|默认是支持`RESTful`的|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-web/pom.xml)|
|`spring-boot-starter-hateoas`|集成了`spring-mvc`和`spring-hateoas`|[Pom](https://github.com/spring-projects/spring-boot/tree/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-hateoas/pom.xml)|
|`spring-boot-starter-jersey`|集成了`spring-mvc`和`Jersey`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-hateoas/pom.xml)|
|`spring-boot-starter-data-rest`|集成了`spring-data-rest`和`spring-mvc`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-data-rest/pom.xml)|

## Socia API

`spring-social`是`spring`旗下的一个扩展子项目，
它主要方便你对`Facebook`，`Twitter`，`LinkedIn`等SAAS服务提供的API的一个使用。目前`spring-social`的最新版本是`1.1.4.RELEASE`。它有以下几个模块组成：

* `spring-social-web`
* `spring-social-config`
* `spring-social-core`
* `spring-social-security`

目前已正式发布支持的有`Facebook`，`Twitter`，`LinkedIn`

* `spring-social-linkedin`
* `spring-social-facebook`
* `spring-social-twitter`

正在孵化的有`Github`和`Tripit`

* `spring-social-github`
* `spring-social-tripit`

`spring-boot`集成了`Facebook`，`Twitter`，`LinkedIn`

| Name | Description | Pom  |
| --- | --- | --- |
|`spring-boot-starter-social-linkedin`|集成了`spring-boot-starter-web`和`spring-social-linkedin`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-social-linkedin/pom.xml)|
|`spring-boot-starter-social-facebook`|集成了`spring-boot-starter-web`和`spring-social-facebook`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-social-facebook/pom.xml)|
|`spring-boot-starter-social-twitter`|集成了`spring-boot-starter-web`和`spring-social-twitter`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-social-twitter/pom.xml)|

## JTA

[`JTA`](https://zh.wikipedia.org/wiki/Java%E4%BA%8B%E5%8A%A1API)英文全称叫`Java Transaction API`，中文全称叫`Java事务API`，是一个Java企业版的应用程序接口，在Java环境中，允许完成跨越多个XA资源的分布式事务。JTA是在[Java社区](https://www.jcp.org/en/home/index)过程下制定的规范，编号[JSR 907](https://jcp.org/en/jsr/detail?id=907)。

目前开源的`JTA`实现有以下几个：

* [`narayana`](http://narayana.io/)：`narayana`是`jboss`下的一款开源的`JTA`
* [`bitronix`](https://github.com/bitronix/btm)：`bitronix`是一款开源的`JTA`，不过目前已没人维护
* [`atomikos`](https://www.atomikos.com/)：`atomikos`目前提供了商业版本的维护，但其社区版仍然是开源的。

| Name | Description | Pom  |
| --- | --- | --- |
|`spring-boot-starter-jta-narayana`|集成了`JTA transactions`和`narayana`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-jta-narayana/pom.xml)|
|`spring-boot-starter-jta-bitronix`|集成了`JTA transactions`和`bitronix`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-jta-bitronix/pom.xml)|
|`spring-boot-starter-jta-atomikos`|集成了`JTA transactions`和`atomikos`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-jta-atomikos/pom.xml)|

## Template Engine

`spring-boot-1.4.2.RELEASE`内置支持的模板引擎有
[`thymeleaf`](http://www.thymeleaf.org/)，[`mustache`](https://mustache.github.io/)，[`groovy`](http://docs.groovy-lang.org/latest/html/documentation/template-engines.html)，[`freemarker`](http://freemarker.org/)，[`velocity`](http://velocity.apache.org/)。不过从`1.4`将不再支持`velocity`。

| Name | Description | Pom  |
| --- | --- | --- |
|`spring-boot-starter-thymeleaf`|集成了`spring-boot-starter-web`和`thymeleaf`模板引擎|[Pom](https://github.com/spring-projects/spring-boot/blob/master/spring-boot-starters/spring-boot-starter-thymeleaf/pom.xml)|
|`spring-boot-starter-mustache`|集成了`spring-boot-starter-web`和`mustache`模板引擎|[Pom](https://github.com/spring-projects/spring-boot/blob/master/spring-boot-starters/spring-boot-starter-mustache/pom.xml)|
|`spring-boot-starter-groovy-templates`|集成了`spring-boot-starter-web`和`groovy-templates`模板引擎|[Pom](https://github.com/spring-projects/spring-boot/blob/master/spring-boot-starters/spring-boot-starter-groovy-templates/pom.xml)|
|`spring-boot-starter-freemarker`|集成了`spring-boot-starter-web`和`freemarker`模板引擎|[Pom](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-starters/spring-boot-starter-freemarker/pom.xml)|
|`spring-boot-starter-velocity`|集成了`spring-boot-starter-web`和`velocity`模板引擎|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-velocity/pom.xml)|

## Logging

目前主流的Java日志框架有`log4j`，`logback`和`log4j2`。`spring-boot`集成了`logback`和`log4j2`。

| Name | Description | Pom  |
| --- | --- | --- |
|`spring-boot-starter-logging`|集成`logback`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-logging/pom.xml)|
|`spring-boot-starter-log4j2`|集成`log4j2`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-log4j2/pom.xml)|

## Test

目前主流的Java测试框架有`JUnit`，`Hamcrest`和`Mockito`。`spring-boot`集成了这三者。

| Name | Description | Pom  |
| --- | --- | --- |
|`spring-boot-starter-test`|集成了`JUnit`，`Hamcrest`和`Mockito`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-test/pom.xml)|

## Security

`spring-security`是`spring`旗下的一个子项目，支持授权和认证，可以防止`session fixation`(会话固定)、`clickjacking`(点击劫持)、cross site request forgery(CSRF)(跨站请求伪造)等攻击。`spring-boot`集成了`spring-security`。

| Name | Description | Pom  |
| --- | --- | --- |
|`spring-boot-starter-security`|集成了`spring-security`|[Pom](https://github.com/spring-projects/spring-boot/blob/v1.4.2.RELEASE/spring-boot-starters/spring-boot-starter-security/pom.xml)|

## MQ

| Name | Description | Pom  |
| --- | --- | --- |

## Web Scoket

| Name | Description | Pom  |
| --- | --- | --- |

## Web Services

| Name | Description | Pom  |
| --- | --- | --- |

## Production Starters

| Name | Description | Pom  |
| --- | --- | --- |

## 参考

* [spring-HATEOAS-vs-spring-data-rest](http://stackoverflow.com/questions/19514131/spring-hateoas-versus-spring-data-rest)
* [spring-rest-service-vs-jersey-rest-service](http://stackoverflow.com/questions/26824423/what-is-the-difference-among-spring-rest-service-and-jersey-rest-service-and-spr)
* [Web Service是什么？](http://www.ruanyifeng.com/blog/2009/08/what_is_web_service.html)
* [使用Spring HATEOAS开发REST服务](https://www.ibm.com/developerworks/cn/java/j-lo-SpringHATEOAS/)
* [JAX-RS](https://zh.wikipedia.org/wiki/JAX-RS)
* [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS)
* [点击劫持](https://zh.wikipedia.org/wiki/%E7%82%B9%E5%87%BB%E5%8A%AB%E6%8C%81)
* [Session fixation](https://en.wikipedia.org/wiki/Session_fixation)
* [跨站请求伪造](https://zh.wikipedia.org/wiki/%E8%B7%A8%E7%AB%99%E8%AF%B7%E6%B1%82%E4%BC%AA%E9%80%A0)



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

| Name | Description | Pom  |
| --- | --- | --- |

## Logging

| Name | Description | Pom  |
| --- | --- | --- |

## Cache

| Name | Description | Pom  |
| --- | --- | --- |

## Production Starters

| Name | Description | Pom  |
| --- | --- | --- |

## Rest

| Name | Description | Pom  |
| --- | --- | --- |

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

## Security

| Name | Description | Pom  |
| --- | --- | --- |

## MQ

| Name | Description | Pom  |
| --- | --- | --- |

## Web Scoket

| Name | Description | Pom  |
| --- | --- | --- |

## Web Services

| Name | Description | Pom  |
| --- | --- | --- |

## Test

| Name | Description | Pom  |
| --- | --- | --- |





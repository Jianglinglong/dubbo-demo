# dubbo-demo
### 项目演示了dubbo使用zookeeper做注册中心的rpc调用，服务提供方使用了dubbo container方式与spring mvc+tomcat方式，消费方spring mvc+tomcat方式进行消费
### dubbo container引入下面的依赖支持annotation驱动支持dubbo
```xml
<dependency>
  <groupId>com.alibaba.spring</groupId>
  <artifactId>spring-context-support</artifactId>
  <version>1.0.2</version>
</dependency>
```
## 该项目spring mvc采用Java config方式

>项目主要依赖版本
* dubbo 2.6.2
* spring mvc 4.3.16.RELEAS
* zookeeper 3.4.6
* curator 2.8.0
* netty 4.0.35.Final

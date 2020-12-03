# Spring

## 入门介绍

### 简介

- Spring 春天 -> 软件行业的春天
- 一个轻量级控制反转IOC和面向切面编程AOP的容器框架
- 2002年,首次推出Spring框架雏形: interface21框架
- spring理念: 使现有打技术更加简简洁,容易使用,整合现有的技术框架
  - SSH: Struct2 + Spring + Hibernate(半自动)
  - SSM: SpringMVC + Spring + Mybatis(全自动)
- 需要的地址: 使用5.2.9
  - github: https://github.com
  - spring下载: https://repo.spring.io/release/org/springframework/spring/
  - spring web MVC maven: https://mvnrepository.com/artifact/org.springframework/spring-webmvc

```java
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.2.9.RELEASE</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.2.9.RELEASE</version>
</dependency>
```

### 优点

- Spring 是一个开源免费的框架(容易)
- Spring是一个轻量级的非入侵式(不会对原来代码产生影响)的框架
- 控制反转IOC 面向切面编程AOP
- 支持事务处理 对框架整合的支持
- 总结: Spring是一个轻量级打控制反转和面向编程的框架

### 弊端

- 由于发展太久,违背原来的理念,配置复杂

### 组成

- 组成内容: Spring AOP/Spring ORM/Spring Web/Spring DAO/Spring Context/Spring  Core/Spring Web Mvc

### 拓展

- 官网学习路线: 构建一切 协调一切 连接一切e
- 现代化的Java开发 基于Spring的开发
- Spring Boot 一个快速开发的脚手架 可以快速开发单个微服务 约定大于配置
- Spring Cloud 基于Spring Boot实现的
- 众多公司基于Spring boot进行开发 需要掌握Spring和SpringMVC

## IOC理论推导

### 以前的写法

1. UserDao接口
2. UserDaoImpl实现类
3. UserService业务接口
4. UserServiceImpl业务实现类
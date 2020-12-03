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

### 写法对比

1. UserDao接口
2. UserDaoImpl实现类
3. UserService业务接口
4. UserServiceImpl业务实现类

- 之前业务中,用户需求会影响代码,需要根据用户需求去修改代码 如果代码量大,则代价高

- 使用set接口实现 (革命性变化)

  ```java
  原先写法:
  	private UserDao userDao = new UserDaoImpl();
  修改写法: 
  	public void setUserDao(UserDao userDao) { this.userDao = userDao; }
  ```

  - 原先 程序主动创建对象 控制权在程序 所以用户需求会导致代码修改
  - 现在 程序不再具有主动性 使用set注入 变成被动接受对象 只需要扩展类而不用改程序 上下层之间使用接口 通过接口调用
  - 这就是控制反转: 将主动权从程序变成用户 这种思想差距需要多写代码
  - 从本质上解决问题 程序员不用再管理对象的创建了 系统耦合性大大降低 可以更加专注在业务实现  这就是IOC原型

### IOC本质

- 控制反转IOC是一种设计思想 依赖注入DI是实现IOC的一种方法
- 一环扣一环(高耦合) -> 中间有一个IoC容器(中间件)(解耦过程) -> 模块独立划分(理想的系统)
- IoC是Spring框架的核心内容 可以使用XML/注解配置/(新版)零配置
- IoC过程: Spring容器在初始化时先读取配置文件,按此配置文件或元数据创建与组织对象存入容器中,程序使用时再从IoC容器中取出所需要的对象
	![image-20201203153406348](/home/maoyuhuan/文档/GitHub/manjaro_learning/note/Spring.assets/image-20201203153406348.png)
- 采用XML方式配置Bean(需要学)的时候,Bean的定义信息是和实现分离的,而采用注解方式可以把两者合为一体,Bean的定义信息直接以注解的方式定义在实现类中,实现0配置的目的
- 控制反转是一种通过描述(XML或者注解)并通过第三方去生产或获取特定对象的过程.在Spring中实现控制反转的是IoC容器,实现方法是依赖注入DI


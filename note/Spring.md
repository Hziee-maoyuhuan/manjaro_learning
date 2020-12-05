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

### Spring 家族的组成

![image-20201204143236155](/home/maoyuhuan/文档/GitHub/manjaro_learning/note/Spring.assets/image-20201204143236155.png)

![image-20201204143113512](/home/maoyuhuan/文档/GitHub/manjaro_learning/note/Spring.assets/image-20201204143113512.png)

- Spring Boot
	- 一个快速开发的脚手架
	- 基于SpringBoot可以开发单个微服务
	- 约定大于配置
	- SpringCloud是基于SpringBoot实现的
	- 众多公司基于Spring boot进行开发 需要掌握Spring和SpringMVC

### 优点

- Spring 是一个开源免费的框架(容易)
- Spring是一个轻量级的非入侵式(不会对原来代码产生影响)的框架
- 控制反转IOC 面向切面编程AOP
- 支持事务处理 对框架整合的支持
- 总结: Spring是一个轻量级打控制反转和面向编程的框架

### 弊端

- 由于发展太久,违背原来的理念,配置复杂

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

## Hello Spring

#### 思考

- Hello对象是谁创建的
	- hello对象是由Spring创建的
- hello对象属性是怎么设置的
	- hello对象由Spring容器设置的
- 这个过程就是控制反转
	- 控制: 谁来控制对象的创建,传统应用程序对象由程序控制,使用Spring则由Spring容器创建控制
	- 反转: 程序本身不创建对象,而是被动接收对象
	- 依赖注入: 使用set方法进行注入
	- IoC是一种编程思想,由主动编程变为被动接收
- IoC: 对象由Spring创建,管理和装配

## IoC创建对象的方式

- 使用无参构造方法创建对象 一般无法使用有参构造函数 默认方式

- 假设需要使用有参构造函数 则需要使用构造器 有三种方法

	1. 下标赋值

		> ```xml
		> <bean id="person0" class="cn.hziee.myh.pojo.Person">
		>     <!--        第一种方式: 使用下标进行赋值-->
		>     <constructor-arg index="0" value="Zhang San"/>
		>     <constructor-arg index="1" value="21"/>
		> </bean>
		> ```

	2. 类型

		> ```xml
		> <bean id="person1" class="cn.hziee.myh.pojo.Person">
		>     <!--        第二种方式: 使用类型进行赋值 有可能多个参数同类型 所以不建议使用-->
		>     <constructor-arg type="java.lang.String" value="Li Si"/>
		>     <constructor-arg type="int" value="23"/>
		> </bean>
		> ```

	3. 参数名

		> ```xml
		> <bean id="person2" class="cn.hziee.myh.pojo.Person">
		>     <!--        第三种方式: 使用名称和对应的值进行赋值 最能接受理解-->
		>     <constructor-arg name="userName" value="Wang Wu"/>
		>     <constructor-arg name="userAge" value="25"/>
		> </bean>
		> ```

- Spring在配置文件加载打时候,容器中已经帮我们初始好对象了

- 创建好的对象是同一个 内存中只有一个实例

	> ```java
	> // 判定是否取出的是同一个对象
	> Person anotherPerson = (Person) applicationContext.getBean("person2");
	> System.out.println(person2 == anotherPerson);
	> ```

## Spring配置

- 别名alias

	> ```xml
	> <alias name="对象名" alias="对象别名"/>
	> ```

- bean的配置

	> ```xml
	> <bean id="Bean的唯一标识符" class="Bean对象对应的权限定类名" name="对象别名1 对象别名2.." scope="模式,有单例/原型等模式">
	>     <property name="类变量名" value="类变量值"/>
	> </bean>
	> ```

- import导入 一般用于团队开发 可将多个配置文件 导入合并为一个 使用总配置即可

	> ```xml
	> <!--    假如有多个人开发 这里可以将他们的xml文件进行导入到同一个文件中-->
	> <import resource="editor1.xml"/>
	> <import resource="editor2.xml"/>
	> <import resource="editor3.xml"/>
	> ```


## 依赖注入DI

### 通过构造器注入(前面已经说了)

- 通过set方式注入(重点)

- 依赖: bean对象的创建依赖于容器

- 注入: bean对象的所有属性都由容器来注入

- 环境搭建:

	```xml
	    <!--    因为Address也是一个类所以需要在beans中进行声明-->
	    <bean id="address" class="cn.hziee.myh.pojo.Address">
	        <property name="address" value="浙江杭州"/>
	    </bean>
	
	    <bean id="student" class="cn.hziee.myh.pojo.Student">
	
	        <!--        最简单的注入方式 普通值注入-->
	        <property name="name" value="张三"/>
	
	        <!--        bean引用注入-->
	        <property name="address" ref="address"/>
	
	        <!--        数组注入-->
	        <property name="books">
	            <array>
	                <value>红楼梦</value>
	                <value>三国演义</value>
	                <value>水浒传</value>
	                <value>西游记</value>
	            </array>
	        </property>
	
	        <!--        List注入-->
	        <property name="hobby">
	            <list>
	                <value>听歌</value>
	                <value>跳舞</value>
	                <value>弹琴</value>
	            </list>
	        </property>
	
	        <!--        Map注入-->
	        <property name="card">
	            <map>
	                <!-- entry 实体 包含key和value-->
	                <entry key="entryName" value="entryValue"/>
	                <entry key="身份证" value="330565200003144545"/>
	            </map>
	        </property>
	
	        <!--        Set注入-->
	        <property name="games">
	            <set>
	                <value>LOL</value>
	                <value>COC</value>
	                <value>王者</value>
	            </set>
	        </property>
	
	        <!-- Property 注入 -->
	        <property name="properties">
	            <props>
	                <prop key="学号">20010302</prop>
	                <prop key="性别">男</prop>
	            </props>
	        </property>
	        
	        <!-- 空值注入 -->
	        <property name="wife">
	            <null/>
	        </property>
	        
	    </bean>
	```

	

- 第三方方式注入 拓展方式
	- 命名空间 p命名空间 c命名空间
	- 需要导入对应打命名空间 

### Bean作用域  scope 重点

- 单例 默认
	- 创建的所有实例都只是同一个 取出的 对象都是同一个 全局共享
- 原型 
	- 每一次从容器中get的对象都是不同的对象
- 其他 只能在web开发中使用到 request session application..

## Bean的自动装配

### 介绍

- 自动装配是Spring满足bean依赖的一种方式
- Spring会在context中自动寻找 并给bean装配属性
- 三种装配方式
	- 在xml显式配置
	- 在java中显式配置
	- 隐式自动装配(重要)

### 使用注解进行自动装配

- 注解配置比xml配置好
- 须知
	- 需要导入约束
	- 配置注解的支持
- Autowired 
	- 直接在类中的属性上添加@Autowired即可 也可以添加在set方法上
	- 甚至连set方法也不需要 通过反射进行实现 前提是自动装配的属性在Spring容器并且id符合标准
	- required
		- 如果属性为false 表示可以为空
		- @Nullable 标志表示可以为空
	- 如果自动装配环境比较复杂 自动装配无法通过一个Autowired完成的时候可以通过@Qualifier(value="xxx")去配置使用 指定一个唯一的bean对象注入
	- 先找type再找id
- @Resource 
	- 没有Spring高级
	- java原生注解 先找id 再找type 都找不到会报错

## 使用注解开发

### bean

- 在Spring4之后,使用注解开发需要保证AOP 的包已经导入

- 使用注解需要导入Context约束 和注解支持

	```xml
	<?xml version="1.0" encoding="UTF-8"?>
	<beans xmlns="http://www.springframework.org/schema/beans"
	       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	       xmlns:context="http://www.springframework.org/schema/context"
	       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd">
	    
	    <context:annotation-config/>
	
	</beans>
	```

- 指定要扫描的包 这个包下的注解就会生效

	```xml
	<!--    指定要扫描的包-->
	<context:component-scan base-package="cn.hziee.myh.pojo"/>
	```

	- 将@Component 放在类上表明类被Spring管理 bean

### 属性如何注入

```java
// 使用Spring的注解给name赋值 相当于在xml中给bea注入值 常用于简单的值注入 复杂的建议使用xml
    @Value("李四")
    public String name;
```

### 衍生注解

- @Component有几个衍生注解 在web开发中常用mvc三层架构 
	- dao [@Repository] 
	- service [@Service]
	- controller [@Controller]
	- 功能都是一样的 被扫描后都会注册到Spring中装配成为bean

### 自动装配

### 作用域

@Scope

### 小结

- xml更加万能 适用于任何场合 维护简单
- 注解不是自己打类使用不了 有局限性 维护复杂
- 最佳实践
	- xml完成bean创建
	- 注解实现值注入
- 注意: 让注解生效需要开启注解并且扫描对应包

## java方式配置Spring

- 不使用Spring的xml配置了,交由java来做
- javaConfig是一个Spring的子项目 在Spring4后,成为核心功能
- 纯java的配置方式在SpringBoot中随处可见

## 代理模式

- 简介
	- 中介: 帮别人做事 ->代理
	- 为什么学习代理模式
		- Spring AOP的底层  [AOP 和 MVC 重要]
- 分类
	- 静态代理
		- 角色分析
			- 抽象角色 一般使用接口/抽象类解决
			- 真实角色 被代理的角色
			- 代理角色 代理真实角色 做附属操作
			- 客户 访问代理对象的人
	- 动态代理
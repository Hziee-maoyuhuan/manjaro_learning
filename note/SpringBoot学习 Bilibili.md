# SpringBoot学习 Bilibili

> bilibili 网址:  https://www.bilibili.com/video/BV1Et411Y7tQ?from=search&seid=59815044918958369

## SpringBoot 入门

- 简介
  - 简化Spring应用开发 
  - 对Spring技术栈的一个整合
  - J2EE的一站式解决方案
- hello world
- 原理分析
- 微服务 (架构风格: 服务微化)
  - martin fowler
  - 每一个元素部署后动态组合 通过http方式进行互通
  - 节省资源 每一个小功能都是可以替换的代码块
  - All In One   (之前开发模式)
    - 开发测试简单,部署简单,水平扩展简单
    - 如果一个小修改应用就需要重新部署 日益增长的软件需求

## SpringBoot 配置

- 环境约束

	- jdk 1.8: Spring Boot 1.7+
	- maven : 3.3+
	- IDEA 2017+
	- SpringBoot 1.5.9.RELEASE+

- 配置maven

	>     <!--maven的setttings.xml配置文件 大概在文档180+行-->
	>     <profile>
	>         <id>jdk-1.8</id>
	>         <activation>
	>         	<activeByDefault>true</activeByDefault>
	>         	<jdk>1.8</jdk>
	>         </activation>
	>         <properties>
	>             <maven.compiler.source>1.8</maven.compiler.source>
	>             <maven.compiler.target>1.8</maven.compiler.target>
	>             <maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
	>         </properties>
	>     </profile>
	>

- 配置idea 整合maven

	- 需要手动配置maven 否则使用的是idea自带的maven
	- 配置步骤
		- 设置 -> 构建,执行,部署 -> 构建工具 -> maven -> 修改maven主路径为自己maven的位置

- 

## SpringBoot 与日志

## SpringBoot 与Web开发

## SpringBoot 与Docker

## SpringBoot 与数据访问

## SpringBoot 与启动配置原理

## SpringBoot 自定义starter

## SpringBoot 与缓存

## SpringBoot 与消息

## SpringBoot 与检索

## SpringBoot 与任务

## SpringBoot 与安全

## SpringBoot 与分布式

## SpringBoot 与开发热部署

## SpringBoot 与监控管理
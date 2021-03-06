<<<<<<< HEAD
 <p align="center">
  <img src="https://img.shields.io/badge/Avue-2.6.0-green.svg" alt="Build Status">
   <img src="https://img.shields.io/badge/Spring%20Cloud-Greenwich.SR2-blue.svg" alt="Coverage Status">
   <img src="https://img.shields.io/badge/Spring%20Boot-2.1.7.RELEASE-blue.svg" alt="Downloads">
 </p>  
 
**Pig Microservice Architecture**   
   
- 基于 Spring Cloud Greenwich.SR2 、Spring Security OAuth2 的RBAC权限管理系统  
- 基于数据驱动视图的理念封装 element-ui，即使没有 vue 的使用经验也能快速上手  
- 提供对常见容器化支持 Docker、Kubernetes、Rancher2 支持  
- 提供 lambda 、stream api 、webflux 的生产实践   


<a href="http://pig4cloud.com/#/doc/pig" target="_blank">部署文档</a> | <a target="_blank" href="http://avue.top"> 前端解决方案</a> | <a target="_blank" href="https://gitee.com/log4j/pig/releases/v1.3.2"> 1.0  版本</a> | <a target="_blank" href="http://pigx.pig4cloud.com"> PigX在线体验</a>
    
![](https://images.gitee.com/uploads/images/2019/0330/065147_85756aea_410595.png)

#### 快速构架微服务应用  

<img src="https://images.gitee.com/uploads/images/2019/0823/120112_98bb9619_410595.gif"/>  
   
#### 核心依赖 


依赖 | 版本
---|---
Spring Boot |  2.1.7.RELEASE  
Spring Cloud | Greenwich.SR2   
Spring Security OAuth2 | 2.3.5
Mybatis Plus | 3.1.2
hutool | 4.6.3
Avue | 2.0.6
   


#### 模块说明
```lua
pig-ui  -- https://gitee.com/log4j/pig-ui

pig
├── pig-auth -- 授权服务提供[3000]
└── pig-common -- 系统公共模块 
     ├── pig-common-core -- 公共工具类核心包
     ├── pig-common-log -- 日志服务
     └── pig-common-com.bees360.security -- 安全工具类
├── pig-config -- 配置中心[8888]
├── pig-eureka -- 服务注册与发现[8761]
├── pig-gateway -- Spring Cloud Gateway网关[9999]
└── pig-upms -- 通用用户权限管理模块
     └── pig-upms-api -- 通用用户权限管理系统公共api模块
     └── pig-upms-biz -- 通用用户权限管理系统业务处理模块[4000]
└── pig-visual  -- 图形化模块 
     ├── pig-monitor -- Spring Boot Admin监控 [5001]
     ├── pig-zipkin -- 链路调用监控 [5002]
     └── pig-codegen -- 图形化代码生成[5003]
	 
```
#### 提交反馈

1. 欢迎提交 issue，请写清楚遇到问题的原因，开发环境，复显步骤。

2. 不接受`功能请求`的 issue，功能请求可能会被直接关闭。  

3. <a href="mailto:pig4cloud@qq.com">pig4cloud@qq.com</a>    

4. <a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=1022756131&site=qq&menu=yes"> 个人QQ: 1022756131</a>

#### 开源协议


![](https://images.gitee.com/uploads/images/2019/0330/065147_e07bc645_410595.png)


#### 关注我们

![](https://images.gitee.com/uploads/images/2019/0808/102636_659bf088_410595.png)
=======
# bees360_cloud

#### Description
{**When you're done, you can delete the content in this README and update the file with details for others getting started with your repository**}

#### Software Architecture
Software architecture description

#### Installation

1. xxxx
2. xxxx
3. xxxx

#### Instructions

1. xxxx
2. xxxx
3. xxxx

#### Contribution

1. Fork the repository
2. Create Feat_xxx branch
3. Commit your code
4. Create Pull Request


#### Gitee Feature

1. You can use Readme\_XXX.md to support different languages, such as Readme\_en.md, Readme\_zh.md
2. Gitee blog [blog.gitee.com](https://blog.gitee.com)
3. Explore open source project [https://gitee.com/explore](https://gitee.com/explore)
4. The most valuable open source project [GVP](https://gitee.com/gvp)
5. The manual of Gitee [https://gitee.com/help](https://gitee.com/help)
6. The most popular members  [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
>>>>>>> 12a41d7d7c67513ec645276a4410fab295edc8f9

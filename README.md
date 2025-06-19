# Bedrock 平台简介

Bedrock 是一套基于微服务架构的企业级开发平台，采用前后端分离模式，旨在为企业提供高效、灵活、可扩展的业务开发与管理能力。平台集成了用户权限、系统监控、代码生成、定时任务、文件服务等常用功能模块，助力企业快速搭建和迭代各类业务系统。

## 技术架构

- **前端**：基于 Vue.js 实现，提供现代化的交互体验。
- **后端**：采用 Spring Boot、Spring Cloud & Alibaba 生态，支持分布式与微服务架构。
- **注册/配置中心**：Nacos
- **权限认证**：Redis
- **流量控制**：Sentinel
- **分布式事务**：Seata

## 主要模块

```
com.bedrock     
├── bedrock-ui              // 前端框架
├── bedrock-gateway         // 网关模块
├── bedrock-auth            // 认证中心
├── bedrock-api             // 接口模块
│       └── bedrock-api-system
├── bedrock-common          // 通用模块（核心、权限、日志、缓存、数据源等）
├── bedrock-modules         // 业务模块（系统、代码生成、定时任务、文件服务等）
├── bedrock-visual          // 图形化管理模块（监控中心）
├── pom.xml                 // 公共依赖
```

## 代码结构与说明

- **bedrock-ui**：前端项目，基于 Vue.js，负责页面展示与交互。
- **bedrock-gateway**：API 网关，统一入口，负责路由转发、权限校验等。
- **bedrock-auth**：认证中心，负责用户登录、Token 认证等安全相关功能。
- **bedrock-api**：对外接口模块，定义系统各类 API 接口。
- **bedrock-common**：通用基础模块，包含核心工具类、常量、异常处理、日志、缓存、数据源、权限、安全、脱敏、Swagger 文档等通用能力。
- **bedrock-modules**：业务功能模块，包含：
  - **bedrock-system**：系统管理（用户、角色、菜单、部门等）
  - **bedrock-gen**：代码生成器（支持前后端 CRUD 代码一键生成）
  - **bedrock-job**：定时任务调度
  - **bedrock-file**：文件上传与管理
- **bedrock-visual**：可视化监控模块，提供系统运行状态、服务监控等功能。

### 典型代码示例

- **通用常量与工具类**：如 `bedrock-common-core` 下的 `Constants.java`、`HttpStatus.java`、`FileUtils.java`、`MimeTypeUtils.java` 等，提供全局常量、状态码、文件操作、类型判断等基础能力。
- **异常体系**：如 `BaseException.java`，实现统一的异常处理机制。
- **分页与树结构支持**：如 `TableDataInfo.java`、`TreeEntity.java`，支持表格分页和树形数据结构。
- **代码生成相关**：如 `GenConfig.java`、`IGenTableService.java`，支持数据库表结构解析、代码模板生成等。
- **前端工具函数**：如 `src/utils/bedrock.js` 的 `handleTree`，用于前端树形结构数据处理。

## 内置功能

1. 用户、部门、岗位、角色、菜单等基础权限管理
2. 字典、参数、公告等系统配置
3. 操作日志、登录日志、在线用户监控
4. 定时任务调度与日志
5. 代码生成器（支持前后端 CRUD 代码一键生成）
6. 系统 API 文档自动生成
7. 服务监控（CPU、内存、磁盘、堆栈等）
8. 在线表单构建器
9. 数据库连接池监控与 SQL 性能分析

## 快速开始

1. 克隆项目，按模块分别构建和部署后端服务与前端项目。
2. 参考各模块 `README.md` 或 `bootstrap.yml` 进行配置。
3. 默认管理员账号：`admin/admin123`

---

如需更详细的开发、部署或二次开发说明，请参考各子模块下的文档或源码注释。



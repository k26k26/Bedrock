# 前端框架介绍

本项目前端基于 Vue.js 2.x + Element-UI 实现，采用模块化、组件化开发，配合 Vuex 进行状态管理，Vue Router 实现前端路由，Axios 负责与后端 API 通信。整体架构清晰，易于扩展和维护，适合中大型管理系统开发。

## 技术栈
- Vue.js 2.x
- Element-UI
- Vuex
- Vue Router
- Axios
- ECharts、Quill、vuedraggable 等常用插件

## 目录结构
```
bedrock-ui/
├── public/           # 公共资源目录
├── src/
│   ├── api/          # 所有与后端交互的接口定义
│   ├── assets/       # 静态资源（图片、样式等）
│   ├── components/   # 通用组件库
│   ├── directive/    # 自定义指令
│   ├── layout/       # 页面布局相关组件
│   ├── plugins/      # 插件扩展
│   ├── router/       # 路由配置
│   ├── store/        # Vuex 状态管理
│   ├── utils/        # 工具函数
│   ├── views/        # 业务页面
│   ├── App.vue       # 根组件
│   └── main.js       # 入口文件
├── package.json      # 项目依赖配置
├── vue.config.js     # 构建配置
└── ...
```

## 主要功能
- 登录/注销、权限校验、动态路由
- 用户、角色、菜单、部门等管理页面
- 数据字典、参数配置、公告通知等系统功能
- 代码生成、定时任务、文件上传等业务模块
- 丰富的可复用组件与指令，支持主题切换、国际化扩展
- 支持多环境构建与部署，内置 gzip 压缩优化

## 开发规范
- 推荐使用 npm 安装依赖，避免使用 cnpm
- 组件开发遵循单一职责原则，样式采用 SCSS 预处理
- 路由、状态、接口等均模块化管理，便于维护

---

## 开发

```bash
# 安装依赖
npm install

# 建议不要直接使用 cnpm 安装依赖，会有各种诡异的 bug。可以通过如下操作解决 npm 下载速度慢的问题
npm install --registry=https://registry.npmmirror.com

# 启动服务
npm run dev
```

浏览器访问 http://localhost:80

## 发布

```bash
# 构建测试环境
npm run build:stage

# 构建生产环境
npm run build:prod
```
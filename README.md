## 应用描述

> 这是一个视频监控平台的应用程序，可以添加摄像头，录制想想头视频保存到本地，实时查看摄像头画面，调用AI进行画面分析，自动产生危险行为告警等等功能

## 一、部署建议

> 建议将所有文件放到`/home/vcas`目录下，否则需要修改相关文件中的配置。

## 二、文件清单

| 文件                         | 描述        |
|----------------------------|-----------|
| __`lib`__                  | 第三方依赖包    |
| __`license`__              | 授权信息相关文件  |
| __`resources`__            | 资源目录      |
| app.sh                     | 容器启动后执行脚本 |
| backup                     | 数据库备份脚本   |
| build.sh                   | 镜像构建脚本    |
| container.sh               | 容器启动脚本    |
| Dockerfile                 | 镜像构建文件    |
| jdk-8u341-linux-x64.tar.gz | jdk安装包    |
| mysql.sh                   | 数据库安装脚本   |
| path.sh                    | 项目部署根路径   |
| push.sh                    | 推送镜像脚本    |
| nginx.tar.gz               | nginx     |
| simsun.ttf                 | 字体文件      |
| start.sh                   | 应用启动脚本    |
| stop.sh                    | 应用停止脚本    |
| vcas.sql                   | 数据库初始化脚本  |
| vcas-1.0.0.jar             | 应用代码      |

## 三、配置修改

#### 1) 修改数据库配置

> 在`vcas.sql`文件中找到如下语句，将其中的IP地址修改为生产地址.
>
> ```sql
> insert into vcas_config (dbid, `key`, `value`, `desc`) values (1, 'SERVER_IP', '192.168.18.66', null);
> ```

#### 2) 修改配置文件

> 修改`application-pro.properties`文件中的数据源配置

## 四、数据库部署

```shell
./mysql.sh
```

## 五、应用镜像构建

```shell
./build.sh

```

## 六、启动应用容器

```shell
./container.sh
```

## 七、开发环境搭建

> 1. 修改 [src/main/resources/application-dev.properties](./src/main/resources/application-dev.properties) 中数据源信息，或启动时指定环境变量： `db.url=192.168.18.66:3306;db.uname=root;db.pwd=root`
> 2. 修改 [src/main/java/com/oven/vcas/framework/config/DevEnvSet.java](./src/main/java/com/oven/vcas/framework/config/DevEnvSet.java) 中相关配置项
> 3. 修改 [pom.xml](./pom.xml) 中指定profile
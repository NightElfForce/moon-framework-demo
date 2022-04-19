# spaDemo

#### 介绍
如何使用spa框架

#### 软件架构
软件架构说明
1.启动项目后调用DemoMvcController，DemoIocController，DemoDaoController几个controller即可实现框架功能

2.lib包下为spa框架打包的jar包，maven引入

3.StartApp为启动类，和springboot类似，此处设置端口为3333,右击run即可启动项目

4.maven配置直接使用此demo即可，引入spa框架和常用jar包

5.链接数据库一定要新建MysqlConfig类，配置改为自己的mysql地址即可

6.此demo用到了一张表，建表sql如下(就是两列，name和age,类型都是varchar)

tb_user  `name` varchar(255)   `age` varchar(255)

INSERT INTO `tb_user` VALUES ('王二小', '17');
INSERT INTO `tb_user` VALUES ('小二哥', '15');
INSERT INTO `tb_user` VALUES ('大佬', '18');
INSERT INTO `tb_user` VALUES ('小二明', '30');

#### 安装教程

1.  xxxx
2.  xxxx
3.  xxxx


#### 使用说明

1.  xxxx
2.  xxxx
3.  xxxx

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)

# Demo

#### 介绍
如何使用框架

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

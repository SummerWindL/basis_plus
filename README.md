#basis</br>

# basis

整合Dubbo+Zookeeper+SpringMVC+Spring+MyBatis+Redis支持分布式的高效率便捷开发框架

概述
使用此套框架开发需要配合启动一些其他服务，以下是本人个人搭建的CentOS服务器上启动的服务，可作参考：
Zookeeper-3.4.10
Redis-4.0.9
Solr-7.5.0
ActiveMQ-5.15.2
这些依赖服务可自行官网下载tar包，传到自己搭建的服务器上运行（需要注意的是Solr,ActiveMQ的运行需要依赖java，所以需要事先调试好java开发环境）。

启动Zookeeper服务（必要服务）：

``
cd /home/zookeeper/zookeeper-3.4.10/bin
./zkServer.sh start
``

配置开机启动zookeeper

``vim /etc/rc.local
su - root -c '/home/zookeeper/zookeeper-3.4.10/bin/zkServer.sh start'
``

注意 在centos7中，/etc/rc.local的权限被降低了，所以需要执行如下
命令赋予其可执行权限 

``
chmod +x /etc/rc.d/rc.local
``

启动Redis服务（必要服务）：
redis在我自己的机器上做了主从分离，移动到目录``/usr/local/redis/bin``下，用在basis项目
启动需要指定master配置文件，设置登陆密码（项目中配置文件有配置redis的访问密码，如果不给会出错，``config set requirepass root``，也可以直接配置文件写死）。

![redis-cli](/img/redis-cli.png) 

![redis-cli](/img/redis-server.png) 

进到入指定文件夹，执行 ![redis-cli](/img/redis-server-sh.png) 
这个地方我指定了启动master主redis服务，端口指定6379（可在conf中配置），使用netstat查看启动状态
 
![redis-cli](/img/redis-status.png) 

启动Solr服务（非必要）：
进入指定目录：
![redis-cli](/img/solr.png) 
 
执行如下命令：
指定端口强制启动

``
./solr start -force -p 8984
``

![redis-cli](/img/solr-start.png) 

等待启动完成。
停止命令：
停止服务

``
./solr stop
``

启动ActiveMQ服务（非必要）：
进入指定解压目录：

![redis-cli](/img/activemq.png) 
 
使用如下命令启动ActiveMQ服务 ![redis-cli](/img/activemq-start.png) 
 

![redis-cli](/img/activemq-status.png) 

启动成功。


![redis-cli](/img/properties.png) 最后修改这些配置文件。



注意事项项目结构如下：

![redis-cli](/img/framework.png) 
 
Basis为父工程。</br>
basis-api -- 接口模块（提供核心接口方法）。</br>
basis-common -- 公共模块。</br>
basis-core -- 核心模块（提供核心方法）。</br>
basis-dao -- 数据库访问模块（该模块主要通过 mbg 插件生成相应的模型及接口映射）。</br>
basis-plugins -- 插件模块（自定义插件）。</br>
basis-service -- 服务模块（核心接口方法实现）。</br>
basis-web -- web模块。

启动服务，首先启动basis-service，直接运行该模块中的 com.basis.service.ServiceApp.main() 方法来启动。
这个服务提供dubbo服务。

启动服务之后存在一个问题，前端页面显示乱码。
乱码问题详见：

这个项目，在使用过程中出现调用DemoController
![redis-cli](/img/q1.png) 
这个方法的时候，前端页面显示乱码。
![redis-cli](/img/q2.png) 
我最先想到是去看配置，一开始没看出什么问题，后来跟了CharacterEncodingFilter过滤器发现，这个版本的过滤器
![redis-cli](/img/q3.png) 
有发生变化，于是过滤器改了
![redis-cli](/img/q4.png) 
之后发现还是乱码，于是将RequestMappingHandlerAdapter适配器的StringHttpMessageConverter的bean配置移动到spring-beans.xml里面，解决问题。

启动basis-web可使用tomcat9，jetty9，mvn-jetty插件三种方式：

![redis-cli](/img/start.png) 

maven启动时：
需要注意的是，需要先将basis父工程mvn install安装到本地，才能运行

```
jetty:run
```

![redis-cli](/img/plugin.png) 

![redis-cli](/img/mvn-jetty-run.png)
 
 

项目介绍


软件架构
软件架构说明
![输入图片说明](https://gitee.com/uploads/images/2018/0605/182014_b72bb3ff_1029730.png "屏幕截图.png")

安装教程
使用该框架需要安装以下几个服务：
1、zookeeper
2、solr
3、redis
4、activemq

可以安装在虚拟机上，安装指令如下

一、启动zookeeper服务：
cd /home/zookeeper/zookeeper-3.4.10/bin
./zkServer.sh start

配置开机启动zookeeper

vim /etc/rc.local
su - root -c '/home/zookeeper/zookeeper-3.4.10/bin/zkServer.sh start'

注意注意 在centos7中，/etc/rc.local的权限被降低了，所以需要执行如下命令赋予其可执行权限 
chmod +x /etc/rc.d/rc.local

#######################################################

二、启动solr服务：
cd /home/solr/solr-7.3.1/bin

指定端口强制启动
./solr start -force -p 8984

停止服务
./solr stop

########################################################

三、启动redis服务：
cd /home/redis/redis-4.0.9

src/redis-server

给redis设置密码

config set requirepass root

########################################################

四、windows 启动activeMQ服务：
cd cd 
activemq start

CentOS 启动

cd /home/activemq/apache-activemq-5.15.2/bin

./activemq console

使用说明

该框架配合dubbo-admin使用，监控服务提供与消费者
![使用dubbo-admin监控](https://gitee.com/uploads/images/2018/0606/102953_37da3d49_1029730.png "屏幕截图.png")
![消费者页面](https://gitee.com/uploads/images/2018/0606/103024_7e2807f0_1029730.png "屏幕截图.png")
![提供者页面](https://gitee.com/uploads/images/2018/0606/103056_a2377e9e_1029730.png "屏幕截图.png")

`dubbo-admin使用`
解压后，根目录里存在dubbo-admin，进入 mvn package -Dmaven.test.skip=true 安装完后，生成target目录，进入这个目录，找到dubbo-admin-2.6.0这个目录，把这个目录全部copy到tomcat的目录webapps下的ROOT下面（删除tomcat webapps目录下ROOT原有内容）

启动tomcat，就可以看到dubbo-admin的界面，默认帐号密码root/root

配置（使用dubbo-admin必须开启zookeeper服务）
在目录/home/admin/apache-tomcat-8.5.24/webapps/ROOT/WEB-INF下的配置dubbo.properties，修改帐号密码，以及注册信息


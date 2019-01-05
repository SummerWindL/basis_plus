#basis</br>

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


参与贡献
Fork 本项目
新建 Feat_xxx 分支
提交代码
新建 Pull Request
码云特技
使用 Readme_XXX.md 来支持不同的语言，例如 Readme_en.md, Readme_zh.md
码云官方博客 blog.gitee.com
你可以 https://gitee.com/explore 这个地址来了解码云上的优秀开源项目
GVP 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
码云官方提供的使用手册 http://git.mydoc.io/
码云封面人物是一档用来展示码云会员风采的栏目 https://gitee.com/gitee-stars/
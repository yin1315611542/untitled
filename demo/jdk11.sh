#!/bin/bash

# 定义JDK安装路径
JDK_HOME=/usr/local/jdk

# 定义JDK压缩包路径
JDK_ARCHIVE=jdk-11.0.1.tar.gz

# 检查是否已经安装了JDK
if [ -d $JDK_HOME/jdk-11.0.1 ]; then
  echo "JDK 11.0.1 is already installed. Aborting installation."
  exit 1
fi

# 创建JDK安装目录
if [ ! -d $JDK_HOME ]; then
  mkdir -p $JDK_HOME
fi

# 解压JDK压缩包到指定目录
tar -zxvf $JDK_ARCHIVE -C $JDK_HOME

# 配置环境变量
echo "export JAVA_HOME=$JDK_HOME/jdk-11.0.1" >> /etc/profile
echo "export PATH=\$JAVA_HOME/bin:\$PATH" >> /etc/profile

# 使配置生效
source /etc/profile

# 输出Java版本号，检查安装是否成功
java -version
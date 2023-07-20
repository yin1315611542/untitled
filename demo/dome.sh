#!/bin/bash

# 生成数据库dump文件
DB_USER="root"
DB_PASSWORD="goldencis"
DB_NAME="vops_asset_hub"
DUMP_FILE="/var/ftp/pub/vops_asset_hub.sql"

HOST='62.0.0.82'  # B 服务器地址
USER='root'         # B 服务器登录用户名
REMOTE_DIR='/home/ftpuser'  # B 服务器目标目录
PORT='12222'


# 如果当前小时数等于 06 或 18，则执行操作
     mysqldump -u$DB_USER -p$DB_PASSWORD $DB_NAME > $DUMP_FILE
     # 运行您的脚本
     scp -P $PORT $DUMP_FILE $USER@$HOST:$REMOTE_DIR
	   if [ "$?" -eq 0 ]; then
	     today=$(date +"%Y-%m-%d %H:%M:%S")
      echo "$today 文件上传成功。"
     else
       today=$(date +"%Y-%m-%d %H:%M:%S")
      echo "$today 文件上传失败。"
     fi
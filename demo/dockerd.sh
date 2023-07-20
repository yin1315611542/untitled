echo "停止 Docker 服务"
sudo systemctl stop docker
echo "删除所有未使用的容器、镜像、网络和数据卷，以释放磁盘空间"
sudo docker system prune -a --volumes
echo "卸载 Docker 软件包"
sudo yum -y remove docker-ce docker-ce-cli containerd.io
echo "删除 Docker 数据和配置文件"
sudo rm -rf /var/lib/docker
echo "删除 Docker 用户组"
sudo groupdel docker
echo "docker 卸载完成"


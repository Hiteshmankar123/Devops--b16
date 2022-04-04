# jenkin installation

```shell
# install  java
yum install  java-11-openjdk -y
# configre jenkins repo
 wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat-stable/jenkins.repo
sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io.key
# install jenkins
yum install jenkins
# start jenkins services
systemctl start jenkins
systemctl enable jenkins 

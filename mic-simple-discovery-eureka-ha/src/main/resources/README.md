#打包 通过spring.profiles.active 指定使用哪个profile启动
java -jar microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
#访问
http://peer1:8761
http://peer2:8762
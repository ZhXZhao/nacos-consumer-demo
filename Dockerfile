FROM registry.access.redhat.com/ubi8/openjdk-8:latest

USER root

RUN mkdir -p /home/cloudnative

WORKDIR /home/cloudnative

COPY target/nacos-consumer-demo-1.0-SNAPSHOT.jar /home/cloudnative/nacos-consumer-demo-1.0-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","nacos-consumer-demo-1.0-SNAPSHOT.jar"]
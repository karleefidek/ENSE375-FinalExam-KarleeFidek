FROM maven:3.6.3-jdk-11 AS build
MAINTAINER karlee
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
WORKDIR /usr/local/service
RUN mvn -f /usr/local/service/pom.xml clean package
CMD java -cp target/ense375-finalexam-karleefidek-0.1.0-SNAPSHOT.jar com.uregina.app.App
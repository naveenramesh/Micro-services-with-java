FROM openjdk
RUN mkdir /jars
ADD target/dockerdemoapp-0.0.1-SNAPSHOT.jar /jars
EXPOSE 8080:8080
CMD ["java","-jar","/jars/dockerdemoapp-0.0.1-SNAPSHOT.jar"]
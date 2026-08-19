FROM openjdk:17.0.2-jdk
EXPOSE 8090
ADD target/employee-restapp-0.0.1-SNAPSHOT.jar employee-restapp.jar
ENTRYPOINT [ "java","-jar","employee-restapp.jar" ]

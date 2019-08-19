# flyway-spring-boot

## Execution 

For execute, simple follow the statement:<br>

$ mvn clean compile flyway:migrate<br>
$ mvn clean compile flyway:info
<br><br>
More details can be found on [Flyway Documentation](https://flywaydb.org/documentation/).<br>
Spring Boot Flyway database migrations on startup details can be found on [here](https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html#howto-execute-flyway-database-migrations-on-startup).<br>

## Requirements

- Java 1.8 or later.
- PostgreSQL Server 9.x or later.
- Maven 3.x or later.

# docker-hello-world-spring-boot

Hello World sample shows how to deploy [SpringBoot](http://projects.spring.io/spring-boot/) [RESTful web service](https://spring.io/understanding/REST) application with [Docker](https://www.docker.com/)

#### Prerequisite

Installed: Docker, Java 1.8, Maven 3.x

#### Steps

##### Build project with Maven
```
$ mvn clean install
```

##### Move application to data folder
```
$ mv ./target/hello*.jar ./data
```

##### Build Docker image
```
$ docker build -t="hello-world-java" .
```

>Note:if you run this command for first time it will take some time in order to download base image from [DockerHub](https://hub.docker.com/)

##### Run Docker image
```
$ docker run -p 8080:8080 -it --rm hello-world-java
```

##### Test application
first you need to find ContainerId of the running Docker image
```
$ docker ps
```
you can find ContainerId in a row where IMAGE column contains 'hello-world-java' phrase

then you need to find IP address of the running Docker image
```
$ docker inspect --format '{{ .NetworkSettings.IPAddress }}' [ContainerId]
```

now test application
```
$ curl [IPAddress]:8080
```

the respone should be
```
Hello World
```




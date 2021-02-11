FROM openjdk:8-jdk-alpine
WORKDIR /usr/app
COPY ./target/EmployeeBoot-1.0.1.jar /usr/app/
ENTRYPOINT ["java","-jar","/usr/app/EmployeeBoot-1.0.1.jar"]
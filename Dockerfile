#Dockerfile,
FROM openjdk:21
RUN mkdir /usr/app/
COPY /target/Parvat.Jar /usr/app
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","Parvat.jar"]
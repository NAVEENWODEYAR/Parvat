#Dockerfile,bluePrint to create the docker image.,
FROM openjdk:21
RUN mkdir /usr/app/
COPY /target/Parvat.Jar /usr/app
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","Parvat.jar"]
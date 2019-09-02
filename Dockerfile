FROM openjdk:8
ADD jar/auth-service.jar auth-service.jar
EXPOSE 9100
ENTRYPOINT ["java","-jar","auth-service.jar"] 
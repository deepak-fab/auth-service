FROM openjdk:8
ADD target/docker-movie-catalogue.jar docker-movie-catalogue.jar
EXPOSE 9100
ENTRYPOINT ["java","-jar","docker-movie-catalogue.jar"] 
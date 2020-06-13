
FROM java:8
MAINTAINER Shivani
ENV USER_APP_URL="http://localhost:8918" ORDER_APP_URL="http://localhost:8908"

EXPOSE 8084
COPY /target/*.jar aggregator.jar
ENTRYPOINT ["java", "-jar", "aggregator.jar"]


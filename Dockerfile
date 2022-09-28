FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "-DPIGPIOD_HOST=192.168.0.14", "/app.jar"]

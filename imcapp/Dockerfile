#Generate Build

FROM maven:3-eclipse-temurin-17-alpine
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvnw clean package -Dmaven.test.skip=true

#dockerize
FROM eclipse-temurin:17.0.8.1_1-jdk-focal
WORKDIR /app
#COPY --from=build /app/target/imcapp-0.0.1-SNAPSHOT.jar ./imcapp.jar
COPY target/imcapp-0.0.1-SNAPSHOT.jar imcapp.jar
ENTRYPOINT ["java", "-jar" , "imcapp.jar"]
EXPOSE 8080

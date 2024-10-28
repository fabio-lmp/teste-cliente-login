FROM eclipse-temurin:17.0.8.1_1-jdk-jammy
COPY . . 
RUN chmod +x mvnw
RUN ./mvnw clean install -DskipTests
ENTRYPOINT [ "java", "-jar", "teste-cliente-login.jar" ]
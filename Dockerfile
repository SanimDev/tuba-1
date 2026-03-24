FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

RUN mv target/*.jar app.jar

<<<<<<< HEAD
CMD ["java", "-jar", "app.jar"]
=======
CMD ["java", "-jar", "app.jar"]
>>>>>>> d98ef3a (update method for post categories & courses)

# Используем Java 17
FROM eclipse-temurin:17-jdk-alpine

# Рабочая директория в контейнере
WORKDIR /app

# Копируем JAR в контейнер
COPY build/libs/wedding-0.0.1-SNAPSHOT.jar app.jar

# Открываем порт, который использует Spring Boot
EXPOSE 8989

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "app.jar"]

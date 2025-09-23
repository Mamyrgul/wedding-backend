# Используем Java 17 с Gradle
FROM gradle:7.6.1-jdk17-alpine AS build

# Рабочая директория внутри контейнера
WORKDIR /app

# Копируем файлы проекта
COPY . .

# Сборка JAR
RUN gradle clean build --no-daemon

# ---------------------------------------------------

# Новый контейнер для запуска приложения (легкий)
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Копируем JAR из предыдущего контейнера
COPY --from=build /app/build/libs/wedding-0.0.1-SNAPSHOT.jar app.jar

# Открываем порт Spring Boot
EXPOSE 8989

# Запуск приложения
ENTRYPOINT ["java", "-jar", "app.jar"]

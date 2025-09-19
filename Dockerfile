# Используем OpenJDK 17
FROM eclipse-temurin:17-jdk

# Создаём рабочую директорию
WORKDIR /app

# Копируем jar файл в контейнер
COPY build/libs/*.jar app.jar

# Открываем порт
EXPOSE 8989

# Команда запуска
ENTRYPOINT ["java","-jar","app.jar"]

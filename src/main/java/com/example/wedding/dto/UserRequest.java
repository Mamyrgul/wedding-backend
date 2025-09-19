package com.example.wedding.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import jakarta.validation.constraints.*;

@Builder
public record UserRequest(
        @NotBlank(message = "Имя не может быть пустым")
        @Size(max = 100, message = "Имя не должно превышать 100 символов")
        String fullName,

        @NotBlank(message = "Поле 'Родственники' обязательно для заполнения")
        @Size(max = 200, message = "Поле 'Родственники' не должно превышать 200 символов")
        String relatives,

        @NotNull(message = "Поле 'Придет ли гость' обязательно для заполнения")
        Boolean isCome,

        @NotNull(message = "Количество гостей обязательно для заполнения")
        @Min(value = 1, message = "Количество гостей должно быть минимум 1")
        @Max(value = 500, message = "Количество гостей не может превышать 500")
        Integer guestCount
) {
}

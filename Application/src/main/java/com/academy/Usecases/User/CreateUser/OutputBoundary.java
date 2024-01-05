package com.academy.Usecases.User.CreateUser;

import java.time.LocalDateTime;

public record OutputBoundary(
        String name,
        String description,
        String password,
        Integer age,
        String email,
        String cpf,
        String pixKey,
        LocalDateTime birthdate,
        LocalDateTime createdAt
) {
}

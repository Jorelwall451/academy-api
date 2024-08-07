package UseCases.User.CreateUser;

import java.time.LocalDateTime;

public record InputBoundary(
    String name,
    String description,
    String password,
    Integer age,
    String email,
    String cpf,
    String pixKey,
    LocalDateTime birthdate
) {
}

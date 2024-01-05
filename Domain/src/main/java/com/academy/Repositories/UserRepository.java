package com.academy.Repositories;

import com.academy.Entities.User.User;
import com.academy.ValueObjects.Cpf;
import com.academy.ValueObjects.Email;

import java.util.Optional;

public interface UserRepository {
    Optional<User> loadByName(String name);
    Optional<User> loadByEmail(Email email);
    Optional<User> loadByCpf(Cpf cpf);
}

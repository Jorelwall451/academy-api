package Repositories;

import Entities.User;
import ValueObjects.Cpf;
import ValueObjects.Email;

import java.util.Optional;

public interface UserRepository {
    Optional<User> loadByName(String name);
    Optional<User> loadByEmail(Email email);
    Optional<User> loadByCpf(Cpf cpf);
}

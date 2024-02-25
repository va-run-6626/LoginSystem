package Repository;

import Entities.User;

import java.util.Optional;

public interface IUserRepository {
    public boolean saveUser(User user);
    public Optional<User> getUser(String email);
}

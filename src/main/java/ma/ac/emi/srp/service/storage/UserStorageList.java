package ma.ac.emi.srp.service.storage;

import ma.ac.emi.srp.entity.User;

import java.util.List;

public class UserStorageList implements IUserStorage{
    List<User> users;

    @Override
    public void storeUser(User user) {
        this.users.add(user);
    }

    // GETTERS
    public List<User> getUsers() {
        return users;
    }

    // CONSTRUCTORS
}

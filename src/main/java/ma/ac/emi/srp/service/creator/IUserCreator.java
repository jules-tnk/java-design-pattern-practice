package ma.ac.emi.srp.service.creator;

import ma.ac.emi.srp.entity.User;

public interface IUserCreator {
    User createUser(String name, String email, int phoneNumber);
}

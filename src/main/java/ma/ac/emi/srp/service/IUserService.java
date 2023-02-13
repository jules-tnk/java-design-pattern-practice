package ma.ac.emi.srp.service;

import ma.ac.emi.srp.entity.User;

public interface IUserService {
    void createUser(String name, String email, int phoneNumber);

}

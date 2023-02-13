package ma.ac.emi.srp.service;

import ma.ac.emi.srp.entity.User;
import ma.ac.emi.srp.service.creator.IUserCreator;
import ma.ac.emi.srp.service.storage.IUserStorage;
import ma.ac.emi.srp.service.validator.IUserValidator;

public class UserService{
    private IUserStorage userStorage;
    private IUserValidator userValidator;
    private IUserCreator userCreator;

    // SETTERS
    public void setUserStorage(IUserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public void setUserValidator(IUserValidator userValidator) {
        this.userValidator = userValidator;
    }

    public void setUserCreator(IUserCreator userCreator) {
        this.userCreator = userCreator;
    }

/*
    // METHODS
    @Override
    public void createUser(String name, String email, int phoneNumber) {

    }

    @Override
    public boolean validateUser(User user) {
        return false;
    }

    @Override
    public void storeUser(User user) {

    }*/
}

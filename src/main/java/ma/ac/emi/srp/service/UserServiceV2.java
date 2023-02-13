package ma.ac.emi.srp.service;

import ma.ac.emi.srp.entity.User;
import ma.ac.emi.srp.service.creator.IUserCreator;
import ma.ac.emi.srp.service.creator.UserCreatorStandard;
import ma.ac.emi.srp.service.storage.IUserStorage;
import ma.ac.emi.srp.service.storage.UserStorageList;
import ma.ac.emi.srp.service.validator.IUserValidator;
import ma.ac.emi.srp.service.validator.UserValidatorStandard;

public class UserServiceV2 implements IUserService{
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

    // METHODS
    @Override
    public void createUser(String name, String email, int phoneNumber) {
        setUserCreator(new UserCreatorStandard());
        setUserValidator(new UserValidatorStandard());
        setUserStorage(new UserStorageList());

        User newUser = userCreator.createUser(name, email, phoneNumber);
        if (userValidator.validateUser(newUser)){
            userStorage.storeUser(newUser);
        }
    }
}

package ma.ac.emi.srp.service.creator;

import ma.ac.emi.srp.entity.User;
import ma.ac.emi.srp.service.validator.IUserValidator;
import ma.ac.emi.srp.service.validator.UserValidatorStandard;

public class UserCreatorStandard implements IUserCreator{
    IUserValidator userValidator = new UserValidatorStandard();
    @Override
    public User createUser(String name, String email, int phoneNumber) {
        return new User(name, email, phoneNumber);
    }
}

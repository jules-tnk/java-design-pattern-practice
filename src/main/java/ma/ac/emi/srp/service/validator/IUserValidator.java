package ma.ac.emi.srp.service.validator;

import ma.ac.emi.srp.entity.User;

public interface IUserValidator {
    boolean validateUser(User user);
}

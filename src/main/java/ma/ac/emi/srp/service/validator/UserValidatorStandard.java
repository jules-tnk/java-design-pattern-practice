package ma.ac.emi.srp.service.validator;

import java.util.regex.Pattern;
import ma.ac.emi.srp.entity.User;

public class UserValidatorStandard implements IUserValidator {
    @Override
    public boolean validateUser(User user) {
        if (!validateUserEmail(user)){
            return false;
        }
        if (!validateUserName(user)){
            return false;
        }
        if (!validateUserPhoneNumber(user)){
            return false;
        }
        return true;
    }

    public boolean validateUserEmail(User user) {
        String userEmail = user.getEmail();
        if (userEmail == null || userEmail.isEmpty()) {
            return false;
        }
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +"[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (pattern.matcher(userEmail).matches()) {
            return true;
        }
        return false;
    }

    public boolean validateUserPhoneNumber(User user) {
        String userPhoneNumber = Integer.toString(user.getPhoneNumber());
        String phoneNumberRegex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(phoneNumberRegex);
        if (pattern.matcher(userPhoneNumber).matches()){
            return true;
        }
        return false;
    }

    public boolean validateUserName(User user) {
        String userName = user.getEmail();
        return userName.length() <= 10;
    }
}

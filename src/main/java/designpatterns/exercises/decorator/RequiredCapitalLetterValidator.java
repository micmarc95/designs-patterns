package designpatterns.exercises.decorator;

public class RequiredCapitalLetterValidator implements Validable {
    Validable validator;

    public boolean isValid(String password){
        return validator.isValid(password) && !password.toLowerCase().equals(password);
    }

    public RequiredCapitalLetterValidator(Validable validator) {
        this.validator = validator;
    }
}

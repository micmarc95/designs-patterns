package designpatterns.exercises.decorator;

public class ApplicationPasswordTester {
    public static void main(String[] args) {
        Validable customValidator = new RequiredCapitalLetterValidator(new BasicPasswordValidator());
        boolean isPasswordValid = customValidator.isValid("TestPassword");
        System.out.println("isPasswordValid = " + isPasswordValid);

        //TODO implement other decorators
    }
}

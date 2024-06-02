package pages;

public class SomeLoginPage {

    private static final SelenideElement buttonSighIn = $x("//a");
    private static final SelenideElement inputEmail = $x("//input[@type='email']");
    private static final SelenideElement inputPassword = $x("//input[@type='password']");
    private static final SelenideElement buttonSubmit = $x("//input[@type='submit']");

    public SelenideElement buttonSignIn() {
        return buttonSighIn;
    }

    public SelenideElement inputEmail() {
        return inputEmail;
    }

    public SelenideElement inputPassword() {
        return inputPassword;
    }

    public SelenideElement buttonSubmit() {
        return buttonSubmit;
    }
}

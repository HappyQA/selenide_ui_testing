package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SomeLoginPage {

    private static final SelenideElement buttonSighIn = $x("//a");
    private static final SelenideElement inputEmail = $x("//input[@type='email']");
    private static final SelenideElement inputPassword = $x("//input[@type='password']");
    private static final SelenideElement buttonSubmit = $x("//input[@type='submit']");
    private static final SelenideElement buttonSighOut = $x("//button//span[contains(text(), 'Sign Out')]");
    private static final SelenideElement buttonConfirmSignOut = $x("//div[starts-with(@data-test-id, 'test')]");
    private static final SelenideElement buttonOtherAccount = $x("//div[@id='otherTile']");
    private static final SelenideElement buttonAccount = $x("//a[@href='/account']");

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

    public SelenideElement buttonSignOut() {
        return buttonSighOut;
    }

    public SelenideElement buttonConfirmSignOut() {
        return buttonConfirmSignOut;
    }

    public SelenideElement buttonSighInOtherAccount() {
        return buttonOtherAccount;
    }

    public SelenideElement buttonAccount() {
        return buttonAccount;
    }
}

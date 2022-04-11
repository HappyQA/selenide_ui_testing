package test.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.title;

public class SomeLoginPage {

    private static final SelenideElement sighInButton = $x("//a");
    private static final SelenideElement emailField = $x("//input[@type=\"email\"]");
    private static final SelenideElement submitButton = $x("//input[@type=\"submit\"]");
    private static final SelenideElement passwordField = $x("//input[@type=\"password\"]");
    private static final SelenideElement submitButtonOnSso = $x("//span[@class=\"submit\"]");
    private static final SelenideElement buttonYes = $x("//input[@type=\"submit\"]");

    public SomeLoginPage buttonSignIn() {
        sighInButton.click();
        return this;
    }

    public SomeLoginPage fieldEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public SomeLoginPage submitButton() {
        submitButton.click();
        return this;
    }

    public SomeLoginPage fieldPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public SomeLoginPage submitButtonOnSso() {
        submitButtonOnSso.click();
        return this;
    }

    public SomeLoginPage buttonYesInAzureAuth() {
        buttonYes.click();
        return this;
    }

    public String titleName() {
        return title();
    }
}

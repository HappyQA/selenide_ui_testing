package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.codeborne.selenide.WebDriverConditions.title;

public class SomeLoginSteps {

    SomeLoginPage someLoginPage;

    public static Logger logger = LogManager.getLogger(SomeLoginSteps.class);

    public SomeLoginSteps() {
        this.someLoginPage = Selenide.page(SomeLoginPage.class);
    }

    @Step("")
    public SomeLoginSteps clickOnButtonSignIn() {
        someLoginPage.buttonSignIn()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.enabled)
                .click();
        logger.info("");
        return this;
    }

    @Step("")
    public SomeLoginSteps fillInputUserEmail(String email) {
        someLoginPage.inputEmail()
                .sendKeys(email);
        logger.info("", email);
        return this;
    }

    @Step("")
    public SomeLoginSteps fillInputUserPassword(String password) {
        Selenide.sleep(1000);
        someLoginPage.inputPassword()
                .sendKeys(password);
        logger.info("", password);
        return this;
    }

    @Step("")
    public SomeLoginSteps clickOnButtonSubmit() {
        Selenide.sleep(1000);
        someLoginPage.buttonSubmit()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.enabled)
                .click();
        logger.info("");
        return this;
    }

    @Step("")
    public SomeLoginSteps clickOnButtonSighOut() {
        someLoginPage.buttonSignOut()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.enabled)
                .click();
        logger.info("");
        return this;
    }

    @Step("")
    public SomeLoginSteps clickOnButtonConfirmSignOut() {
        someLoginPage.buttonConfirmSignOut()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.enabled)
                .click();
        logger.info("");
        return this;
    }

    @Step("")
    public SomeLoginSteps clickOnButtonSighInOtherAccount() {
        someLoginPage.buttonSighInOtherAccount()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.enabled)
                .click();
        logger.info("");
        return this;
    }

    @Step("")
    public SomeLoginSteps clickOnButtonAccount() {
        someLoginPage.buttonAccount()
                .shouldBe(Condition.visible)
                .shouldBe(Condition.enabled)
                .click();
        logger.info("");
        return this;
    }

    @Step("Check if page title are visible")
    public SomeLoginSteps checkPageTitle(String expectedTitle) {
        Selenide.webdriver().shouldHave(title(expectedTitle));
        logger.info("");
        return this;
    }
}

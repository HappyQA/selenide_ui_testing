package test.steps;

import com.codeborne.selenide.Selenide;
import test.pages.SomeLoginPage;
import io.qameta.allure.Step;
import net.jodah.failsafe.internal.util.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.codeborne.selenide.Selenide.sleep;
import static test.utilities.URL.openURL;

public class SomeLoginSteps {

    SomeLoginPage page;

    public static Logger logger = LogManager.getLogger(SomeLoginSteps.class);

    public SomeLoginSteps() {
        this.page = Selenide.page(SomeLoginPage.class);
    }

    @Step("Open Tool")
    public SomeLoginSteps openSignupPage() {
        openURL();
        logger.info("Opened Tool");
        return this;
    }

    @Step("Click on button submit in Azure")
    public SomeLoginSteps clickOnSignInButton() {
        page.buttonSignIn();
        logger.info("Clicked on button Submit in Azure");
        return this;
    }

    @Step("Type user Email in Azure")
    public SomeLoginSteps fieldUserEmail(String email) {
        page.fieldEmail(email);
        logger.info("Fill user Email field");
        return this;
    }

    @Step("Click on submit button")
    public SomeLoginSteps clickOnSubmitButton() {
        page.submitButton();
        logger.info("Clicked on Submit Button");
        return this;
    }

    @Step("Type user Password in ADFS")
    public SomeLoginSteps fieldUserPassword(String password) {
        sleep(2000);
        page.fieldPassword(password);
        logger.info("Fill user password field");
        return this;
    }

    @Step("Click on submit button from ADFS")
    public SomeLoginSteps clickOnSubmitButtonOnSso() {
        page.submitButtonOnSso();
        logger.info("Clicked on Submit button on ADFS");
        return this;
    }

    @Step("Click on button Yes in Azure confirmation Login")
    public SomeLoginSteps clickOnButtonYesInAzure() {
        page.buttonYesInAzureAuth();
        logger.info("Clicked on button Yes in Azure confirmation login");
        return this;
    }

    @Step("Check if log in are correct")
    public SomeLoginSteps checkPageTitle(String expectedTitle) {
        Assert.isTrue(
                page.titleName().contains(expectedTitle), "Wrong page title"
        );
        logger.info("Checked title page name");
        return this;
    }
}

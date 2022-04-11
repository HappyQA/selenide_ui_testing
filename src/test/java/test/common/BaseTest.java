package test.common;

import com.codeborne.selenide.WebDriverRunner;

import com.codeborne.selenide.logevents.SelenideLogger;
import test.config.ConfigFile;
import test.steps.SomeSteps;
import test.steps.SomeLoginSteps;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import test.utilities.BrowserFactory;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;

public class BaseTest {

    SomeLoginSteps login;

    public static Logger logger = LogManager.getLogger(SomeSteps.class);

    public static ConfigFile cfg = ConfigFactory.create(ConfigFile.class);

    private final boolean LOCALE = false;

    public void loginIntoModule(String email, String password) {
        login = new SomeLoginSteps();
        login.openSignupPage()
                .clickOnSignInButton()
                .fieldUserEmail(email)
                .clickOnSubmitButton()
                .fieldUserPassword(password)
                .clickOnSubmitButtonOnSso()
                .clickOnButtonYesInAzure();
        login.checkPageTitle("Title");
    }

    @BeforeAll
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
                .includeSelenideSteps(false)
        );
    }

    @BeforeEach
    public void setUp() throws Exception {
        if (LOCALE) {
            setUpLocaleTests();
        } else {
            setUpRemoteTests();
        }
    }

    @AfterEach
    public void shutDown() {
        clearBrowserCookies();
        WebDriverRunner.getWebDriver().quit();
    }

    public void setUpRemoteTests() throws Exception {
        String browserType = System.getProperty("browser");
        BrowserFactory.getDriver(browserType);
    }

    public void setUpLocaleTests() {
        browser = "chrome";
        timeout = 15000;
        holdBrowserOpen = true;
    }
}

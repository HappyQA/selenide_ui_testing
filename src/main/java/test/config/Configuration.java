package conf;

import com.codeborne.selenide.FileDownloadMode;
import com.codeborne.selenide.Selenide;

import com.codeborne.selenide.logevents.SelenideLogger;
import org.aeonbits.owner.ConfigFactory;

import org.openqa.selenium.chrome.ChromeOptions;
import test.utilities.TestData;

public class Configuration extends TestData {

    public static String baseUrl = "https://app.url/";
    public static CredentialsFile cfg = ConfigFactory.create(CredentialsFile.class);
    protected static SomeLoginStepsLoginSteps someLoginStepsLoginSteps;
    public void initialStepsClasses() {
        someLoginStepsLoginSteps = new SomeLoginStepsLoginSteps();
    }

    @BeforeAll
    static void settingUpBrowser() {
        ChromeOptions options = new ChromeOptions()
                .addArguments("--lang=en_US")
                .addArguments("--remote-allow-origins=*");
        Configuration.browserCapabilities = options;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 5000;
        Configuration.holdBrowserOpen = false;
        Configuration.fileDownload = FileDownloadMode.FOLDER;
        Configuration.headless = false;
        Configuration.baseUrl = baseUrl;
        Configuration.remote = "https://grid.url/";

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
                .includeSelenideSteps(false)
        );

        /**
         * Do login by login steps into application.
         */
    }

    @BeforeEach
    public void startTest() {
        initialStepsClasses();
    }

    @AfterEach
    public void endTest() {
        Selenide.open(baseUrl);
    }

    @AfterAll
    public static void closeDownBrowser() {
        Selenide.closeWebDriver();
    }

    public void loginApplicationWithDifferentUser(String email, String password) {
        loginSteps.clickOnButtonSighOut()
                .clickOnButtonConfirmSignOut();
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.open(baseUrl);
        loginSteps.clickOnButtonSignIn()
                .fillInputUserEmail(email)
                .clickOnButtonSubmit()
                .fillInputUserPassword(password)
                .clickOnButtonSubmit()
                .clickOnButtonSubmit();
        loginSteps.checkPageTitle("Test Title");
    }
}

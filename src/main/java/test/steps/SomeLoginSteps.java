package steps;

public class SomeLoginSteps {

    SomeLoginPage someLoginPage;

    public static Logger logger = LogManager.getLogger(SomeLoginSteps.class);

    public SomeLoginSteps() {
        this.someLoginPage = Selenide.page(SomeLoginPage.class);
    }

    @Step("")
    public SomeLoginSteps clickOnButtonSignIn() {
        Selenide.clearBrowserLocalStorage();
        Selenide.clearBrowserCookies();
        someLoginPage.buttonSignIn()
            .shouldBe(Condition.visible, Condition.enabled)
            .click();
        logger.info("");
        return this;
    }

    @Step("")
    public SomeLoginSteps fillInputUserEmail(String email) {
        someLoginPage.inputEmail()
            .shouldBe(Condition.visible, Condition.enabled)
            .sendKeys(email);
        logger.info("");
        return this;
    }

    @Step("")
    public SomeLoginSteps fillInputUserPassword(String password) {
        someLoginPage.inputPassword()
            .shouldBe(Condition.visible, Condition.enabled)
            .sendKeys(password);
        logger.info("");
        return this;
    }

    @Step("")
    public SomeLoginSteps clickOnButtonSubmit() {
        someLoginPage.buttonSubmit()
            .shouldBe(Condition.visible, Condition.enabled)
            .click();
        logger.info("");
        return this;
    }

    @Step("Check if page title are visible")
    public SomeLoginSteps checkPageTitle(String expectedTitle) {
        Selenide.sleep(500);
        Selenide.webdriver().shouldHave(title(expectedTitle));
        return this;
    }
}

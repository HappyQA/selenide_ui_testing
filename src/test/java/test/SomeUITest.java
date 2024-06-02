package test;

@Tag("Test-UI")
@Epic("Login test")
public class SomeUITest extends Configuration {

    @Test
    @DisplayName("Test Case - 1: Login in Application")
    public void loginIntoApplication()  {
        loginSteps.clickOnButtonSignIn()
                .fillInputUserEmail(cfg.user())
                .fillInputUserPassword(cfg.password())
                .clickOnButtonSubmit();
        loginSteps.checkPageTitle("Test Title");
    }
}

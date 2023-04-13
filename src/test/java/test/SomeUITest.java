package test;

import io.qameta.allure.Epic;
import org.junit.jupiter.api.*;

import static conf.Configuration.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tag("tag")
@Tag("#Tag")
@Epic("Some Epic")
public class SomeUITest extends Configuration {

    @Order(1)
    @RepeatedIfExceptionsTest(repeats = 2)
    @DisplayName("Test Case - 1: Login in Application")
    public void loginIntoApplication()  {
        loginSteps.clickOnButtonSignIn()
                .fillInputUserEmail(cfg.user())
                .clickOnButtonSubmit()
                .fillInputUserPassword(cfg.password())
                .clickOnButtonSubmit()
                .clickOnButtonSubmit();
        loginSteps.checkPageTitle("Test Title");
    }
}

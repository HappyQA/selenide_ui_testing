package test.frontend.someUITests;

import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import test.common.BaseTest;
import test.config.ConfigFile;
import test.steps.SomeSteps;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.HashMap;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tag("tag")
@Tag("#Tag")
@Epic("Some Epic")
public class SomeUITest extends BaseTest {

    SomeSteps steps;

    public static Logger logger = LogManager.getLogger(SomeSteps.class);

    public static ConfigFile cfg = ConfigFactory.create(ConfigFile.class);

    @Test
    @Order(1)
    @DisplayName("Test Case - 1:")
    public void createSomeObject() throws APIException, IOException {
        TestCaseId = "";
        loginIntoModule(cfg.adminEmail(), cfg.adminPassword());
        steps = new SomeSteps();
        steps.clickOnSideBarButton()
                .createNewBudgetStructure()
                .fillBudgetTypeField("string")
                .fillGeoDeptField("string")
                .fillParentBudgetField("string")
                .fillBudgetField("string")
                .fillCostCenterField("string")
                .fillYearField("string")
                .fillOwnerField("string")
                .fillParentManagerField("string")
                .fillManagerField("string")
                .clickOnCheckBox()
                .clickOnSaveAsDraftButton();
        steps.checkSaveResultByHeadersContains(0, new HashMap<String, String>() {{
            put("string", "string");
        }});
    }
}

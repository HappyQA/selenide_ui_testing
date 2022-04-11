package test.steps;

import com.codeborne.selenide.Selenide;
import test.pages.SomePage;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import static com.codeborne.selenide.Selenide.sleep;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasValue;

public class SomeSteps {

    SomePage page;

    public static Logger logger = LogManager.getLogger(SomeSteps.class);

    public SomeSteps() {
        this.page = Selenide.page(SomePage.class);
    }

    @Step("Click on side menu page button")
    public SomeSteps clickOnSideBarButton() {
        page.clickOnSidePanelButtonBudgetStructure();
        logger.info("Clicked on side bar button Budget Structure");
        return this;
    }

    @Step("Click on button New")
    public SomeSteps createNewBudgetStructure() {
        page.clickOnNewBudgetStructure();
        logger.info("Clicked on button New");
        return this;
    }

    @Step("Fill the field Budget Type")
    public SomeSteps fillBudgetTypeField(String budgetType) {
        page.setBudgetType(budgetType);
        logger.info("Filled Budget Type");
        return this;
    }

    @Step("Fill the field GEO / Dept.")
    public SomeSteps fillGeoDeptField(String geoDept) {
        page.setGeoDept(geoDept);
        logger.info("Filled GEO / Dept.");
        return this;
    }

    @Step("Fill the field Parent Budget")
    public SomeSteps fillParentBudgetField(String parentBudget) {
        page.setParentBudget(parentBudget);
        logger.info("Filled Parent Budget");
        return this;
    }

    @Step("Fill the field Budget")
    public SomeSteps fillBudgetField(String budget) {
        page.setBudget(budget);
        logger.info("Filled Budget");
        return this;
    }

    @Step("Fill the field Cost Center")
    public SomeSteps fillCostCenterField(String costCenter) {
        page.setCostCenter(costCenter);
        logger.info("Filled Cost Center");
        return this;
    }

    @Step("Fill the field Year")
    public SomeSteps fillYearField(String year) {
        page.setYear(year);
        logger.info("Filled Year");
        return this;
    }

    @Step("Fill the field Owner")
    public SomeSteps fillOwnerField(String owner) {
        page.setOwner(owner);
        logger.info("Filled Owner");
        return this;
    }

    @Step("Fill the field Parent Manager")
    public SomeSteps fillParentManagerField(String parentManager) {
        page.setParentManager(parentManager);
        logger.info("Filled Parent Manager");
        return this;
    }

    @Step("Fill the field Manager")
    public SomeSteps fillManagerField(String manager) {
        page.setManager(manager);
        logger.info("Filled Manager");
        return this;
    }

    @Step("Click on check box Is Paid Media Budget")
    public SomeSteps clickOnCheckBox() {
        page.setCheckBox();
        logger.info("Clicked on Is Paid Media Budget checkbox");
        return this;
    }

    @Step("Click on Button Cancel")
    public SomeSteps clickOnCancelButton() {
        page.clickOnCancelButtonInForm();
        logger.info("Clicked on Cancel button");
        return this;
    }

    @Step("Click on Button Save as Draft")
    public SomeSteps clickOnSaveAsDraftButton() {
        page.clickOnSaveAsDraftButton();
        logger.info("Clicked on Save as Draft button");
        return this;
    }

    @Step("Click on Button Save as Placeholder")
    public SomeSteps clickOnButtonSaveAsPlaceholder() {
        page.clickOnSaveAsPlaceholderButton();
        logger.info("Clicked on Cancel Save as Placeholder");
        return this;
    }

    @Step("Click on document inside collection")
    public SomeSteps openDocumentsOnPageByIndex(int index) {
        page.selectPlaceholderOnDocument(index);
        logger.info("Clicked on document in table");
        return this;
    }

    @Step("Click on button Approve Budget")
    public SomeSteps clickOnButtonApproveBudget() {
        page.clickOnApproveButton();
        logger.info("Clicked on Approve button");
        return this;
    }

    @Step("Click on button Cancel Budget")
    public SomeSteps clickOnButtonCancelBudget() {
        page.clickOnCancelButton();
        logger.info("Clicked on Cancel button");
        return this;
    }

    @Step("Click on button Deactivate Budget")
    public SomeSteps clickOnButtonDeactivateBudget() {
        page.clickOnDeactivateButton();
        logger.info("Clicked on Deactivate button");
        return this;
    }

    @Step("Click on button Reactivate Budget")
    public SomeSteps clickOnButtonReactivateBudget() {
        page.clickOnReactivateButton();
        logger.info("Clicked on Reactivate button");
        return this;
    }

    @Step("Click on button in Approve modal Window")
    public SomeSteps clickButtonInApproveModalWindow(String buttonName) {
            if (Objects.equals(buttonName, "OK")) {
                page.clickOnButtonOkInApproveModalWindow();
            } else {
                page.clickOnButtonCancelInApproveModalWindow();
            }
        logger.info("Clicked on button {} in Approve modal window", buttonName);
        return this;
    }

    @Step("Click on button in Cancel modal Window")
    public SomeSteps clickButtonInCancelModalWindow(String buttonName) {
        if (Objects.equals(buttonName, "OK")) {
            page.clickOnButtonOkInCancelModalWindow();
        } else {
            page.clickOnButtonCancelInCancelModalWindow();
        }
        logger.info("Clicked on button {} in Cancel modal window", buttonName);
        return this;
    }

    @Step("Click on button in Deactivate modal Window")
    public SomeSteps clickButtonInDeactivateModalWindow(String buttonName) {
        if (Objects.equals(buttonName, "OK")) {
            page.clickOnButtonOkInDeactivateModalWindow();
        } else {
            page.clickOnButtonCancelInDeactivateModalWindow();
        }
        logger.info("Clicked on button {} in Deactivate modal window", buttonName);
        return this;
    }

    @Step("Click on button in Reactivate modal Window")
    public SomeSteps clickButtonInReactivateModalWindow(String buttonName) {
        if (Objects.equals(buttonName, "OK")) {
            page.clickOnButtonOkInReactivateModalWindow();
        } else {
            page.clickOnButtonCancelInReactivateModalWindow();
        }
        logger.info("Clicked on button {} in Reactivate modal window", buttonName);
        return this;
    }

    @Step("Find entity in Budget Structure section table")
    public SomeSteps checkSaveResultByHeadersContains(int indexDoc, Map<String, String> expectedValue) {
        sleep(2500);
        Set<String> keysExpectedValue = expectedValue.keySet();
        List<Map<String, String>> actualDocs = page.getDocumentData();
        keysExpectedValue.forEach(key ->
                assertThat(actualDocs.get(indexDoc), hasValue(expectedValue.get(key))));
        logger.info("Founded entry in Budget Structure table");
        return this;
    }
}

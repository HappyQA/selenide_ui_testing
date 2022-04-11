package test.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.*;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;
import static org.openqa.selenium.Keys.TAB;

public class SomePage {

    private static final SelenideElement sidePanelButton = $x("//span[contains(text(),'Budget Structure')]");

    private static final SelenideElement buttonNew = $x("//button[@data-test-id='button-new']");
    private static final SelenideElement buttonEdit = $x("//button[@data-test-id='button-edit']");
    private static final SelenideElement buttonChat = $x("//button[@data-test-id='button-chat']");
    private static final SelenideElement buttonApprove = $x("//button[@data-test-id='button-approve']");
    private static final SelenideElement buttonCancel = $x("//button[@data-test-id='button-cancel']");
    private static final SelenideElement buttonDeactivate = $x("//button[@data-test-id='button-deactivate']");
    private static final SelenideElement buttonReactivate = $x("//button[@data-test-id='button-reactivate']");
    private static final SelenideElement buttonBulkEdit = $x("//button[@data-test-id='button-bulkEdit']");
    private static final SelenideElement buttonFiltersPanel = $x("//button[@data-test-id='button-filtersPanel']");

    private static final SelenideElement buttonFiltersClearAll = $x("//button[@data-test-id='buttons-filtersClearAll']");
    private static final SelenideElement buttonFiltersApply = $x("//button[@data-test-id='buttons-filtersApply']");
    private static final SelenideElement buttonRightPanelLayoutClose = $x("//button[@data-test-id='button-RightPanelLayoutClose']");

    private static final SelenideElement buttonCancelInApproveModalWindow = $x("//div[contains(text(), 'Approve Budget Structure')]//..//..//button//span[contains(text(), 'Cancel')]");
    private static final SelenideElement buttonOkInApproveModalWindow = $x("//div[contains(text(), 'Approve Budget Structure')]//..//..//button//span[contains(text(), 'OK')]");

    private static final SelenideElement buttonCancelInCancelModalWindow = $x("//div[contains(text(), 'Cancel Budget Structure')]//..//..//button//span[contains(text(), 'Cancel')]");
    private static final SelenideElement buttonOkInCancelModalWindow = $x("//div[contains(text(), 'Cancel Budget Structure')]//..//..//button//span[contains(text(), 'OK')]");

    private static final SelenideElement buttonCancelInDeactivateModalWindow = $x("//div[contains(text(), 'Deactivate Budget Structure')]//..//..//button//span[contains(text(), 'Cancel')]");
    private static final SelenideElement buttonOkInDeactivateModalWindow = $x("//div[contains(text(), 'Deactivate Budget Structure')]//..//..//button//span[contains(text(), 'OK')]");

    private static final SelenideElement buttonCancelInReactivateModalWindow = $x("//div[contains(text(), 'Reactivate Budget Structure')]//..//..//button//span[contains(text(), 'Cancel')]");
    private static final SelenideElement buttonOkInReactivateModalWindow = $x("//div[contains(text(), 'Reactivate Budget Structure')]//..//..//button//span[contains(text(), 'OK')]");

    private static final SelenideElement fieldBudgetType = $x("//input[@data-test-id='dropdown-BudgetStructure-budgetType']");
    private static final SelenideElement fieldGeoDept = $x("//input[@data-test-id='dropdown-BudgetStructure-level1']");
    private static final SelenideElement fieldParentBudget = $x("//input[@data-test-id='dropdown-BudgetStructure-level2']");
    private static final SelenideElement fieldBudget = $x("//input[@data-test-id='dropdown-BudgetStructure-level3']");
    private static final SelenideElement fieldCostCenter = $x("//input[@data-test-id='dropdown-BudgetStructure-costCenter']");
    private static final SelenideElement fieldYear = $x("//input[@data-test-id='dropdown-BudgetStructure-year']");
    private static final SelenideElement fieldOwner = $x("//input[@data-test-id='dropdown-BudgetStructure-owner']");
    private static final SelenideElement fieldParentManager = $x("//input[@data-test-id='dropdown-BudgetStructure-parentManager']");
    private static final SelenideElement fieldManager = $x("//input[@data-test-id='dropdown-BudgetStructure-manager']");
    private static final SelenideElement checkBoxMediaBudget = $x("//div[starts-with(@class, 'ms-Checkbox-checkbox')]");
    private static final SelenideElement buttonCancelInForm = $x("//button[@data-test-id='button-BudgetStructureCancel']");
    private static final SelenideElement buttonSaveAsDraft = $x("//button[@data-test-id='button-BudgetStructureSaveDraft']");
    private static final SelenideElement buttonSaveAsPlaceholder = $x("//button[@data-test-id='button-BudgetStructureSavePlaceholder']");

    private static final SelenideElement table = $x("//div[@data-automationid='DetailsList']");
    private static final ElementsCollection headersTable = table.$$x(".//div[@class='ms-DetailsList-headerWrapper']//div[@role='columnheader']");
    private static final ElementsCollection documents = table.$$x(".//div[@class='ms-DetailsList-contentWrapper']//div[@class='ms-List-cell']");

    public SomePage clickOnSidePanelButtonBudgetStructure() {
        sidePanelButton.click();
        return this;
    }

    public SomePage clickOnNewBudgetStructure() {
        buttonNew.click();
        return this;
    }

    public SomePage clickOnEditButton() {
        buttonEdit.click();
        return this;
    }

    public SomePage clickOnChatButton() {
        buttonChat.click();
        return this;
    }

    public SomePage clickOnApproveButton() {
        buttonApprove.click();
        return this;
    }

    public SomePage clickOnCancelButton() {
        buttonCancel.click();
        return this;
    }

    public SomePage clickOnDeactivateButton() {
        buttonDeactivate.click();
        return this;
    }

    public SomePage clickOnReactivateButton() {
        buttonReactivate.click();
        return this;
    }

    public SomePage clickOnBulkEditButton() {
        buttonBulkEdit.click();
        return this;
    }

    public SomePage clickOnFiltersButton() {
        buttonFiltersPanel.click();
        return this;
    }

    public SomePage clickOnFiltersClearAllButton() {
        buttonFiltersClearAll.click();
        return this;
    }

    public SomePage clickOnFiltersApplyButton() {
        buttonFiltersApply.click();
        return this;
    }

    public SomePage clickOnFiltersCloseLayoutButton() {
        buttonRightPanelLayoutClose.click();
        return this;
    }

    public SomePage setBudgetType(String budgetType) {
        sleep(2000);
        fieldBudgetType.sendKeys(budgetType, TAB);
        return this;
    }

    public SomePage setGeoDept(String geoDept) {
        fieldGeoDept.sendKeys(geoDept, TAB);
        return this;
    }

    public SomePage setParentBudget(String parentBudget) {
        fieldParentBudget.sendKeys(parentBudget, TAB);
        return this;
    }

    public SomePage setBudget(String budget) {
        fieldBudget.sendKeys(budget, TAB);
        return this;
    }

    public SomePage setCostCenter(String costCenter) {
        fieldCostCenter.sendKeys(costCenter, TAB);
        return this;
    }

    public SomePage setYear(String year) {
        fieldYear.sendKeys(year, TAB);
        return this;
    }

    public SomePage setOwner(String owner) {
        fieldOwner.sendKeys(owner);
        $x("//span[@data-automationid='splitbuttonprimary']//div[contains(text(), '"+ owner +"')]")
                .shouldBe(Condition.visible);
        fieldOwner.sendKeys(TAB);
        return this;
    }

    public SomePage setParentManager(String parentManager) {
        fieldParentManager.sendKeys(parentManager);
        $x("//span[@data-automationid='splitbuttonprimary']//div[contains(text(), '"+ parentManager +"')]")
                .shouldBe(Condition.visible);
        fieldParentManager.sendKeys(TAB);
        return this;
    }

    public SomePage setManager(String manager) {
        fieldManager.sendKeys(manager);
        $x("//span[@data-automationid='splitbuttonprimary']//div[contains(text(), '"+ manager +"')]")
                .shouldBe(Condition.visible);
        fieldManager.sendKeys(TAB);
        return this;
    }

    public SomePage setCheckBox() {
        checkBoxMediaBudget.click();
        return this;
    }

    public SomePage clickOnCancelButtonInForm() {
        buttonCancelInForm.click();
        return this;
    }

    public SomePage clickOnSaveAsDraftButton() {
        buttonSaveAsDraft.shouldBe(Condition.enabled).click();
        return this;
    }

    public SomePage clickOnSaveAsPlaceholderButton() {
        buttonSaveAsPlaceholder.shouldBe(Condition.enabled).click();
        return this;
    }

    public ElementsCollection table() {
        return headersTable;
    }

    public SomePage clickOnDocumentByIndex(int index) {
        documents.get(index).scrollIntoView(true).click();
        return this;
    }

    public SomePage clickOnButtonCancelInApproveModalWindow() {
        buttonCancelInApproveModalWindow.click();
        return this;
    }

    public SomePage clickOnButtonOkInApproveModalWindow() {
        buttonOkInApproveModalWindow.click();
        return this;
    }

    public SomePage clickOnButtonCancelInCancelModalWindow() {
        buttonCancelInCancelModalWindow.click();
        return this;
    }

    public SomePage clickOnButtonOkInCancelModalWindow() {
        buttonOkInCancelModalWindow.click();
        return this;
    }

    public SomePage clickOnButtonCancelInDeactivateModalWindow() {
        buttonCancelInDeactivateModalWindow.click();
        return this;
    }

    public SomePage clickOnButtonOkInDeactivateModalWindow() {
        buttonOkInDeactivateModalWindow.click();
        return this;
    }

    public SomePage clickOnButtonCancelInReactivateModalWindow() {
        buttonCancelInReactivateModalWindow.click();
        return this;
    }

    public SomePage clickOnButtonOkInReactivateModalWindow() {
        buttonOkInReactivateModalWindow.click();
        return this;
    }

    public void selectPlaceholderOnDocument(int index) {
        documents.get(index).$x(".//div[@role='checkbox']").hover().click();
    }

    /**
     * Method for parsing documents from collection on table Headers without first checkbox element
     * @return Return documents collection with entities by Headers table
     */
    public List<Map<String, String>> getDocumentData() {
        final List<Map<String, String>> emptyList = new ArrayList<>();
        for (SelenideElement doc : documents) {
            Map <String, String> expectedDocument = new LinkedHashMap<>();
            ElementsCollection documentRow = doc.$$x(".//div[@data-automationid='DetailsRowCell']");
            for (int i = 1; i < headersTable.size(); i++) {
                expectedDocument.put(headersTable.get(i).getText(), documentRow.get(i-1).scrollIntoView(true).getText());
            }
            emptyList.add(expectedDocument);
        }
        return emptyList;
    }
}

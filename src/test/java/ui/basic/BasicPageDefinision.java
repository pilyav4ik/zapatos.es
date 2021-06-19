package ui.basic;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.browsers.BrowserSetting;

public class BasicPageDefinision {

    private final BasicPage basicPage = new BasicPage();
    private final BrowserSetting browserSetting  = new BrowserSetting();


    @Given("open web page in Chrome")
    public void openChrome(){
        browserSetting.openChrome();
    }

    @Given("open web page in Firefox")
    public void openFirefox(){
        browserSetting.openFirefox();
    }

    @And("close browser")
    public void closeBrowser(){
        browserSetting.closeBrowser();
    }

    @Given("input {string} to search")
    public void inputFieldWithNameVisible(String text) {
        basicPage.searchField(text);
    }

    @And("click search button")
    public void clickSearchButton() {
        basicPage.clickSearchButton();
    }

    @Then("title include text {string}")
    public void titleIs(String text){
        basicPage.checkTitle(text);
    }

    @Then("click product with link title {string}")
    public void clickProduct(String linkTitle){
        basicPage.clickToProduct(linkTitle);
    }

    @Then("text in breadcrumbs is {string}")
    public void textInBreadcrumbs(String text){
        basicPage.textIncludedInBreadcrumbs();
    }

    @And("brand link with text {string} visible")
    public void brandLinkIsVisible(String text){
        basicPage.brandNameLinkIsVisible(text);
    }

    @Then("text with {string} visible")
    public void textVisible(String text){
        basicPage.textVisibility(text);
    }

    @And("go to section with header {string}")
    public void sectionWithHeader(String text){
        basicPage.headerH3WithText(text);
    }

    @And("wait {int} seconds")
    public void waitSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds);
    }


    @Then("click button with text {string}")
    public void clickButtonWithText(String arg0) {
        basicPage.clickButton(arg0);
    }



    @When("cart button must have text {string}")
    public void cartButtonMustHaveText(String arg0) throws InterruptedException {
        Thread.sleep(3000);
        basicPage.cartButtonSize(arg0);
    }

    @Then("click cart button")
    public void clickCartButton() {
        basicPage.clickCartButton();
    }

    @Then("close popup window with added product")
    public void closePopupWindowWithAddedProduct() {
        basicPage.closePopup();
    }

    @Then("on the cart page product size must be {int}")
    public void onTheCartPageProductSizeMustBeSize(int size) {
        basicPage.productCountInCartPage(size);
    }

    @Then("click cart button after added product")
    public void clickCartButtonAfterAddedProduct() {
        basicPage.clickCartButtonAfterAddedProduct();
    }

    @Then("click link with text {string}")
    public void clickLinkWithText(String arg0) {
        basicPage.linkWithText(arg0);
    }
}


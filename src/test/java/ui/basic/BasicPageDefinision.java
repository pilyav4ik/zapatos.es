package ui.basic;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.qameta.allure.Step;

public class BasicPageDefinision {

    private BasicPage basicPage = new BasicPage();

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

}


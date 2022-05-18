package test.alta.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.CartScreen;

public class CartSteps {
    @Steps
    CartScreen cartScreen;

    @When("I click Beli button")
    public void clickBeliButton(){
        cartScreen.clickBeliButton();
    }

    @Then("Product Increases On Cart")
    public void productHaveBeenInCart(){
        cartScreen.validateCart();
    }
}

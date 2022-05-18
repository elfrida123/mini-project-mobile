package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.LoginScreen;

public class LoginSteps {
    @Steps
    LoginScreen loginScreen;

    private String errorMessage;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        loginScreen.clickIconLogin();
        loginScreen.isOnLoginPage();
    }

    @When("I input {string} on email field")
    public void inputValidEmail(String email){
        loginScreen.inputEmail(email);
    }

    @And("I input {string} on password field")
    public void inputValidPassword(String password){
        loginScreen.inputPassword(password);
    }

    @And("I click login button")
    public void clickLoginButton(){
        loginScreen.clickLoginButton();
    }

    @Then("I am on the home page")
    public void onTheHomePage(){
        loginScreen.isOnHomePage();
    }

    // invalid login
    @Then("I am get error message")
    public void getErrorMessage(){
        loginScreen.getErrorMessage();
    }
}

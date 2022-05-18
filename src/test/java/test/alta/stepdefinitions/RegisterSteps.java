package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.LoginScreen;
import test.alta.pages.RegisterScreen;

public class RegisterSteps {
    @Steps
    RegisterScreen registerScreen;

    @Steps
    LoginScreen loginScreen;

    @Steps
    LoginSteps loginSteps;

    @Given("I am on the login page for register")
    public void iAmOnTheLoginPage(){
        loginSteps.onTheLoginPage();
    }

    @When("I fill the field {string} in full name field with valid format")
    public void fillNamaLengkapField(String fullname){
        registerScreen.clickLinkRegister();
        registerScreen.isRegisterPage();
        registerScreen.fillFullnameField(fullname);
    }

    @And("I fill the field {string} in email field with valid format")
    public void fillEmailField(String email){
        registerScreen.fillEmailField(email);
    }

    @And("I fill the field {string} in password field with valid password")
    public void fillPasswordField(String password){
        registerScreen.fillPasswordField(password);
    }

    @And("click the Register button")
    public void clickRegisterButton(){
        registerScreen.clickRegisterButton();
    }

//    // invalid-register
//    @Then("I am get error message for invalid register")
//    public void getErrorMessageInvalidReg(){
//        registerScreen.getErrorMessageInvalidReg();
//    }
}

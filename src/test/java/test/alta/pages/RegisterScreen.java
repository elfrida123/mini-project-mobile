package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {

    private By linkRegister(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    private By registerPage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Register\"]");
    }

    private By fieldFullName(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By fieldEmail(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By fieldPassword(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }

    private By registerButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    @Step
    public void clickLinkRegister(){
        waitUntilClickable(linkRegister());
        onClick(linkRegister());
        onClick(linkRegister());
        onClick(linkRegister());
        onClick(linkRegister());
        onClick(linkRegister());
    }

    @Step
    public void fillFullnameField(String fullname){
        onClick(fieldFullName());
        onType(fieldFullName(), fullname);
    }

    @Step
    public void fillEmailField(String email){
        onClick(fieldEmail());
        onType(fieldEmail(), email);
    }

    @Step
    public void fillPasswordField(String password){
        onClick(fieldPassword());
        onType(fieldPassword(), password);
    }

    @Step
    public void clickRegisterButton(){
        onClick(registerButton());
    }

    @Step
    public boolean isRegisterPage(){
        return waitUntilVisible(registerPage()).isDisplayed();
    }

    // invalid-register
//    private By errorMessageInvalidReg(){
//        return MobileBy.xpath("//android.view.View[@content-desc=\"Gagal :(\"]");
//    }
//
//    @Step
//    public boolean getErrorMessageInvalidReg(){
//        return waitUntilVisible(errorMessageInvalidReg()).isDisplayed();
//    }
}

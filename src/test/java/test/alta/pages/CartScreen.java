package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class CartScreen extends BasePageObject {

    private By beliButton(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[2]");
    }

    private By productInCart(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[2]");
    }

    @Step
    public void clickBeliButton(){
        onClick(beliButton());
    }

    @Step
    public boolean validateCart(){
        return waitUntilVisible(productInCart()).isDisplayed();
    }
}

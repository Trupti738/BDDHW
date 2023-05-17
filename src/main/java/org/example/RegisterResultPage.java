package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.Utils.getTextFromElement;

public class RegisterResultPage extends Utils{
    // Write result message xpath
    By _getMessage = By.xpath("//div [@ class= \"result\"]");
    LoadProp loadProp = new LoadProp();
    public void getRegistrationResult(){
        Assert.assertEquals(getTextFromElement(_getMessage),loadProp.getProperty("expectedRegistrationResult"));
    }
}


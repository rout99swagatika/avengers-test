package com.avengers.test.smoke;

import com.avengers.lib.utils.TestConfigurations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSample {
    WebDriver driver;
    @BeforeMethod
    public void preCondition(){
        driver = TestConfigurations.getDriverInstance();
    }
    @AfterMethod
    public void postCondition(){
        driver.close();
    }
    @Test
    public void testLogInPageTitle(){
        String actualTitle = driver.getTitle();
    String expectedTitle = "actiTIME - Login";
    Assert.assertEquals(actualTitle,expectedTitle);
    }
}

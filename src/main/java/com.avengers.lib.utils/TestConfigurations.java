package com.avengers.lib.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestConfigurations {
public static WebDriver getDriverInstance(){
 String browser=DataHandlers.getDataFromProperties("config","browser");
    String url=DataHandlers.getDataFromProperties("config","prod_url");

    WebDriver driver=null;
    if (browser.equalsIgnoreCase("firefox")){
        System.setProperty("webdriver.gecko.driver","./browser-servers/geckodriver.exe");
        driver =new FirefoxDriver();
    }
    else if (browser.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver","./browser-servers/chromedriver.exe");
        driver =new ChromeDriver();
    }
    else {
        System.err.println("---Invalid browser. Please select correct browser in config.properties");
    }
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get(url);
    return driver;
}
}

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\swagatika\\Downloads\\Selenium files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(6000);
        takeScreenshot("Facebook_LoginPage");
    }

    public static void takeScreenshot(String fileName) throws IOException {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\swagatika\\IdeaProjects\\avengers-test\\error-screenshot" + fileName + ".jpg"));


    }
}

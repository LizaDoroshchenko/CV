package todo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class SeleniumHelper {

    public static WebDriver launchBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static boolean isElementDisplayed(WebDriver driver, By by) {
        boolean result;
        try {
            result = driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            result = false;
        }
        return result;
    }

    public static File takeScreenshot(WebDriver driver, String name) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File copied = new File("target/screenshots/" + name + ".png");
        try {
            FileUtils.copyFile(screenshot, copied);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return screenshot;
    }

    public static void waitForElement(WebDriver driver, By by, int seconds) {
        new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}


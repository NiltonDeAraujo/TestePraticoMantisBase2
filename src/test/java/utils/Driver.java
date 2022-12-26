package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
    private static WebDriver driver;
    public static WebDriverWait wait;

    public static ThreadLocal<WebDriver> tld = new ThreadLocal<>();

    public WebDriver startDriver(Browser navegador) {

        switch (navegador) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                tld.set(driver);
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                tld.set(driver);
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                tld.set(driver);
                break;
            case IE:
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                tld.set(driver);
                break;
            default:
                System.out.println("Browser incorreto!");
        }
        wait = new WebDriverWait(driver, 10);
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }

    public static synchronized WebDriver getDriver() {
        return tld.get();
    }

    public static void visibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void closeBrowser() {
        driver.quit();
    }
}

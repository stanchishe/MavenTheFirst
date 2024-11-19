package prgs.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

/**
 * Hello world!
 * Hello from me, too!
 * Hello from me, too!
 * Hello from me, too!
 * Hello from me, too!
 * Hello from me, too!
 * Hello from me, too!
 * Hello from me, too!
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // Chrome example
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("Start-Maximized");
        WebDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://www.google.bg/");

        chromeDriver.close();
        chromeDriver.quit();

        // Edge example
        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions().addArguments("Start-Maximized");
        WebDriver edgeDriver = new EdgeDriver(edgeOptions);
        edgeDriver.get("https://www.google.bg/");

        edgeDriver.close();
        edgeDriver.quit();

        // Firefox example
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions().addArguments("Start-Maximized");
        WebDriver ffDriver = new FirefoxDriver(firefoxOptions);
        ffDriver.get("https://www.google.bg/");

        ffDriver.close();
        ffDriver.quit();

        // Safari example
        WebDriverManager.safaridriver().setup();
        // TODO: Check option to start maximized
        SafariOptions safariOptions = new SafariOptions();
        WebDriver safariDriver = new SafariDriver(safariOptions);
        safariDriver.get("https://www.google.bg/");
        safariDriver.manage().window().maximize();
        safariDriver.close();
        safariDriver.quit();
    }
}

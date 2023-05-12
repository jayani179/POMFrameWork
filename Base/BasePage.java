package com.demo.nopcommerce.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
   public static WebDriver driver;
    public  static Properties prop;
    FileInputStream file;

//Method to open browser
//return WebDriver because we need the driver in LoginTestPage class
//we passed parameter for browser name which will come from config.properties via LoginTestPage class

public void initialiseDriver(String browserName) {
    if (browserName.equals("chrome")) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    } else if (browserName.equals("edge")) {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    } else if (browserName.equals("firefox")) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    } else {
        System.out.println("Browser not Matched");
    }
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();

}

    public Properties initialiseProperties() {

        prop = new Properties();
        try {
            //to read data from file
            file = new FileInputStream("C:\\Users\\Shaan\\IdeaProjects\\POMFrameWork\\src\\test\\resources\\TestData\\Config.properties");
            //to get property value
            prop.load(file);
        }catch (FileNotFoundException e){
            System.out.println("Config file is not found, please check.........");
        }catch (IOException e){
            System.out.println("Properties could not be loaded");
        }
        return prop;
    }
}

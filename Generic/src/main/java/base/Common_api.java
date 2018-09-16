package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Common_api {

    public WebDriver driver = null;
    String url = "http://www.Facebook.com";
       @BeforeMethod
    public void setUp(String url){
        this.url = url;
        System.setProperty("webdriver.gecko.driver", "C://Users//emdad//IdeaProjects//Selenium1//Generic//Browser_driver/geckodriver.exe");
        driver = new FirefoxDriver();

    }
    @AfterMethod
    public void cleanup(){driver.close();}
}


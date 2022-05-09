package Sampleapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/oscarbackhouse/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("www.aftonbladet.se");
        driver.quit();
    }
}

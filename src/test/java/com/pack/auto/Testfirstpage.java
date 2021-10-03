package com.pack.auto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Testfirstpage {

        WebDriver driver;
        WebDriverWait wait;

        String URL = "https://www.hotwire.com/";


        @BeforeClass
        public void Setup() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, 5);
        }

        @Test
        public void click() {
            driver.navigate().to(URL);
            driver.findElement(By.cssSelector("#root > div.page-home > div.hero-background-container.hero-background-container--campaign > div.hero-background > div > div > div.farefinder-container > div > div.farefinder-hotel.farefinder-content > form > div.farefinder-hotel-horizontal__row2 > div.submit-button > button > span")).click();
            WebElement query = driver.findElement(By.name("Find a Hotel"));

        }
    }

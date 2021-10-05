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
            driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div/div/div/div/div/div[2]/div[4]")).click();
            driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div/div/div/div/div/div[3]/form/div/div[2]/button[3]")).click();
            driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div/div/div/div/div/div[3]/form/div[2]/div/div/input")).sendKeys("San Francisco");
            driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div/div/div/div/div/div[3]/form/div[3]/div/div/input")).sendKeys("Los Angeles");
            driver.findElement(By.name("carPickupTime")).sendKeys("Evening");
            driver.findElement(By.xpath("//div[@id='root']/div[2]/div/div/div/div/div/div/div[3]/form/div[8]/button")).click();
            }
                
    }

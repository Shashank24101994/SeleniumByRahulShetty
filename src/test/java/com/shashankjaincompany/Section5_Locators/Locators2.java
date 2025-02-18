package com.shashankjaincompany.Section5_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("inputUsername"));
        username.sendKeys("sourabh");
        WebElement passward = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passward.sendKeys("rahulshettyacademy");
        WebElement checkbox1 = driver.findElement(By.id("chkboxOne"));
        checkbox1.click();
        WebElement checkbox2 = driver.findElement(By.id("chkboxTwo"));
        checkbox2.click();
        WebElement signin = driver.findElement(By.xpath("//button[contains(@class,'submit ')]"));
        signin.click();
       Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in");


    }
}

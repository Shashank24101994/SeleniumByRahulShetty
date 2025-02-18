package com.shashankjaincompany.Section5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("inputUsername"));
        username.sendKeys("shashank");
        WebElement passward = driver.findElement(By.name("inputPassword"));
        passward.sendKeys("shashank123");
        WebElement signin = driver.findElement(By.className("signInBtn"));
        signin.click();
        WebElement errorMessage = driver.findElement(By.cssSelector("p.error"));
        System.out.println(errorMessage.getText());
        WebElement forgotpassward = driver.findElement(By.linkText("Forgot your password?"));
        forgotpassward.click();
        Thread.sleep(2000);
       WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
       name.sendKeys("sourabh");
        WebElement email = driver.findElement(By.cssSelector("input[placeholder='Email']"));
        email.sendKeys("sourabh396@gmail.com");
       // Thread.sleep(3000);
        email.clear();
       WebElement email1 = driver.findElement(By.xpath("//input[@type='text'][2]"));
       email1.sendKeys("sjain396@gmail.com");
        WebElement phoneNumber = driver.findElement(By.xpath("//form/input[3]"));
        phoneNumber.sendKeys("98930357344");
        WebElement resetlogin = driver.findElement(By.cssSelector(".reset-pwd-btn"));
        resetlogin.click();
        WebElement temppassward = driver.findElement(By.cssSelector("form p"));
        System.out.println(temppassward.getText());

        driver.findElement(By.xpath("//button[contains(@class,'go')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("shashank");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();




        System.out.println(driver.getCurrentUrl());
        WebElement logout = driver.findElement(By.xpath("//button[contains(@class,'logout')]"));
        logout.click();




    }
}

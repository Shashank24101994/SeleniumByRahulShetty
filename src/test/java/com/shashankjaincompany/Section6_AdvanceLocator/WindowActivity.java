package com.shashankjaincompany.Section6_AdvanceLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivity
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://rahulshettyacademy.com/");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.quit();
    }
}

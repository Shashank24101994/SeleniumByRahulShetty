package com.shashankjaincompany.Section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OtherDropDownType
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        for(int i=1;i<=4;i++){
            driver.findElement(By.id("hrefIncAdt")).click();

        }
        for (int i=1;i<5;i++){
            driver.findElement(By.id("hrefIncChd")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
      //System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult, 4 Child");
    }
}

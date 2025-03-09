package com.shashankjaincompany.Section12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("autocomplete")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
        for(WebElement option:options){
            if(option.getText().equalsIgnoreCase("indonesia")){
                option.click();
                break;
            }
        }
        System.out.println(driver.findElement(By.id("autocomplete")).getDomProperty("value"));
    }
}
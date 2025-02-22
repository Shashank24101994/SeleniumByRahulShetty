package com.shashankjaincompany.Section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        // Assert.assertFalse(false);
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        // boolean checkbox = driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // count the number of checkbox
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
    }
}

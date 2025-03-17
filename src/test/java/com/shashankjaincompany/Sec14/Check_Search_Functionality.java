package com.shashankjaincompany.Sec14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Check_Search_Functionality {
    WebDriver driver ;
    @Test
    public void searchFunction(){
         driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));

        List<WebElement> Filterlist = veggies.stream().filter(veggie -> veggie.getText().contains("Rice")).collect(Collectors.toList());
        Assert.assertEquals(veggies.size(),Filterlist.size());
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }
}

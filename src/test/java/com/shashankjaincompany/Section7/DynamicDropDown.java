package com.shashankjaincompany.Section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        WebElement Amritsar = driver.findElement(By.xpath("//a[@value='ATQ']"));
        Amritsar.click();
        Thread.sleep(2000);
        WebElement Delhi = driver.findElement(By.xpath("(//a[@value='DEL'])[2]"));
        Delhi.click();
    }
}

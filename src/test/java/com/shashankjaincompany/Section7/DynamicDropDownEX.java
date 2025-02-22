package com.shashankjaincompany.Section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownEX {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
        driver.findElement(By.xpath("//div[normalize-space()='Kishangarh Airport']")).click();
        driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']")).click();
        driver.findElement(By.xpath("//div[text()='Aurangabad']")).click();





    }
}
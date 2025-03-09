package com.shashankjaincompany.Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
        checkbox.click();
        String text = driver.findElement(By.xpath("//label[@for='benz']")).getText();
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select sc= new Select(dropdown);
        sc.selectByVisibleText(text);
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();




    }
}

package com.shashankjaincompany.Section9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assignmet
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        FormFillup(driver);



    }
    public static void FormFillup(WebDriver driver) throws InterruptedException {
        WebDriverWait w1= new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        w1.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
        WebElement StdDropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropdown= new Select(StdDropDown);
        dropdown.selectByValue("consult");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
        List<WebElement> options = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
        for (WebElement option:options){
            option.click();
        }

        driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();


    }
}

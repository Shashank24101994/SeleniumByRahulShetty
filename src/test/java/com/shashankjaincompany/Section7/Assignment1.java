package com.shashankjaincompany.Section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("shashankjain");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("shashankjain781@gmail.com");
        WebElement passward = driver.findElement(By.id("exampleInputPassword1"));
        passward.sendKeys("Jinendra@123");
        WebElement checkbox1 = driver.findElement(By.id("exampleCheck1"));
        checkbox1.click();
        WebElement dropdown1 = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown= new Select(dropdown1);
        dropdown.selectByVisibleText("Female");
        WebElement radiobutton = driver.findElement(By.name("inlineRadioOptions"));
        radiobutton.click();
        WebElement date = driver.findElement(By.name("bday"));
        date.sendKeys("24-10-2025");

        WebElement submit = driver.findElement(By.className("btn-success"));
        submit.click();
        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
    }
}

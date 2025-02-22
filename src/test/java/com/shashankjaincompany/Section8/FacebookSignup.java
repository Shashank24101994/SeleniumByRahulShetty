package com.shashankjaincompany.Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FacebookSignup {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement createAccount = driver.findElement(By.xpath("//a[normalize-space()='Create new account']"));
        createAccount.click();
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("minty");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("jainy");
        WebElement day = driver.findElement(By.id("day"));
        Select dropdown=new Select(day);
        dropdown.selectByValue("20");
        WebElement month = driver.findElement(By.id("month"));
        Select dropdown2 = new Select(month);
        dropdown2.selectByValue("8");
        WebElement year = driver.findElement(By.id("year"));
        Select dropdown3= new Select(year );
        dropdown3.selectByValue("2019");
        WebElement radiobutton = driver.findElement(By.xpath("(//input[@id='sex']/parent::label)[2]"));
        radiobutton.click();
        WebElement emailAddress = driver.findElement(By.name("reg_email__"));
        emailAddress.sendKeys("shajain345@gmail.com");
        WebElement passWard = driver.findElement(By.id("password_step_input"));
        passWard.sendKeys("Jinendra@123");
        WebElement submit = driver.findElement(By.name("websubmit"));
        submit.click();

        Thread.sleep(3000);

       // System.out.println(driver.findElement(By.id("softblock_error_inner")).getText());
        Assert.assertEquals(driver.findElement(By.id("softblock_error_inner")).getText(),"We couldn't create your account\nWe were not able to sign you up for Facebook.");
        Assert.assertTrue(true);

    }
}

package com.shashankjaincompany.Section12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,550)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> Amount = driver.findElements(By.xpath("//div[@class='tableFixHead']//tr/td[4]"));
        int sum=0;
        for(int i=0;i< Amount.size();i++){
            String values = Amount.get(i).getText();
            sum=sum + Integer.parseInt(values);


        }
        System.out.println(sum);
        String TotalAmount = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
         int ActualTotalAmount=Integer.parseInt(TotalAmount.split(":")[1].trim());
        Assert.assertEquals(sum,ActualTotalAmount);
    }
}

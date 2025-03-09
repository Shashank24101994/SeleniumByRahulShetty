package com.shashankjaincompany.Section12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,550)");

        System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
        System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size());
        List<WebElement> values = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
        for (int i=0;i< values.size();i++){
            System.out.println(values.get(i).getText());
        }

    }
}

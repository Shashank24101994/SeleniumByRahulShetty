package com.shashankjaincompany.Section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        Windowhandle(driver);
    }
    public static void Windowhandle(WebDriver driver)  {
        driver .findElement(By.linkText("Multiple Windows")).click();
        driver .findElement(By.linkText("Click Here")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentwindow = it.next();
        String childwindow = it.next();
        driver.switchTo().window(childwindow);
        WebElement childtext = driver.findElement(By.xpath("//div[@class='example']/h3"));
        System.out.println(childtext.getText());

        driver.switchTo().window(parentwindow);
        WebElement parenttext = driver.findElement(By.xpath("//div[@class='example']/h3"));
        System.out.println(parenttext.getText());
    }
}

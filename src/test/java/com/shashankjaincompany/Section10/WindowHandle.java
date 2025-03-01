package com.shashankjaincompany.Section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
        // get id of all window that open in browser
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String ChildId = it.next();
        //switch to parent to child window
        driver.switchTo().window(ChildId);
        System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
        driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
        String emailid = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(emailid);

    }

}

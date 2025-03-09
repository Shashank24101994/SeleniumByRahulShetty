package com.shashankjaincompany.Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PrintLinkCount {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        //print count of all link on the page
        System.out.println(driver.findElements(By.tagName("a")).size());
        // find link count on footer section
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement footersec1 = driver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]"));
        List<WebElement> options = footersec1.findElements(By.tagName("a"));
        for (int i=1;i<options.size();i++){
            String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            options.get(i).sendKeys(clickonlinkTab);
            Thread.sleep(5000);}
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> it = windows.iterator();
            while (it.hasNext()){
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }

        }




    }


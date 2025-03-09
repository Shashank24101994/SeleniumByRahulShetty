package com.shashankjaincompany.Section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Calender
{
    public static void main(String[] args) throws InterruptedException {
        String MonthNum="6";
        String Date="24";
        String Year="2020";
        String[] Expected={MonthNum,Date,Year};
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__prev-button")).click();
        driver.findElement(By.xpath("//button[text()='"+Year+"']")).click();
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month ")).get(Integer.parseInt(MonthNum)-1).click();
       // driver.findElements(By.cssSelector(".react-calendar__month-view__days__day")).get(Integer.parseInt(Date)-1).click();
        driver.findElement(By.xpath("//abbr[text()='"+Date+"']")).click();
        List<WebElement> actualdate = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        Thread.sleep(3000);
        for(int i=0;i< actualdate.size();i++)
        {
            System.out.println(actualdate.get(i).getDomAttribute("value"));
            Assert.assertEquals(actualdate.get(i).getDomAttribute("value"),Expected[i]);
        }
        driver.close();



    }
}

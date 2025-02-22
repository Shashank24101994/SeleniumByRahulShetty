package com.shashankjaincompany.Section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropDown2
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='ATQ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

       // System.out.println( driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
      //  System.out.println( driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
       // System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")){
            System.out.println("is Enabled");
            Assert.assertTrue(true);
        }else {
            Assert.assertFalse(false);
        }


    }
}

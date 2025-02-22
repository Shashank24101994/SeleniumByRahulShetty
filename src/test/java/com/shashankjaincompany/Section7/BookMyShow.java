package com.shashankjaincompany.Section7;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://in.bookmyshow.com/explore/movies");
        driver.manage().window().maximize();
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("delhi");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[@class='bwc__sc-ttnkwg-14 flGQbT']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[text()='Chhaava']")).click();
       Thread.sleep(2000);
      driver.findElement(By.xpath("(//span[normalize-space()='Book tickets'])[1]")).click();
      Thread.sleep(2000);
      driver.findElement(By.className("sc-vhz3gb-3")).click();

    }
}

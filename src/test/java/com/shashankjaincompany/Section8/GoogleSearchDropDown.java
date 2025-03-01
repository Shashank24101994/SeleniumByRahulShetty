package com.shashankjaincompany.Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearchDropDown
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("virat");
        Thread.sleep(3000);
        List<WebElement> option = driver.findElements(By.xpath("//div[@class='aajZCb']//li"));
        System.out.println(option.size());
        for(WebElement options:option){
           // System.out.println(options.getText());
            if(options.getText().contains("virat kohli hairstyle")){
                options.click();
                break;
            }
        }



    }
}

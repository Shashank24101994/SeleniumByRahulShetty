package com.shashankjaincompany.Section6_AdvanceLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {
    public static void main(String[] args) {
        //sibling-child to parents
        //header/div/button[1]/following-sibling::button[1]
        //header/div/button[1] -- parent to child traverse
        //header/div/button[1]/following-sibling::button[1]-- child to child traverse

        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement login = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"));
       // WebElement login = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]/parent::div/parent::header/a/following-sibling::div/button[2]"));

        System.out.println(login.getText());
    }
}

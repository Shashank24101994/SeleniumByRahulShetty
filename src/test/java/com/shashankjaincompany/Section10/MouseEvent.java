package com.shashankjaincompany.Section10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent
{
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/?&tag=googhydrabk1");
        driver.manage().window().maximize();
        Mouseevent(driver);
    }
    public static void Mouseevent(WebDriver driver){
        Actions act = new Actions(driver);
        // Move to specific Element
        act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
        // Move to TextBox
        WebElement textbox = driver.findElement(By.id("twotabsearchtextbox"));
        act.moveToElement(textbox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
    }
}

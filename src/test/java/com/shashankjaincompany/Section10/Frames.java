package com.shashankjaincompany.Section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0);
      //  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        Actions act = new Actions(driver);
      // act.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable")));
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droppable"));
        act.dragAndDrop(drag,drop).build().perform();
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Autocomplete")).click();

    }
}

package com.shashankjaincompany.Section9;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitEx
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        driver.findElement(By.xpath("//div[@id='start']/button")).click();
        WebElement Helloworld = driver.findElement(By.cssSelector("[id='finish'] h4"));
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if(Helloworld.isDisplayed()){
                    return Helloworld;
                }else {
                    return null;
                }
            }
        });
        System.out.println(Helloworld.getText());

    }
}

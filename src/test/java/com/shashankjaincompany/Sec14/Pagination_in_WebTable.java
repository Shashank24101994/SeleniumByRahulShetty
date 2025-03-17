package com.shashankjaincompany.Sec14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Pagination_in_WebTable {
    @Test
    public void webTable() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();
        List<WebElement> fruits = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> newlist = fruits.stream().map(s -> s.getText()).collect(Collectors.toList());
        List<String> sortedlist = newlist.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(newlist.equals(sortedlist));
        List<String> vegprize;
        do {
            List<WebElement> fruitrows = driver.findElements(By.xpath("//tr/td[1]"));
            vegprize = fruitrows.stream().filter(s -> s.getText().contains("Potato")).map(s -> getPrize(s))
                    .collect(Collectors.toList());
            vegprize.forEach(a -> System.out.println(a));
            if (vegprize.size() < 1) {
                driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
            }
        } while (vegprize.size() < 1);
    }

    private String getPrize(WebElement s) {
        String prize = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return prize;
    }
}


package com.shashankjaincompany.Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class AddingItem {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        int j = 0;
        String[] vegetableNames = {"Cucumber", "Tomato", "Beans","Potato"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formatedname = name[0].trim();
            //format it to get actual vegetable name
            //Brocolli - 1 Kg

            //convert array into arraylist for easy search
            List itemname = Arrays.asList(vegetableNames);

            if (itemname.contains(formatedname)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == vegetableNames.length ) {
                    break;
                }

            }
        }
    }
}

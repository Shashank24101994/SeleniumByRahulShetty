package com.shashankjaincompany.Section9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //  WebDriverWait W= new WebDriverWait(driver, Duration.ofSeconds(5));
        String[] vegetableNames = {"Cucumber", "Tomato", "Beans", "Potato"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        AddItem(driver, vegetableNames);
        ProceedToCheckout(driver);


    }

    public static void AddItem(WebDriver driver, String[] vegetableNames) {
        int j = 0;
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
                if (j == vegetableNames.length) {
                    break;
                }

            }
        }

    }

    public static void ProceedToCheckout(WebDriver driver) {
        WebDriverWait W1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        W1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
        W1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        WebElement SelectCountry = driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"));
        Select dropdown = new Select(SelectCountry);
        dropdown.selectByValue("Anguilla");
    }
}

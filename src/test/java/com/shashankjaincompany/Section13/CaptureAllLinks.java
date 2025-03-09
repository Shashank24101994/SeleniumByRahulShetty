package com.shashankjaincompany.Section13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

public class CaptureAllLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
        SoftAssert sf = new SoftAssert();
        for(WebElement link:links) {
            String url = link.getDomProperty("href");
            HttpURLConnection conn = (HttpURLConnection)new URL(url ).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int rescode = conn.getResponseCode();
            System.out.println(rescode);
            sf.assertTrue(rescode < 400, "The Link with Text " + link.getText() + " is broken with code " + rescode);
        }
        sf.assertAll();

    }
}

package com.shashankjaincompany.Section13;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         String url = driver.findElement(By.linkText("Broken Link")).getDomProperty("href");
        //System.out.println(url);
        HttpURLConnection conn = (HttpURLConnection)new URL(url ).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int rescode = conn.getResponseCode();
        System.out.println(rescode);
    }
}

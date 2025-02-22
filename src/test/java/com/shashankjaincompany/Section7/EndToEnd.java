package com.shashankjaincompany.Section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEnd {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
        driver.findElement(By.xpath("(//a[@class='ui-state-default'])[3]")).click();
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i=1;i<5;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();

        WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticdropdown);
        dropdown.selectByIndex(2);

        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();


    }
}

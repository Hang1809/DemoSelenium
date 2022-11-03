package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATTDN22.03.09\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://www.railwayb2.somee.com/Page/HomePage.cshtml");
        System.out.println(driver.getTitle());
        driver.navigate().to("http://www.railwayb2.somee.com/Account/Login.cshtml");

        WebElement username = driver.findElement(By.id("username"));


    }
}

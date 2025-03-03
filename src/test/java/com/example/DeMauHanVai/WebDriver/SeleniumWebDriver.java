package com.example.DeMauHanVai.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {
    private WebDriver webDriver;

    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    void testSteps() throws InterruptedException {
        //open
        webDriver.get("https://github.com/");

        webDriver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
        Thread.sleep(1000);

        webDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hiepndph52357@gmail.com");
        Thread.sleep(1000);

        webDriver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("dinhhiep05");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("dinhhiep05");
        Thread.sleep(1000);

        webDriver.findElement(By.xpath("//a[contains(text(),'Sign in →')]")).click();
        Thread.sleep(1000);

        webDriver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("dinhhiep05");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("Dinhhiep2304005");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//input[@name='commit']")).click();
        Thread.sleep(4000);
        webDriver.quit();
    }
}

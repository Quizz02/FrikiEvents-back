package com;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

@RunWith(JUnit4.class)
public class CreateEventTest {
    private static WebDriver driver = null;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeClass
    public static void setUp() throws MalformedURLException{
//    driver = new ChromeDriver();
//    js = (JavascriptExecutor) driver;
//    vars = new HashMap<String, Object>();
        System.setProperty("webdriver.gecko.driver", "E:\\UPC\\Ciclo7\\Diseño de Experimentos ISW\\frikiteam\\frikievents-back\\geckodriver.exe");
        driver = new FirefoxDriver();
    }


    @Test
    public void registrodeEvento() {

        driver.get("http://localhost:4200/");

        driver.manage().window().setSize(new Dimension(1440, 780));
        driver.findElement(By.cssSelector(".mat-menu-trigger .mat-icon")).click();
        driver.findElement(By.id("LoginOption")).click();
        driver.findElement(By.cssSelector(".ng-tns-c93-3 > .mat-form-field-wrapper")).click();
        driver.findElement(By.cssSelector(".ng-tns-c93-3 > .mat-form-field-infix")).click();
        driver.findElement(By.id("mat-input-1")).sendKeys("organizer1@gmail.com");
        driver.findElement(By.cssSelector(".ng-tns-c93-4 > .mat-form-field-infix")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".btn-submit > .mat-button-wrapper"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.id("mat-input-2")).sendKeys("string");
        driver.findElement(By.id("loginBtn")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("createNavBtn")).click();

//        driver.findElement(By.cssSelector(".button > .mat-button-wrapper")).click();
        driver.findElement(By.id("createEventBtn")).click();

//        driver.findElement(By.id("mat-input-1")).click();
//        driver.findElement(By.id("mat-input-1")).sendKeys("Evento1");


        driver.findElement(By.id("eventTitleInput")).click();
        driver.findElement(By.id("eventTitleInput")).sendKeys("Evento1");

//        driver.findElement(By.cssSelector(".ng-tns-c93-5 > .mat-form-field-infix")).click();

//        eventdescriptionInput
//        driver.findElement(By.id("mat-input-2")).click();
//        driver.findElement(By.id("mat-input-2")).sendKeys("Descripcion de evento");

        driver.findElement(By.id("eventdescriptionInput")).click();
        driver.findElement(By.id("eventdescriptionInput")).sendKeys("Descripcion de evento");

        driver.findElement(By.cssSelector(".btn-upload")).click();
        driver.findElement(By.id("input-img")).sendKeys("E:\\Pura img\\Imagenes Random\\garcias.jpeg");
//        driver.findElement(By.cssSelector(".ng-tns-c93-6 > .mat-form-field-infix")).click();

        driver.findElement(By.id("countrySelector")).click();
        driver.findElement(By.cssSelector(".mat-option-text")).click();

//        driver.findElement(By.cssSelector(".ng-tns-c93-8 > .mat-form-field-infix")).click();

        driver.findElement(By.id("cityInput")).click();
        driver.findElement(By.cssSelector(".mat-option-text")).click();

//        driver.findElement(By.cssSelector(".mat-select-placeholder")).click();
//        driver.findElement(By.cssSelector("#mat-option-2 > .mat-option-text")).click();

        driver.findElement(By.id("citySelector")).click();
        driver.findElement(By.cssSelector(".mat-option-text")).click();

        driver.findElement(By.id("mat-input-3")).click();
        driver.findElement(By.id("mat-input-3")).sendKeys("Direccion 1");
        driver.findElement(By.cssSelector(".ng-tns-c93-13 > .mat-form-field-infix")).click();
        driver.findElement(By.id("mat-input-4")).sendKeys("Frente al mercado");
        driver.findElement(By.id("mat-input-5")).click();
        driver.findElement(By.id("mat-input-5")).sendKeys("15");
        driver.findElement(By.id("mat-input-6")).click();
        driver.findElement(By.id("mat-input-6")).sendKeys("50");
        driver.findElement(By.cssSelector(".ng-tns-c93-16 > .mat-form-field-infix")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".mat-datepicker-toggle-default-icon"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".mat-datepicker-toggle-default-icon")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".mat-calendar-next-button"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".mat-calendar-next-button")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(4) > .mat-calendar-body-cell:nth-child(3) > .mat-calendar-body-cell-content")).click();
        driver.findElement(By.cssSelector(".mat-calendar-body-active > .mat-calendar-body-cell-content")).click();

        driver.findElement(By.id("saveBtn")).click();

        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.id("itineraryInput")).click();
        driver.findElement(By.id("itineraryMatInput")).sendKeys("Itinerario 1");

        driver.findElement(By.id("saveItineraryBtn")).click();

        driver.findElement(By.id("mat-input-8")).click();
        driver.findElement(By.id("mat-input-8")).sendKeys("Titulo 1");
        driver.findElement(By.id("mat-input-9")).click();
        driver.findElement(By.id("mat-input-9")).sendKeys("descripcion 1 detallado");
        driver.findElement(By.cssSelector(".btn-upload")).click();
        driver.findElement(By.id("input-img")).sendKeys("E:\\Pura img\\botw.jpg");
        driver.findElement(By.id("saveDetailedInfoBtn")).click();

    }
}
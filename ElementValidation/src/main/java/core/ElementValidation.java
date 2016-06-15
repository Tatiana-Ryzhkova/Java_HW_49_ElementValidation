package core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementValidation {

       public static void main(String[] args) {
              WebDriver driver = new FirefoxDriver();
              driver.get("http://learn2test.net/qa/apps/sign_up/v1/");
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              driver.manage().window().maximize();
boolean  fb_isPresent= driver.findElements(By.xpath("//*[@id='id_img_facebook']")).size() > 0;
              System.out.println("isPresent? " + fb_isPresent);
boolean  fb_isDisplayed =  driver.findElement(By.id("id_img_facebook")).isDisplayed();
              System.out.println("isDisplayed? " + fb_isDisplayed);
boolean  fb_isEnabled =  driver.findElement(By.id("id_img_facebook")).isEnabled();
              System.out.println("isEnabled? " + fb_isEnabled);
             Point fb_Location = driver.findElement(By.id("id_img_facebook")).getLocation();
              System.out.println("Location X: " + fb_Location.getX());
              System.out.println("Location Y: " + fb_Location.getY());
              Dimension fb_Size = driver.findElement(By.id("id_img_facebook")).getSize();
              System.out.println("Size Width: " + fb_Size.getWidth());
              System.out.println("Size Height: " + fb_Size.getHeight());
              driver.close();}}
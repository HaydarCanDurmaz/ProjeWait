package ProjeWait;

import Utlity.BaseDriver1;
import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Wait extends BaseDriver1 {

    @Test
    public void Task1() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Click me to start timer']")));
        driver.findElement(By.xpath("//*[text()='Click me to start timer']")).click();

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"demo\"]")));

        boolean status = element.isDisplayed();
        if (status) {
            System.out.println("visible");
        } else
            System.out.println("not visible");


            BekleKapat();
    }
    @Test
    public void Task2() {
        driver.get("https://qatest.twoplugs.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/section[7]/div/dl/dt[1]/span")));
        driver.findElement(By.xpath("/html/body/div/section[7]/div/dl/dt[1]/span")).click();


        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"You need a facebook account or a valid email address to sign up.\"]")));
        boolean varmi=element.isDisplayed();
        if (varmi){
            System.out.println("Gözüküyor");
        }else
            System.out.println("Gözükmüyor");

        BekleKapat();
    }
    @Test
    public void Task3() {
        driver.get("https://google.com/");



        driver.findElement(By.name("q")).sendKeys("selenium"+ Keys.ENTER);

        WebElement fisrt=new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[7]/div/div[11]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/a/h3")));

        Assert.assertTrue(fisrt.isDisplayed());
        System.out.println("fisrt = " + fisrt);
        BekleKapat();
    }
}

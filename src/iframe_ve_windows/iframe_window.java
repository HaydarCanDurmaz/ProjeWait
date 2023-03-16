package iframe_ve_windows;

import Utlity.BaseDriver;
import org.asynchttpclient.ClientStats;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class iframe_window extends BaseDriver {
    @Test
    public void senaryo1(){
        driver.get("https://demoqa.com/frames");

       List <WebElement> iframefind= driver.findElements(By.tagName("iframe"));
        List <WebElement> iframefind1= driver.findElements(By.tagName("//iframe"));

        System.out.println("iframefind1 = " + iframefind1.size());
        System.out.println("iframefind = " + iframefind.size());
        for (WebElement ifre : iframefind)
            System.out.println(ifre.getText());

        BekleKapat();

    }
    @Test
    public void senaryo2(){
        driver.get("https://demoqa.com/frames");
        WebElement iframe = driver.findElement(By.cssSelector("#frame1"));
        driver.switchTo().frame(iframe);

        WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        System.out.println(text.getText());

        BekleKapat();
    }
    @Test
    public void senaryo3(){
        driver.get("https://demoqa.com/browser-windows");
        WebElement button = driver.findElement(By.id("tabButton"));
        button.click();

        String anasayfa= driver.getWindowHandle(); // ana sayfa kaydedildi

        Set<String> browserid = driver.getWindowHandles();// tüm sekmelerin id lerini aldı


        for (String id : browserid)
            if (id.equals(anasayfa)){
                continue;}






        BekleKapat();

    }
}

package Utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver1 {
    public static WebDriver driver;






    static
    {
        KalanoncekileriKapat();

        Logger logger = Logger.getLogger("");// sisteme ait olan bütün logları üreten objeye/ servise ulaştım ""
        logger.setLevel(Level.SEVERE);// sadece erorları göster


        // outputtaki gerekmeyen logları kaldırıcaz
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();// ekran max yapıyor.

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        // Sadece Tüm sayfanın kodlarının bilgisayarınıza inmesi süresiyle ilgili
        // Bu eklenmezse Selenium  sayfa yüklenene kadar (sonsuza ) bekler.:
        // 30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver
        // eger 2 sn yüklerse 30 snnbeklemez

        // driver.manage().timeouts().implicitlyWait(dr);// Bütün WebElementlerşn element bazında elementte özel işlem yapılmadan önce
        // hazır hale gelmesi verilen süre // eger 2 sn yüklenirse 30 sn beklemez

    }



    public static void BekleKapat()
    {
        MyFunc.Bekle(3);
        driver.quit();
    }
    public static void KalanoncekileriKapat()
    {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }


}

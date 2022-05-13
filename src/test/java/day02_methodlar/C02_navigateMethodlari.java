package day02_methodlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_navigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        /*

        eger testimiz birden fazla noktaya ileri geri hareket edecekse
         driver.get() yerine driver.navigate()
        methodu kullaniriz. ve sonrasinda forward back refresh methodu yapilir
         */

        // 1. method url ye gider
        driver.navigate().to("https://www.techproeducation.com");
        Thread.sleep(3000);

        driver.navigate().to("https://facebook.com");
        Thread.sleep(3000);

        driver.navigate().to("https://www.siirt.edu.tr/");
        Thread.sleep(3000);

        // 2. method  geldigi bir onceki sayfaya dondurulur
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        // 3. method  back ile dondurulen bir sayfadan tekrar ileri gider
        driver.navigate().forward();
        Thread.sleep(3000);

        // 4. method icinde olunan sayfayi yeniler
        driver.navigate().refresh();
        Thread.sleep(3000);


        driver.close();






    }
}

package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {

         /*
         en ilkel haliilebir otomsayon yapmak icin
         class imiza otomasyon icin gerekli olan webdriver in yerini gostermemiz gerelir
         bunu icin java kutuphansin de System.setProperty() methodunu kullaniriz
         method 2 parametre istemektedir...
         ilki kullanacagimiz driver : webdriver.chrome.driver
         ikincisi bu driver in fiziki yolu : src/resources/drivers/chromedriver.exe
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.siirt.edu.tr");

        Thread.sleep(2000);

        driver.get("https://www.ebay.de");

        Thread.sleep(2000);

        driver.close();



    }

}

package day02_methodlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); //browser i tam sayfa yapar

        driver.get("https://www.siirt.edu.tr");

        // 1. method icinde olunan sayfanin basligini String olarak getirir
        System.out.println("actual Titel : "+ driver.getTitle()); //actual Titel : Siirt Üniversitesi bilimin ışığında

        //2. method string url ye gider
        System.out.println("actual Url : "+ driver.getCurrentUrl()); //actual Url : https://www.siirt.edu.tr/

        //3.method icinde olunan sayfaninkaynak kodlarini String olarak getirir
        String sayfaKaynakKodlari = driver.getPageSource(); // sayfa kaynagini veriyor
        // ctrl U ile anasayfada kodlara gidip ctrl F  ile aratilabilr
        String arananKelime ="robots";

        if (sayfaKaynakKodlari.contains(arananKelime)) {
            System.out.println("Kaynak kodu testi PASSED"); //Kaynak kodu testi PASSED
        } else System.out.println("Kaynak kodlarinda " + arananKelime + " yok test FAILD");
        //Kaynak kodu testi PASSED

        //4.method icinde olunan sayfanin veya tab larin handlr degerini getirir
        System.out.println(driver.getWindowHandle());
        ////benzersiz olarak acilan window a ait hash codunu verir
        //CDwindow-9EBA037D4F8BE5F22A7C961A4D545C82

        // 5. method icinde bulunan sayfanin Url ini String olarak getirir

        System.out.println(driver.getCurrentUrl()); //https://www.siirt.edu.tr/

        driver.close();







    }
}

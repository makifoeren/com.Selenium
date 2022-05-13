package day02_methodlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilktest {
            /*  1-"https://www.siirt.edu.tr" url'ine gidin
                2- Basligin Siirt kelimesi icerdigini test edin
                3- Url'in "https://www.siirt.edu.tr") a esit oldugunu test edin
                4- sayfayi kapatin
 */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1-"https://www.siirt.edu.tr" url'ine gidin

        driver.get("https://www.siirt.edu.tr");

        //2- Basligin Siirt kelimesi icerdigini test edin

        String actualTitel = driver.getTitle();
        String arananKelime = "Siirt";

        if (actualTitel.contains(arananKelime)) {
            System.out.println("Titel testi PASSEND");
        } else System.out.println("Titel testi FAILED");


        //  3- Url'in "https://www.siirt.edu.tr") a esit oldugunu test edin

        String actualUral = driver.getCurrentUrl();
        String expecteUrl = "https://www.siirt.edu.tr/";

        if (actualUral.equals(expecteUrl)) {
            System.out.println("URL testi PASSEND");
        } else {
            System.out.println("actual URL : " + actualUral + " beklenen URL den farkli, test FAILED");}

        //  4- sayfayi kapatin

        driver.close();

    }
}

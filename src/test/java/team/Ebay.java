package team;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class Ebay {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // web sayfasına gidin. https://www.ebay.de/
        driver.get("https://www.ebay.de/");


        //b. Search(ara) “fahrrad”
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@name='_nkw']"));
        aramaKutusu.sendKeys("fahrrad" + Keys.ENTER);

        ////c. Ebay'da görüntülenen ilgili sonuçların sayısını yazdırın
        //List<WebElement> linklerListesi = driver.findElements(By.xpath("//h1[@class='srp-controls__count-heading']"));
        List<WebElement> linklerListesi = driver.findElements(By.className("srp-controls__count-heading"));

        WebElement sonucYazisiIstenenElement = linklerListesi.get(0);
        System.out.println(sonucYazisiIstenenElement.getText()); //25.000+ Ergebnisse für fahrrad


        // d.  Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> urunResimListesi = driver.findElements(By.xpath("//img[@alt='26/27,5 Zoll Mountainbike Fahrrad " +
                "21-Gang Vollfederung Scheibenbremsen']"));


        WebElement ilkUrunResmi = urunResimListesi.get(0); // cikan sonuclari listeye koyduktan sonra ilk elemti aliyoruz
        ilkUrunResmi.click();

        driver.quit();




    }
}
package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

//  1-driver olusturalim //  2-java class'imiza chromedriver.exe'yi tanitalim
        WebDriver driver=new ChromeDriver();
        
//  3-driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();
        
//  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
        //    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        

//  5-"sahibinden.com" adresine gidelim
        driver.get("https://www.ebay.de");
        
        Thread.sleep(10000);
        
//  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
        String ebayTitle=driver.getTitle();
        System.out.println("ebayTitle = " + ebayTitle);
        
        String ebayUrl=driver.getCurrentUrl();
        System.out.println("ebayUrl = " + ebayUrl);

        
//  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim

        if (ebayTitle.contains("fahrrad") && ebayTitle.contains("fahrrad")){
            System.out.println("fahrrad yazisi icerdi");
        }else System.out.println("fahrrad yazisi icerdi");

//  8-Ardindan "gittigidiyor.com" adresine gidelim
        driver.get("https://www.amazon.com");

//  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
//    kontrol edelim
        String  amazonTitle=driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(amazonTitle.contains("sitesi")?"Passen":"Failed");

        boolean isTrue=driver.getTitle().contains("sitesi");
        if (isTrue) System.out.println("Test Passed");
        else System.out.println("Test Feiled");

        //  10-Bi onceki web sayfamiza geri donelim
        driver.navigate().back();


//  11-sayfayi yenileyelim
        driver.navigate().refresh();

//  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();
//  13-En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();
}
}
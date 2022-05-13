package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElementMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


         /*
    1- amazon.com a gidip arama kutusunu locate edin
    2- Arama kutusunu tagName nin input oldugunu test edin
    3- Arama kutusunun name attribute nun  degerini field-keywords  oldugunu test edin
     */

        // 1- amazon.com a gidip arama kutusunu locate edin

        driver.get("https://amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


        String expectedTextName = "yanlizlik";
        String actualTextName = aramaKutusu.getText();
        if (expectedTextName.equals(actualTextName)) {
            System.out.println("TextName testi PASSEND");
        } else {
            System.out.println("TextName testi FAILED");
        }

        System.out.println("web elementin uzerinfdeki yaz :" + aramaKutusu.getText()); //1.method

        // 2- Arama kutusunu tagName nin input oldugunu test edin

        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName(); //2. method web elemtin tag ismi

        if (expectedTagName.equals(actualTagName)) {
            System.out.println("TagName testi PASSEND");
        } else {
            System.out.println("TagName testi FAILED");
        }

        //3- Arama kutusunun name attribute nun  degerini   oldugunu test edin

        String expectedNameDegeri = "field-keywords";
        String actualNameDegeri = aramaKutusu.getAttribute("name"); // 3.method attribute degeri getirir

        if (expectedNameDegeri.equals(actualNameDegeri)) {
            System.out.println("name attribute testi PASSEND");
        } else {
            System.out.println("name attribute testi FAILED");
        }

        System.out.println("konum :" + aramaKutusu.getLocation()); // 4.method konum bulma
        System.out.println("web elemwnt yuksekligi :" + aramaKutusu.getSize().height); // 5. method yuksekligi

        driver.close();
        driver.quit();

        /*
        <input type="text" id="twotabsearchtextbox" value="nutella"
        name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
        webElementIsmi.getTextName() --> arama kutusu üzerinde birsey olmadigi icin birsey dondurmez
        webElementIsmi.getTagName() --> daha once locate ettigimiz bir webelemtin tagname'ni dondurur
        webElementIsmi.getAttribute(attributeIsmi) --> daha once locate ettigimiz bir webelemtin
                                                      istedigim attribute'unun degerini dondurur
         webElementIsmi.isEnable() --> web elementi erisilebilir ise true yoksa false doner
          webElementIsmi.isDisplayed() -->web elementi gorunur ise true yoksa false doner
          webElementIsmi.isSelected() -->web elementi secili ise true yoksa false doner

         */


    }
}

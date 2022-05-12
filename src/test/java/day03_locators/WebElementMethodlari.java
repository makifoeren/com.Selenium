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

        // 2- Arama kutusunu tagName nin input oldugunu test edin

        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();

        if (expectedTagName.equals(actualTagName)) {
            System.out.println("TagName testi PASSEND");
        } else {
            System.out.println("TagName testi FAILED");
        }

        //3- Arama kutusunun name attribute nun  degerini   oldugunu test edin

        String expectedNameDegeri = "field-keywords";
        String actualNameDegeri = aramaKutusu.getAttribute("name");

        if (expectedNameDegeri.equals(actualNameDegeri)) {
            System.out.println("name attribute testi PASSEND");
        } else {
            System.out.println("name attribute testi FAILED");
        }

        System.out.println("konum :" + aramaKutusu.getLocation());
        System.out.println("web elemwnt yuksekligi :" + aramaKutusu.getSize().height);

        driver.close();

        /*
        <input type="text" id="twotabsearchtextbox" value="nutella"
        name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
        webElementIsmi.getTagName() --> daha once locate ettigimiz bir webelemtin tagname'ni dondurur
        webElementIsmi.getAttribute(attributeIsmi) --> daha once locate ettigimiz bir webelemtin
                                                      istedigim attribute'unun degerini dondurur
         */


    }
}

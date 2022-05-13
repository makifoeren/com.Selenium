package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.ebay.de/");

        WebElement aramaKutusu=driver.findElement(By.xpath("/html/body/header/table/tbody/tr" +
                "/td[5]/form/table/tbody/tr/td[1]/div[1]/div/input[1]"));
        // // findElement(By.....locator) istedigimiz web elelwmntini bize döndürür

        // biz de web elementini kullanmak icin objeye assign ederiz
        aramaKutusu.sendKeys("fahrrad"+ Keys.ENTER);



        /*
        <input type="text" class="gh-tb ui-autocomplete-input" aria-autocomplete="list"
        aria-expanded="false" size="50" maxlength="300" aria-label="Wonach suchen Sie?"
         placeholder="Wonach suchen Sie?" id="gh-ac" name="_nkw" autocapitalize="off" autocorrect="off" spellcheck="false"
        autocomplete="off" aria-haspopup="true" role="combobox" aria-owns="ui-id-1">
         */

    }
}

package team;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xpath {
        /*
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
 a.google web sayfasına gidin. https://www.startpage.com/
 b. Search(ara) “city bike”

         */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a.google web sayfasına gidin. https://www.startpage.com/

        driver.get("https://www.startpage.com/");


        // b. Search(ara) “city bike”

       WebElement aramaButonu= driver.findElement(By.xpath("//input[@name='query'][1]"));
       aramaButonu.sendKeys("city bike"+ Keys.ENTER);



    }

}

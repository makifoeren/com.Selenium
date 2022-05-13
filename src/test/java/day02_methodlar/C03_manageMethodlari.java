package day02_methodlar;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //1 .method Browser in olculerini verir
        System.out.println("pencere olculeri : " + driver.manage().window().getSize());  //pencere olculeri : (1050, 708)

        //2. method Browser in koordinatlarini verir
        System.out.println("pencere konumu : " + driver.manage().window().getPosition());//pencere konumu : (10, 10)


        //3 .method Browser i maximize yapar
        driver.manage().window().maximize();
        // maximize iken boyut alaim
        System.out.println("pencere olculeri : " + driver.manage().window().getSize());//pencere olculeri : (1382, 744)
        System.out.println("pencere konumu : " + driver.manage().window().getPosition()); //pencere konumu : (-8, -8)

        //4. method   Browser i minimize yapar
        driver.manage().window().minimize();

        //5. method   full screen yapar
        driver.manage().window().fullscreen();

        System.out.println("fullscreen konum : " + driver.manage().window().getPosition());//fullscreen konum : (0, 0)
        System.out.println("fullscreen boyut : " + driver.manage().window().getSize());      //fullscreen boyut : (1366, 768)


        //6. method Browser i istenen koordinata tasir
        driver.manage().window().setPosition(new Point(15, 15));

        //7. method Browser i istenen olculere tasir
        driver.manage().window().setSize(new Dimension(900, 600));

        System.out.println("yeni pencere olculeri : " + driver.manage().window().getSize());
        System.out.println("yeni pencere konumu : " + driver.manage().window().getPosition());

        //yeni pencere olculeri : (900, 600)
        //yeni pencere konumu : (15, 15)


        //8. method istenen sayfa acilincaya kadar max bekleme suresini belirtit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //sayfa acilana kadar bekler
        driver.get("https://www.siirt.edu.tr");

        // 9. method calisan Browseri kapatir
        driver.close();

        //10. method acik olan tum Browseri kapatir
        driver.quit();




    }
}

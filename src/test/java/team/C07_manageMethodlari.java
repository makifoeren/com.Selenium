package team;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_manageMethodlari {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //1 .method Browser in olculerini verir

        System.out.println("Perecere olculer :" + driver.manage().window().getSize());

        //2. method Browser in koordinatlarini verir
        System.out.println("Perecere konumu :" +driver.manage().window().getPosition());

        //3. method Browser i istenen koordinata tasir

        driver.manage().window().setPosition(new Point(10,10));
        System.out.println("Perecere konumu2 :" +driver.manage().window().getPosition());


        //4. method Browser i istenen olculere tasir
        driver.manage().window().setSize(new Dimension(800,500));

        System.out.println("Perecere olculer2 :" + driver.manage().window().getSize());

        driver.close();


    }
}

package day04_xpathCssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. Absolute xpath yazmak icin en basa // sonraki her adima / yazarak web elemente kadar tag lar yazilir.
        Eger ayni path e sahip fazla elementn varsa index kullanilir [2] gibi 1 den baslar. Tavsiye edilmiyor

        2. Relartiv Xpath
         Web element te ki 3 temel bilesenin uniq kombinasyonu ile
         1-- tag name   input
         2-- attribute  type,id,value,name,autocomplete,placeholder,class..
         3-- atribute value  type--> 'text', id-->'twotabsearchtextbox', valua-->

         //tagName[@attributeIsmi='attributeValue']
         */

/*
<img src="https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcREHlf85_
CeEFr5YQIWXIHGqmUxWc0ePb0zqOQdzHJrRR8CNymxvIa1K8oW_PZqoVlPSQpasm5IA7a3PziBEtzjNPaWIKeLDA&amp;usqp=CAs"
 aria-label="Bild von
vidaXL 3056792 Holland Dutch Bike 28 inch Wheel 57 cm Frame Male (92313+92314)">
 */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //   1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        //2- Add Element butonuna basin
        //  driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //driver.findElement(By.xpath("//button[text()='Add Element']")).click(); yazi varsa boyle yapilabilir
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();


        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@class=\"added-manually\"]"));

        if (deleteButonu.isDisplayed()) {
            System.out.println("delete butonu testi PASSED");
        } else {
            System.out.println("delete butonu testi FAILED");
        }


        //4- Delete tusuna basin

        Thread.sleep(3000);
        deleteButonu.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//h3"));

        if (addRemoveYaziElementi.isDisplayed()) {
            System.out.println("addRemoveYaziElementi testi PASSED");
        } else {
            System.out.println("addRemoveYaziElementitesti FAILED");
        }

        Thread.sleep(3000);
        driver.close();
    }
}

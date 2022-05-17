package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get(" https://www.techlistic.com/p/selenium-practice-form.html");

        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();
        //driver.findElement(By.xpath("//a[@id='cookieChoiceDismiss']")).click();


        //fill the firstname
        driver.findElement(By.name("firstname")).sendKeys("Akif");
        Thread.sleep(1000);

        //fill the lastname lastname
        driver.findElement(By.name("lastname")).sendKeys("Oren");
        Thread.sleep(1000);

        //check the gender
        driver.findElement(By.id("sex-0")).click();
        Thread.sleep(1000);

        //check the experience
        driver.findElement(By.id("exp-2")).click();
        Thread.sleep(1000);

        //fill the date
        driver.findElement(By.id("datepicker")).sendKeys("16/05/2022");
        Thread.sleep(1000);

        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        Thread.sleep(1000);

        //choose your tool -> Selenium Webdriver
        driver.findElement(By.id("tool-2")).click();
        Thread.sleep(1000);

        //choose your continent -> Antartica
        driver.findElement(By.xpath("//option[text()='Antartica']")).click();
        Thread.sleep(1000);

        //choose your command  -> Browser Commands //option[text()='Browser Commands']
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        Thread.sleep(1000);

        //click submit button //button[@class='btn btn-info']
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Thread.sleep(1000);

        driver.close();


    }
}

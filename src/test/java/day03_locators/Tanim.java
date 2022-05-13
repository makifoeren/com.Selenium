package day03_locators;

public class Tanim {
    /*
    WebElement 3 bilesenden olusur
    <td> tag
    <input type="email"> type attribute -- email value
   input tag
   Locators lar la yerleri bulunur eylemleri gercekleestirmek icin ihtiyac var, konum belileyiciler
   XPath herturluyu yakalar ve css locator ozel olarak tanimlanir

   twotabsearchtextbox--> amazindaki arama kutu
   Locatorlar 8 tane olarak dizay edilmi 6 si attribute ile ilgilidir
   2 tane  XPath ve css locator
   attribute
    1. id 2.name 3.className 4.tagName 5. linkText 6.paritalLinkText
   7. xpath 8. cssSelector
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
         autocomplete="off" placeholder=""
         class="nav-input nav-progressive-attribute"
          dir="auto" tabindex="0" aria-label="Suche">


1-id="twotabsearchtextbox" yanlis olursa  NoSuchElementException
2-name="field-keywords"
3-className ilk basta oluyor saglikli islemez
4-linkText a oldugu zaman kullanilir link in tamami kullanilmali  Adresses
5-paritalLinkText bir parcasi olsada olur adres
6-tagName  birden fazla ayni ada sahip olacagi icin cok tavsiye edilmez liste almak icin kullanilir findElements
yontemi ile kullanilmasi onerilir

-->> findElement(By.id(twotabsearchtextbox)-->> tanimladigimiz web elemntini yerini driver de
bulabilmesi icin kullanilir
variable atama yaparak buluruz
 WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));


 --->>findElements(By.tagName("a") sayfadaki link sayisi

  List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki link sayisi : " + linklerListesi.size());







     */
}

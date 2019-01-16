package Interview;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Localization_DE {
    private WebDriver driver;
    private java.lang.String baseUrl;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://ecconnect.com.ua/";
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @Test
    public void Test() throws IOException {

        driver.manage().window().maximize(); //открытие на полный экран
        driver.get("https://ecconnect.com.ua"); //ссылка на сайт
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"UPC-demo\"]/a/img")).click();// Тестировать
        driver.findElement(By.xpath("//*[@id=\"buy\"]/table/tbody/tr/td[1]/form/input[12]")).click(); // Купить


        String parent_window = driver.getWindowHandle(); //Переход на 2 окно
        Set<String> s1 = driver.getWindowHandles();
        s1.iterator();
        Iterator<String> i1=s1.iterator();
        while (i1.hasNext()){
            String child_window = i1.next();
            if(!((parent_window)).equalsIgnoreCase(child_window)){
                driver.switchTo().window(child_window);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                }

            }
        }
        //Выбор НЕМЕЦКОГО языка
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Введіть дані платіжної картки'])[2]/preceding::img[1]")).click();

        WebElement magazinesRadioBtn = driver.findElement(By.cssSelector("input[id='paymentTypeCard']")); // выбор типа оплаты

        if (magazinesRadioBtn.isSelected()) {
            System.out.println("Radio button is selected by default");
        } else {
            magazinesRadioBtn.click();
        }

        List resultList_DE= new ArrayList();

        // Идентификация элементов
        WebElement web_1 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/caption"));// Tragen Sie, bitte, die Daten der Karte ein.
        String d1 = web_1.getText();
        System.out.println(d1);
        resultList_DE.add(d1);

        WebElement web_2 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[2]/td/b"));// Zahlungdaten
        String d2 = web_2.getText();
        System.out.println(d2);
        resultList_DE.add(d2);

        WebElement web_3 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[3]/td[1]"));// Auftrag-ID
        String d3 = web_3.getText();
        System.out.println(d3);
        resultList_DE.add(d3);

        WebElement web_4 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[4]/td[1]"));//  Händler
        String d4 = web_4.getText();
        System.out.println(d4);
        resultList_DE.add(d4);

        WebElement web_5 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[5]/td[1]"));// Beschreibung
        String d5 = web_5.getText();
        System.out.println(d5);
        resultList_DE.add(d5);

        WebElement web_6 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[6]/td[1]"));// Gesamtbetrag
        String d6 = web_6.getText();
        System.out.println(d6);
        resultList_DE.add(d6);

/**
         WebElement web_7 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[7]/td[1]/b"));// Bezahlverfahren !not found in Excel!
         String d7 = web_7.getText();
         System.out.println(d7);
         resultList_DE.add(d7);

         WebElement web_8 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[8]/td/table/tbody/tr[2]/td[2]/b"));// Kredit- / Debitkarte !not found in Excel!
         String d8 = web_8.getText();
         System.out.println(d8);
         resultList_DE.add(d8);
 */
        WebElement web_9 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[9]/td[1]"));// Kartentyp
        String d9 = web_9.getText();
        System.out.println(d9);
        resultList_DE.add(d9);

        WebElement web_10 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[10]/td[1]"));// Kartennummer
        String d10 = web_10.getText();
        System.out.println(d10);
        resultList_DE.add(d10);

        WebElement web_11 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[11]/td[1]"));// Gültig bis
        String d11 = web_11.getText();
        System.out.println(d11);
        resultList_DE.add(d11);

        WebElement web_12 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[12]/td[1]"));// E-mail
        String d12 = web_12.getText();
        System.out.println(d12);
        resultList_DE.add(d12);

        WebElement web_13 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[1]/td[3]/table/tbody/tr[2]/td")); // Um weitere Informationen zu bekommen klicken Sie auf Bild
        String d13 = web_13.getText();
        System.out.println(d13);
        resultList_DE.add(d13);

        WebElement web_14 = driver.findElement(By.xpath("//*[@id=\"cardForm\"]/table/tbody/tr[14]/td/table/tbody/tr/td[2]"));  // Anmerkung : Es kann sein, dass Ihre Bank auf der nächsten Seite die Daten Ihrer Karte prüfen wird.
        String d14 = web_14.getText();
        System.out.println(d14);
        resultList_DE.add(d14);



        //Ввод реквизитов
        driver.findElement(By.id("CardNumber")).sendKeys("4999999999990011"); //ввод номера карты
        driver.findElement(By.id("ExpMonth")).click();
        new Select(driver.findElement(By.id("ExpMonth"))).selectByVisibleText("12"); //месяц
        driver.findElement(By.id("ExpYear")).click();
        new Select(driver.findElement(By.id("ExpYear"))).selectByVisibleText("2050");//год
        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("troyanda12@ukr.net");//почта
/**
         WebElement web_15 = driver.findElement(By.xpath("//*[@id=\"cardDataSubmit\"]")); // >> Weiter !NOT FOUND VALUE OF BUTTON FROM WEB PAGE!
         String d15 = web_15.getCssValue("web_15");
         System.out.println(d15);
         resultList_DE.add(d15);
*/
        driver.findElement(By.id("cardDataSubmit")).click(); //подтверждение

        //Идентефикация елиментов на 2 странице
        WebElement web_16 = driver.findElement(By.xpath("//*[@id=\"cvcForm\"]/table/tbody/tr[12]/td/font")); // Tragen Sie den CVV2/CVC2 Code ein, um die Bezahlung abzuschließen
        String d16 = web_16.getText();
        System.out.println(d16);
        resultList_DE.add(d16);

        WebElement web_17 = driver.findElement(By.xpath("//*[@id=\"cvcForm\"]/table/tbody/tr[14]/td/table/tbody/tr/td[2]")); // Die Authorisierung der Zahlungskarte folgt. Warten Sie bis zum Ende der Authorisierung OHNE eine Taste zu DRÜCKEN. Es ermöglicht den Zahlungsprozess korrekt abzuwickeln.
        String d17 = web_17.getText();
        System.out.println(d17);
        resultList_DE.add(d17);

        //Сравнение считаных строк на НЕМЕЦКОМ со строками из Excel
        Excel_DE excel_de = new Excel_DE();
        List expectedList_DE = excel_de.getList();
        Assert.assertEquals(resultList_DE, expectedList_DE);

        //Ввод кода карты
        driver.findElement(By.id("Cvc")).click();
        driver.findElement(By.id("Cvc")).clear();
        driver.findElement(By.id("Cvc")).sendKeys("999"); //код карты
        driver.findElement(By.id("CVCSubmit")).click(); //подтверждение

        System.out.println("Done");
    }
}





package org.base;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

public class BaseTest {
    @BeforeClass(alwaysRun = true,description = "Creating configs for our test")//alwaysRun = true - немає значення чи наш тест впав чи відпрацював завжди буде виконувати ці методи
    public void configuration(){
        //        Configuration.browser="firefox";  //тут якщо треба запускати тести на якомусь іншому браузері(firefox наприклад)
        com.codeborne.selenide.Configuration.holdBrowserOpen=false; //якщо true то після того як наш тест впаде то певний час наш браузер не буде закриватися(суто для локального тестування,перед тим як проект буде залитий)
        com.codeborne.selenide.Configuration.startMaximized=true; //відповідає в якому розмірі відкриється наше вікно(true - відкриється в повному форматі, false - в маленькому)
//        Configuration.browserSize="1920x1080";//вручну вказуємо розмір нашого екрану
        com.codeborne.selenide.Configuration.screenshots=true;//якщо тест впаде тоді в консолі буде посилання на цей скріншот
        com.codeborne.selenide.Configuration.headless=false;//будуть проводитися тести але без візуалу
        com.codeborne.selenide.Configuration.pageLoadStrategy="normal";//ця конфігурація оптимізуватиме роботу наших тестів(normal-це швидкість по дефолту,eager - робить максимально швидкими(але не дуже надійно))
        com.codeborne.selenide.Configuration.pageLoadTimeout=20000; //це час який буде очікувати наш драйвер до того щоб наша сторінка відкрилася
        Configuration.timeout=10000; //це час який селенід чекає, щоб знайте елемент на сторінці
//        Configuration.reportsFolder="screenshots"; //це папка в якій зберігаються репорти(в папку screenshots(назва довільна)(її треба попереднь стоврити))
    }
    @BeforeMethod(alwaysRun = true,description = "Opening base URL")
    public void setUp(){
        Selenide.open("https://www.saucedemo.com/");
//        Selenide.open("https://www.amazon.com/");//для тестування амазону
//        Selenide.open("https://www.stats.govt.nz/large-datasets/csv-files-for-download/");
//        Selenide.open("https://ps.uci.edu/~franklin/doc/file_upload.html");
        // https://www.stats.govt.nz/large-datasets/csv-files-for-download/ - URL TO DOWNLOAD FILE
//    https://ps.uci.edu/~franklin/doc/file_upload.html - URL TO UPLOAD FILE
        //    https://ps.uci.edu/~franklin/doc/file_upload.html - URL TO UPLOAD FILE
    }
    @AfterMethod(alwaysRun = true,description = "Web Driver cleanup")
    public void cleanWebDriver(){ //ми будем очищати наш веб драйвер після кожного тесту
        Selenide.clearBrowserCookies();
        Selenide.refresh(); //оновлює сторінку
        Selenide.open("about:blank");//пуста сторінка
    }
    @AfterSuite(alwaysRun = true,description = "Closing Web Browser ")
    public void tearDown(){
         Selenide.closeWebDriver();//просто закриваєм наш веб драйвер
    }
}

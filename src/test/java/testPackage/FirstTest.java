package testPackage;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import org.testng.annotations.*;

public class FirstTest extends BaseTest {

////    @BeforeSuite //найперший відпрацьовує метод який позначений цією анотацією
//    @BeforeClass //потім йде ця анотація і перед @BeforeTest
//    public void selenideConfig(){
////        Configuration.browser="firefox";  //тут якщо треба запускати тести на якомусь іншому браузері(firefox наприклад)
//        Configuration.holdBrowserOpen=false; //якщо true то після того як наш тест впаде то певний час наш браузер не буде закриватися(суто для локального тестування,перед тим як проект буде залитий)
//        Configuration.startMaximized=true; //відповідає в якому розмірі відкриється наше вікно(true - відкриється в повному форматі, false - в маленькому)
////        Configuration.browserSize="1920x1080";//вручну вказуємо розмір нашого екрану
//        Configuration.screenshots=true;//якщо тест впаде тоді в консолі буде посилання на цей скріншот
//        Configuration.headless=true;//будуть проводитися тести але без візуалу
//        Configuration.pageLoadStrategy="normal";//ця конфігурація оптимізуватиме роботу наших тестів(normal-це швидкість по дефолту,eager - робить максимально швидкими(але не дуже надійно))
//        Configuration.pageLoadTimeout=20000; //це час який буде очікувати наш драйвер до того щоб наша сторінка відкрилася
//        Configuration.timeout=10000; //це час який селенід чекає, щоб знайте елемент на сторінці
////        Configuration.reportsFolder="screenshots"; //це папка в якій зберігаються репорти(в папку screenshots(назва довільна)(її треба попереднь стоврити))
//
//    }
////    @BeforeTest
//    @BeforeMethod //анотація перед самим тестом(@Test)
//    public void setUp(){
//        System.out.println("Setting up our test");
//        Selenide.open("https://www.google.com"); //відкриється гугл
//    }
    @Test(priority = 2) //так позначаються тести, priority - визначає пріоритет тестів
    public void test(){
        System.out.println("My first test");
        Selenide.sleep(5000);// і гугл закриється через 5 секунд
    }
//    @AfterTest
//    public void tearDown(){
//        System.out.println("Test run success");
//    }
}

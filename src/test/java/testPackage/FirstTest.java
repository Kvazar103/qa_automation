package testPackage;

import com.codeborne.selenide.*;
import com.codeborne.selenide.Configuration;
import org.apache.commons.io.FileUtils;
import org.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class FirstTest extends BaseTest {

//    @BeforeClass
//    public void setUpDownloadFile(){
//        Configuration.reportsFolder="downloads";//кастомна папка в якій будуть зберігатися наші репорти
//        Configuration.fileDownload= FileDownloadMode.FOLDER;
//    }
   public static String getFilePathByName(String fileName){
    return new File("src/main/resources/files/" + fileName).getAbsolutePath();//берем абсолютний шлях до нашого файлу
}

    @Test
    public void test(){
       $(By.xpath("//input[1]")).uploadFile(new File(getFilePathByName("annual-enterprise-survey-2021-financial-year-provisional-csv.csv.crdownload ")));//завантажуємо файл
        Selenide.sleep(2000);
//        $(By.xpath("//input[@placeholder='Username']")).append("standard_user"); //вставляєм "standard_user"
//        Selenide.sleep(1000);
//        $(By.xpath("//input[@placeholder='Password']")).append("secret_sauce");//вставляєм пароль
//        Selenide.sleep(3000);
//        $(By.xpath("//input[@placeholder='Username']")).clear();//clear - очищає наше поле (логін в нашому випадку)
//        Selenide.sleep(1000);
//        $(By.xpath("//input[@type='submit']")).click();//клік на кнопку логін(існує ще метод doubleClick())
//        Selenide.sleep(3000);
        //знизу юзаєм амазон
//        $(By.xpath("//input[@id='twotabsearchtextbox']")).append("Java");//вводить джаву
//        Selenide.actions().sendKeys(Keys.ENTER).perform();//для того щоб клікнуло ентер
//        $(By.xpath("//select[@class=\"product_sort_container\"]")).click();
//        Selenide.sleep(3000);
//        Selenide.actions().sendKeys(Keys.ESCAPE).perform();//нажимаєм клавішу escape для того щоб вийти з меню
//        Selenide.actions().keyDown($(By.xpath("xpath from element")),Keys.SHIFT).perform();//тут ми зажимаєм нашу клавішу шифт
//        Selenide.actions().keyUp($(By.xpath("To element target")),Keys.SHIFT).perform();//тут ми відпускаєм нашу клавішу шифт
//        Selenide.actions().dragAndDrop($(By.xpath("source element")),$(By.xpath("target element")));//це з якого по яке місце будем перетягувати елемент
//        Selenide.actions().dragAndDropBy($(By.xpath("element")),200,0);//перетягуєм елемент по вісі
//        Selenide.sleep(3000);

//        try {
//            $(By.xpath("(//h3[@class='block-document__title']//a)[1]")).scrollIntoView(true);//прогортає нашу сторінку
//            Selenide.sleep(2000);
//            File download = $(By.xpath("(//h3[@class='block-document__title']//a)[1]")).download();//скачуєм
//            String path=download.getPath();
////            FileUtils.deleteDirectory(new File("downloads"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //hover

//        $(By.xpath("//button[@id='react-burger-menu-btn']")).click();
//        Selenide.sleep(2000);
//        $(By.xpath("//a[@id='about_sidebar_link']")).hover();//мишкою на елемет наводить
//        Selenide.sleep(1000);

        //виводим текст

//        String text = $(By.xpath("(//div[@class=\"inventory_item_label\"])[1]")).text();
//        System.out.println(text);
//
//        List<String> texts = $$(By.xpath("//div[@class=\"inventory_item_label\"]")).texts();//берем колекцію ($$-позначається колекція)
//        for (String element:texts){
//            System.out.println(element);
//        }
//        Selenide.sleep(3000);
//
//        //виводим веб елементи
//        ElementsCollection elements = $$(By.xpath("//div[@class='inventory_item_name']"));
//        for (SelenideElement element : elements) {
//            System.out.println(element);
//        }
    }

}

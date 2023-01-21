package testPackage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class FirstTest extends BaseTest {


    @Test
    public void test(){
//        $(By.className("submit-button")).click();//$- пошук локаторів в селеніді,ця команада буде клікати на кнопку(шукаючи елемент по класу)
//        $(By.id(""));//шукає по айді
        $(By.xpath("//input[@placeholder='Username']")).append("standard_user"); //вставляєм текст в юзернейм (шукаєм по xpath)
        ElementsCollection inventoryList = $$(By.xpath("//div[@class='inventory_list']//child::div[@class='inventory_item']"));//$$-це вже колекція
        Selenide.sleep(5000);
    }

}

package testPackage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class WaitTest extends BaseTest {
    @Test
    public void testMethod(){
        $(By.xpath("//input[@placeholder='Username']")).shouldBe(Condition.exist).append("standard_user"); //Condition.exist перевіряє чи інпут присутній в нашому дом дереві(visible -чи він видимий на сайті)
        //$(By.xpath("//input[@placeholder='Username']")).shouldBe(Condition.hidden).append("standard_user");//перевіряє чи він невидимий
        $(By.xpath("//input[@placeholder='Username']")).shouldHave(Condition.value("password")).append("standard_user");//має бути пасворд і тоді виконається умова
        Selenide.sleep(1000);
        $(By.xpath("//input[@placeholder='Password']")).append("secret_sauce");//вставляєм пароль
        Selenide.sleep(1000);
        $(By.xpath("//input[@type='submit']")).click();//клік на кнопку логін(існує ще метод doubleClick())
        Selenide.sleep(3000);//неявне очікування
        $(By.xpath("//span[text()=\"Products\"]")).waitUntil(Condition.visible,1000);//метод буде чекати поки не появиться титул (макс час очікування 3 секунди)
        String text = $(By.xpath("//span[text()=\"Products\"]")).shouldBe(Condition.readonly).text();
        System.out.println(text);
    }

}

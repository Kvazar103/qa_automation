package testPackage;

import org.testng.annotations.Test;

public class SecondTest {
    @Test(priority = 1) //так позначаються тести, priority - визначає пріоритет тестів
    public void test2(){
        System.out.println("My second test");
    }
}

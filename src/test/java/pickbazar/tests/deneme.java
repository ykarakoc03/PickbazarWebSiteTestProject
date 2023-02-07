package pickbazar.tests;


import org.testng.annotations.Test;
import pickbazar.pages.HomePage;
import pickbazar.utilities.BaseTestReport;

public class deneme extends BaseTestReport {


    @Test
    public void testgiris() throws InterruptedException {
        driver.get("https://shop-pickbazar-rest.vercel.app/");

HomePage hp = new HomePage(driver);

     hp
             .homePageMenuDropDown("bags")
             .hompageLeftDropDownAndButton("Wallet");


Thread.sleep(3000);


    }


}

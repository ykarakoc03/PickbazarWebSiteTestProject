package pickbazar.tests;


import org.testng.annotations.Test;
import pickbazar.pages.P02_HomePage;
import pickbazar.utilities.BaseTestReport;

public class deneme extends BaseTestReport {


    @Test
    public void testgiris() throws InterruptedException {
        driver.get("https://shop-pickbazar-rest.vercel.app/");

P02_HomePage hp = new P02_HomePage(driver);

     hp
             .homePageMenuDropDown("bags")
             .hompageLeftDropDownAndButton("Wallet");


Thread.sleep(3000);


    }


}

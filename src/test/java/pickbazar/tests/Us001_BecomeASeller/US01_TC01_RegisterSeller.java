package pickbazar.tests.Us001_BecomeASeller;

import org.testng.annotations.Test;
import pickbazar.pages.P02_HomePage;
import pickbazar.pages.P03_LoginAndRegisterPage;
import pickbazar.utilities.BaseTestReport;
import pickbazar.utilities.ConfigReader;

public class US01_TC01_RegisterSeller extends BaseTestReport {


    @Test
    public void testRegisterSeller() {
        extentTest = extentReports.createTest("testRegisterSeller");


        P02_HomePage hp = new P02_HomePage(driver);

        hp
                .btnBecomeASeller();


        P03_LoginAndRegisterPage sp =new P03_LoginAndRegisterPage(driver);

        sp
                .txtName(ConfigReader.getProperty("sellerName"))
                .txtEmail(ConfigReader.getProperty("sellerEmail"))
                .txtPassword(ConfigReader.getProperty("sellerPassword"))
                .btnResgister();

        softAssert.assertTrue(sp.avatar().isDisplayed());

    }
}

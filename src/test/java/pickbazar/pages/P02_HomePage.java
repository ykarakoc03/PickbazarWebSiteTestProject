package pickbazar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Set;


public class P02_HomePage extends P01_FunctionClass {


    public P02_HomePage(WebDriver driver) {
        super(driver);
    }

    By joinButton = By.xpath("//button[text()='Join']");
    By linkBecomeASeller = By.linkText("Become a Seller");
    By contactBtn = By.linkText("Contact");
    By fqaBtn = By.linkText("FAQ");
    By offersBtn = By.linkText("Offers");
    By shopsBtn = By.linkText("Shops");
    By homeSearchBox = By.id("search");
    By cartBtn = By.cssSelector(".hidden.product-cart");
    By homePageCategory = By.xpath("//button[contains(@id,'menu-button')]");


    // Ana sayfada üst tarafta bulunan Join
    public P02_HomePage btnJoin() {
        click(joinButton);
        return this;
    }


    // Ana sayfada üst tarafta bulunan Become A Seller
    //yeni tab sayfada acılır!!
    public void btnBecomeASeller() {
       selectedNewWindow(linkBecomeASeller);
    }


    // Ana sayfada üst tarafta bulunan Contact linki
    public void btnContact() {
        click(contactBtn);

    }


    // Ana sayfada üst tarafta bulunan FAQ linki
    public void btnFQA() {
        click(fqaBtn);

    }

    // Ana sayfada üst tarafta bulunan Offers linki
    public void btnOffers() {
        click(offersBtn);
    }

    // Ana sayfada üst tarafta bulunan Shops linki
    public void btnShops() {
        click(shopsBtn);
    }


    // Ana sayfada bulunan Arama Kutusu
    public P02_HomePage txtHomeSearchBox(String search) {
        sendKeys(homeSearchBox, search);
        return this;
    }


    //Homepage cart butonu
    public P02_HomePage btnCart() {
        click(cartBtn);
        return this;
    }


    //Homepage de  istenen kategoriyi seçmemizi sağlar
    public P02_HomePage homePageMenuDropDown(String categori) {

        click(homePageCategory);
        String xpath = "//a[contains(@href,'/')]";
        selectedWithCategori(xpath, categori.trim().toLowerCase());
        actions.sendKeys(Keys.ESCAPE);
        return this;
    }


    //Anasayfa sol taraftaki butonlar
    public P02_HomePage hompageLeftDropDownAndButton(String categori) {
        String xpath = "//ul/li[contains(.,'')]";
        selectedWithCategori(xpath, categori);

        return this;
    }




}

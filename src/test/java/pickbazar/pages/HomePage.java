package pickbazar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HomePage extends FunctionClass {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Ana sayfada üst tarafta bulunan Join
    By joinButton = By.xpath("//button[text()='Join']");

    public HomePage btnJoin() {
        click(joinButton);
        return this;
    }

    // Ana sayfada üst tarafta bulunan Become A Seller
    //yeni tab sayfada acılır!!

    By linkBecomeASeller = By.linkText("Become a Seller");

    public void btnBecomeASeller() {
        click(linkBecomeASeller);

    }


    // Ana sayfada üst tarafta bulunan Contact linki
    By contactBtn = By.linkText("Contact");

    public void btnContact() {
        click(contactBtn);

    }


    // Ana sayfada üst tarafta bulunan FAQ linki
    By fqaBtn = By.linkText("FAQ");

    public void btnFQA() {
        click(fqaBtn);

    }

    // Ana sayfada üst tarafta bulunan Offers linki
    By offersBtn = By.linkText("Offers");

    public void btnOffers() {
        click(offersBtn);

    }

    // Ana sayfada üst tarafta bulunan Shops linki
    By shopsBtn = By.linkText("Shops");

    public void btnShops() {
        click(shopsBtn);

    }


    // Ana sayfada bulunan Arama Kutusu
    By homeSearchBox = By.id("search");

    public HomePage txtHomeSearchBox(String search) {
        sendKeys(homeSearchBox, search);
        return this;
    }


    //Homepage cart butonu
    By cartBtn = By.cssSelector(".hidden.product-cart");

    public HomePage btnCart() {
        click(cartBtn);
        return this;
    }


    By homePageCategory = By.xpath("//button[contains(@id,'menu-button')]");

    //Homepage de  istenen kategoriyi seçmemizi sağlar
    public HomePage homePageMenuDropDown(String categori) {

        click(homePageCategory);
        String xpath = "//a[contains(@href,'/')]";
        selectedWithCategori(xpath, categori.trim().toLowerCase());
        actions.sendKeys(Keys.ESCAPE);
        return this;
    }


    public HomePage hompageLeftDropDownAndButton(String categori) {
        String xpath = "//ul/li[contains(.,'')]";
        selectedWithCategori(xpath, categori);

        return this;
    }




}

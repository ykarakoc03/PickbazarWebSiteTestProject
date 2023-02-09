package pickbazar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P03_LoginAndRegisterPage extends P01_FunctionClass {

    public P03_LoginAndRegisterPage(WebDriver driver) {
        super(driver);
    }


By nameBox = By.xpath("//input[contains(@id,'name')]");
By emailBox = By.xpath("//input[contains(@id,'email')]");
By passwordBox = By.xpath("//input[contains(@id,'password')]");
By avatarBtn = By.xpath("//button[contains(@id,'menu-button')]");
By registerBtn = By.xpath("//button[contains(.,'Register')]");
By loginBtn = By.xpath("//button[contains(.,'Login')]");
By loginLinkBtn = By.xpath("//a[contains(.,'Login')]");


public P03_LoginAndRegisterPage txtName(String name){
    sendKeys(nameBox,name);
    return  this;
}

public P03_LoginAndRegisterPage txtEmail(String email){
    sendKeys(emailBox,email);
    return  this;
}

public P03_LoginAndRegisterPage txtPassword(String password){
    sendKeys(passwordBox,password);
    return  this;
}

public WebElement avatar(){

    return getLocate(avatarBtn);
}

public void btnResgister(){

    click(registerBtn);
}

public P03_LoginAndRegisterPage btnLogin(){

    click(loginBtn);
    return this;
}
public P03_LoginAndRegisterPage btnLoginLink(){

    click(loginLinkBtn);
    return this;
}





}

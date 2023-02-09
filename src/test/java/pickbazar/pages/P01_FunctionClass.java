package pickbazar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public abstract class P01_FunctionClass {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    public P01_FunctionClass(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }

    //locate elemanına text gönderir
    public void sendKeys(By locate, String text) {
        WebElement element = driver.findElement(locate);
        actions.scrollToElement(element).perform();
        wait.until(ExpectedConditions.visibilityOf(element)).clear();
        element.sendKeys(text);
    }


    //locate elemanına tıklar
    public void click(By locate) {
        WebElement element = driver.findElement(locate);
        actions.scrollToElement(element).perform();
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }


    //Locate elemanını getirir
    public WebElement getLocate(By locate) {
        WebElement element = driver.findElement(locate);
        actions.scrollToElement(element).perform();
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }


    //locate elemanların listesindeki istenen index elemanını getirir
    public WebElement getLocate(By locate, int index) {
        List<WebElement> element = driver.findElements(locate);
        wait.until(ExpectedConditions.visibilityOf(element.get(index)));
        actions.scrollToElement(element.get(index)).perform();
        return element.get(index);
    }


    //locate elemanlarını  List olarak getirir
    public List<WebElement> getLocateList(By locate) {
        List<WebElement> element = driver.findElements(locate);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        return element;
    }

    //verilen xpath arasına categoriyi ekler ve bu locete tıklar
    //Xpath "contains" key içerecek şekilde yazılmalı!
    public void selectedWithCategori(String xpath, String categori) {
        xpath = xpath.substring(0, xpath.length() - 3) + categori + xpath.substring(xpath.length() - 3);

        By selectedCategory = By.xpath(xpath);
        click(selectedCategory);

    }


    public void selectedNewWindow(By by) {
        String homePageWindowHandle = driver.getWindowHandle();
        click(by);

        Set<String> wh = driver.getWindowHandles();
        for (String each : wh) {
            driver.switchTo().window(each);
            if (each.equals(homePageWindowHandle)) {
                driver.close();
            }

        }
    }


}

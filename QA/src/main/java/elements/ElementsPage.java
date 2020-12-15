package elements;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElementsPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div")
    WebElement elementBtn;
    @FindBy(how= How.XPATH, using = "//*[@id=\"item-2\"]/span")
    WebElement radioBtn;
    @FindBy(how=How.XPATH,using = "//*[@id=\"item-3\"]")
    WebElement webTablesBtn;
    @FindBy(how=How.XPATH,using = "//*[@id=\"item-4\"]")
    WebElement btnBtn;
    @FindBy(how=How.XPATH,using = "//span[text()='Links']")
    WebElement linkBtn;
    @FindBy(how = How.XPATH,using = "//span[text()='Broken Links - Images']")
    WebElement brokenLinkBtn;

    public void goToElementsPage(){
        driver.get("https://demoqa.com/elements");
    }
    public void userCanClickOnElementsOption() throws InterruptedException {
        goToElementsPage();
        elementBtn.click();
        //Thread.sleep(2000);
    }
    public void goToRadioButtonOption() throws InterruptedException {
        userCanClickOnElementsOption();
        radioBtn.click();
    }
    public void goToAnyOptionsFromElements(WebElement element) throws InterruptedException {
        userCanClickOnElementsOption();
        element.click();
    }
//    public void userCanGoToBrokenLinkPage() throws InterruptedException{
//        userCanClickOnElementsOption();
//        brokenLinkBtn.click();
//    }
}

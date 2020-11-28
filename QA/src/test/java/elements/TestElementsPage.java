package elements;

import common.CommonAPI;
import elements.ElementsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestElementsPage extends CommonAPI {
    @Test
    public void testUserCanSeeElementDropdown() throws InterruptedException {
        ElementsPage el = PageFactory.initElements(driver,ElementsPage.class);
        el.userCanClickOnElementsOption();
    }
    @Test
    public void testUserCanNavigateToRadioOption() throws InterruptedException {
        ElementsPage el = PageFactory.initElements(driver,ElementsPage.class);
        el.goToRadioButtonOption();
        //Thread.sleep(2000);
    }
    @Test
    public void testUserCanGoToAnyOptionFromElements() throws InterruptedException {
        ElementsPage el = PageFactory.initElements(driver,ElementsPage.class);
        el.goToAnyOptionsFromElements(el.webTablesBtn);
        if(driver.getPageSource().contains("Web Tables")){
            System.out.println("we are in the right page");
        }else{
            System.out.println("something went wrong");
        }
    }
}

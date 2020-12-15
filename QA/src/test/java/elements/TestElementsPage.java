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
//    @Test
//    public void testUserCanGoToAnyOptionFromElements() throws InterruptedException {
//        ElementsPage el = PageFactory.initElements(driver,ElementsPage.class);
//        el.goToAnyOptionsFromElements(el.linkBtn);
//    }
//    @Test
//    public void testUserCanGoToBrokenLinkPage() throws InterruptedException{
//        ElementsPage el = PageFactory.initElements(driver,ElementsPage.class);
//        el.userCanGoToBrokenLinkPage();
//    }
}

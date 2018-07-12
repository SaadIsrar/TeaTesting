import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TeaTesting {
    private WebDriver driver;
    private Homepagetea menu;
    private MenuPage menny;

    String url = "http://www.practiceselenium.com/welcome.html";


    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Development\\web_driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^the correct web address$")
    public void the_correct_web_address(){
        driver.get(url);
        assertEquals(url, driver.getCurrentUrl());
    }

    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page(){
        menu = PageFactory.initElements(driver, Homepagetea.class);
        menu.click();
        assertEquals("Menu", driver.getTitle());
    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products(){
        menny = PageFactory.initElements(driver, MenuPage.class);
        assertEquals("Green Tea", menny.getgreenTeaText());
        assertEquals("Red Tea", menny.getredTeaText());
        assertEquals("Oolong Tea", menny.getoolongTeaText());
        assertTrue(menny.findOolongTeaPic());
    }

    @When("^I click the checkout button$")
    public void i_click_the_checkout_button(){
        driver.navigate().to("http://www.practiceselenium.com/menu.html");
        menny = PageFactory.initElements(driver, MenuPage.class);
        menny.clickcheckoutbutton();
    }

    @Then("^I am taken to the checkout page$")
    public void i_am_taken_to_the_checkout_page(){
        assertEquals("Check Out", driver.getTitle());
    }
    @After
     public void teardown(){
        driver.quit();
   }
}

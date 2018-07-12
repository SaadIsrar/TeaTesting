import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {
    @FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
    private WebElement greenTeaText;
    @FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong")
    private WebElement redTeaText;
    @FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231735\"]/div/p/span/span/strong")
    private WebElement oolongTeaText;
    @FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000451942740\"]/div/div/img")
    private WebElement oolongTeaPic;
    @FindBy (xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
    private WebElement checkoutbutton;


    public boolean findOolongTeaPic(){
        return oolongTeaPic.isDisplayed();
    }

    public String getgreenTeaText(){
        return greenTeaText.getText();
    }

    public String getredTeaText(){
        return redTeaText.getText();
    }

    public String getoolongTeaText(){
        return oolongTeaText.getText();
    }
    public void clickcheckoutbutton(){
        checkoutbutton.click();
    }

}


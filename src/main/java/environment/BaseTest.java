package environment;

import utils.AssertionMethods;
import utils.ClickElementsMethods;
import utils.ConfigurationMethods;
import utils.InputMethods;
import utils.JavascriptHandlingMethods;
import utils.MiscMethods;
import utils.NavigateMethods;
import utils.ProgressMethods;
import utils.ScreenShotMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface BaseTest
{
    public static WebDriver driver = Env.CreateWebDriver(Env.getBrowserName());
    public static WebDriverWait wait = new WebDriverWait(driver, 30);


    MiscMethods miscmethodObj = new MiscMethods();
    NavigateMethods navigationObj = new NavigateMethods();
    AssertionMethods assertionObj = new AssertionMethods();
    ClickElementsMethods clickObj = new ClickElementsMethods();
    ConfigurationMethods configObj = new ConfigurationMethods();
    InputMethods inputObj = new InputMethods();
    ProgressMethods progressObj = new ProgressMethods();
    JavascriptHandlingMethods javascriptObj = new JavascriptHandlingMethods();
    ScreenShotMethods screenshotObj = new ScreenShotMethods();
}

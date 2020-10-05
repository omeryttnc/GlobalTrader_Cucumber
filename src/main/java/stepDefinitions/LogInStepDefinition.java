package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogInStepDefinition {
    WebDriver driver;

    @Given("user already on website")
    public void user_should_go_to_website() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\savsa\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.glbtrader.com/index.html");
    }

    @When("title of log in page global trade")
    public void title_should_be_global_trade() {
        String title_of_Website = driver.getTitle();
        String expected_title = "Online Shopping Site for Mobiles, Fashion, Books,";
        Assert.assertEquals(expected_title, title_of_Website);
    }

    @Then("click on seller join now")
    public void click_on_seller_join() {
        driver.findElement(By.xpath("//div/div[@class='pull-right section_top_bar']/a[3]")).click();
    }

    @Then("^click on agent seller$")
    public void click_on_agent_seller() {
        driver.findElement(By.id("vender_type")).click();
    }

    @Then("^enter information \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void enter_information(String name, String email, String domain, String mobileNumber,String  county,String state, String city, String adress, String EnterPostalCode, int CategoriesAsInt,String Password) {
        driver.findElement(By.id("vender_name")).sendKeys(name);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("sub_domain")).sendKeys(domain);
        driver.findElement(By.id("vender_mobile")).sendKeys(mobileNumber);
        WebElement countrySelect = driver.findElement(By.xpath("(//div/select)[2]"));
        Select select = new Select(countrySelect);
        select.selectByValue(county);
        driver.findElement(By.id("select_state")).sendKeys(state);
        driver.findElement(By.id("select_city")).sendKeys(city);
        driver.findElement(By.id("vender_address")).sendKeys(adress);
        driver.findElement(By.id("zip_code_input")).sendKeys(EnterPostalCode);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
        WebElement category = driver.findElement(By.xpath("//*[@id=\"alert_vender_category\"]/select"));
        Select select1 = new Select(category);
        select1.selectByIndex(CategoriesAsInt);
    }


    @Then("complete registration")
    public void complete_registration() {
        driver.findElement(By.xpath("//button[@value='Login']")).click();
    }
}

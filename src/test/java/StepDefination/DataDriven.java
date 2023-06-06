package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

    public static WebDriver driver;
    @Given("user is on Login Page")
    public void user_is_on_login_page() {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.whiteboxqa.com/");

    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_user_and_password(String user, String pwd) {
        driver.findElement(By.id("loginButton")).click();

        driver.findElement(By.id("username")).sendKeys(user);


        driver.findElement(By.id("password")).sendKeys(pwd);

    }

    @And("user click on Login button")
    public void user_click_on_login_button() {
        driver.findElement(By.id("login")).click();
    }
        @Then("user navigate to Landing Page")
        public void user_navigate_to_landing_page () {
        driver.getPageSource().contains("Logout");
        driver.close();

        }

}
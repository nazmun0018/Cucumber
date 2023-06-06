package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1test {
    public static WebDriver driver;
    @Given("user is on main page")
    public void user_is_on_main_page() {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.whiteboxqa.com/");

    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        driver.findElement(By.id("loginButton")).click();

    }
    @And("user will enter username and password and click submit button")
    public void user_will_enter_username_and_password_and_click_submit_button() {
        driver.findElement(By.id("username")).sendKeys("Vinayreddy3337");


        driver.findElement(By.id("password")).sendKeys("WhiteboxQA3336");

        driver.findElement(By.id("login")).click();

    }
    @Then("user need to navigate to the Home page")
    public void user_need_to_navigate_to_the_home_page() {
        driver.getPageSource().contains("Logout");
        driver.close();


    }






}

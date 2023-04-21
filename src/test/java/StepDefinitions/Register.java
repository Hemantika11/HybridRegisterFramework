package StepDefinitions;

import ResultVerifivations.ResultVerificationForHomePage;
import ResultVerifivations.ResultVerificationForRegisterPage;
import WebElements.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Register
{
    ResultVerificationForRegisterPage resultVerificationForRegisterPage =new ResultVerificationForRegisterPage();
     RegisterPage registerPage =new RegisterPage();
     ResultVerificationForHomePage resultVerificationForHomePage= new ResultVerificationForHomePage();

    @Given("^User able to open Browser$")
    public void user_able_to_open_Browser() {
    }

    @Given("^Enter Url$")
    public void enter_Url()  {

    }

    @When("^User click on Register Link$")
    public void user_click_on_Register_Link() {

    }

    @When("^User click on Gender Female$")
    public void user_click_on_Gender_Female()  {

    }

    @When("^I have entered a First Name$")
    public void i_have_entered_a_First_Name() {

    }

    @When("^I have entered a Last Name$")
    public void i_have_entered_a_Last_Name() {

    }

    @When("^I have entered a Date of Birth$")
    public void i_have_entered_a_Date_of_Birth()  {

    }

    @When("^I have entered a Email$")
    public void i_have_entered_a_Email()  {

    }

    @When("^I have entered a Company name$")
    public void i_have_entered_a_Company_name()  {

    }

    @When("^I have entered a Password$")
    public void i_have_entered_a_Password()  {

    }

    @When("^I have entered a Confirm password$")
    public void i_have_entered_a_Confirm_password()  {

    }

    @When("^I click on Register button$")
    public void i_click_on_Register_button()  {

    }
}

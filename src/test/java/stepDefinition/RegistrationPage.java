package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoggedInPage.visibility_productcategory_formalshoes;
import static pages.LoginPage.*;
import static pages.RegistrationPage.visibility_user_registration_page;

public class RegistrationPage {

    @Then("User should be able to view the Registration page")
    public void User_successfully_enters_the_login_details() throws InterruptedException {
        visibility_user_registration_page();

    }

}

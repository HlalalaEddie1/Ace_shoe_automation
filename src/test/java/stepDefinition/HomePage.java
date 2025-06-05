package stepDefinition;

import io.cucumber.java.en.Given;
import static pages.HomePage.*;

public class HomePage {

    @Given("^User navigates to the login page$")
    public void user_navigates_to_the_Login_page() throws InterruptedException {

        click_hamburger_menu();
        click_sign_link();
    }

    @Given("User navigates to the online product page")
    public void User_navigates_to_the_online_product_page() throws InterruptedException {

        click_hamburger_menu();
        click_OnlineProducts_link();

    }
}

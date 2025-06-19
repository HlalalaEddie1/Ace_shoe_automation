package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {

    public static String productcategory_formalshoes= "//*[text()='Formal Shoes']";
    public static String productcategory_sportsshoes= "//*[text()='Sports']";
    public static String productcategory_sneakers = "//*[text()='Sneakers']";


    //public static String productcategory_sneakers= "//*[text()='Sneakers Shoes']";


    public static void visibility_productcategory_formalshoes() throws InterruptedException{
        String actualproductcategory_fs = driver.findElement(By.xpath(productcategory_formalshoes)).getText();
        assertEquals("Formal Shoes",actualproductcategory_fs);
    }

    public static void visibility_productcategory_sportsshoes() throws InterruptedException{

        String actualproductcategory_ss = driver.findElement(By.xpath(productcategory_sportsshoes)).getText();
        assertEquals("Sports",actualproductcategory_ss);

    }

    public static void visibility_productcategory_sneakershoes() {
        String actualproductcategory_s = driver.findElement(By.xpath(productcategory_sneakers)).getText();
        //assertEquals("Sneakers",actualproductcategory_s)
        assertEquals("Sneakers", actualproductcategory_s);
        ;


    }


}



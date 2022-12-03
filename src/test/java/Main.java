import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Main {


    public static void main(String[] args) throws InterruptedException {
        WishListTest wishListTest = new WishListTest();
        wishListTest.addToWishListTest();

        RegisterTest registerTest = new RegisterTest();
        registerTest.registerWithSuccess();

        LoginTest loginTest = new LoginTest();
        loginTest.loginWithValidData();


















    }



}

package bdd.com.pages.shopping;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShoppingCartPage extends PageObject {

    @FindBy(xpath = "//a[@class='btn_action checkout_button']")
    protected WebElementFacade btn_checkout;

    @FindBy(id = "first-name")
    protected WebElementFacade txt_firstname;
    @FindBy(id = "last-name")
    protected WebElementFacade txt_lastname;
    @FindBy(id = "postal-code")
    protected WebElementFacade txt_postal;

    @FindBy(xpath = "//input[@class='btn_primary cart_button']")
    protected WebElementFacade btn_continuar;

    @FindBy(xpath = "//a[@class='btn_action cart_button']")
    protected WebElementFacade btn_finish;
}

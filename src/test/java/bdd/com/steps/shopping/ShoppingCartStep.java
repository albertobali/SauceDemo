package bdd.com.steps.shopping;

import bdd.com.pages.shopping.ShoppingCartPage;
import net.thucydides.core.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage {

    @Step("Click en checkout")
    public void clickCheckout(){
        btn_checkout.click();
    }

    @Step("Ingresar nombre")
    public void ingresarFirstName(String firstname){
        txt_firstname.sendKeys(firstname);
    }

    @Step("Ingresar apellido")
    public void ingresarLastName(String lastname){
        txt_lastname.sendKeys(lastname);
    }

    @Step("Ingresar Codigo postal")
    public void ingresarCodigoPostal(String codPostal){
        txt_postal.sendKeys(codPostal);
    }

    @Step("Click en Continuar")
    public void clickContinue(){
        btn_continuar.click();
    }

    @Step("Click en Finalizar")
    public void clickFinish(){
        btn_finish.click();
    }
}

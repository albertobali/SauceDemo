package bdd.com.steps.validations;

import bdd.com.pages.validations.ValidationPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion del modulo de productos")
    public Boolean tittleVisible(){
        return lbl_producto.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed(){
        return lbl_errorMassage.isDisplayed();
    }

    @Step("Validar los productos listados en el carrito")
    public Boolean productosEstanListados(){

        for(WebElementFacade producto: listaProductos){
            if(producto.isDisplayed()){
                return true;
            }
        }
        return false;
    }

    @Step("Validar carrito vacio")
    public Boolean carritoVacio(){

        for(WebElementFacade producto: listaProductos){
            if(!producto.isDisplayed()){
                return false;
            }
        }
        return true;
    }

    @Step("Validar finalizacion de orden")
    public Boolean textoCompraFinalizadaDisplayed(){
        return lbl_textoFinish.isDisplayed();
    }
}


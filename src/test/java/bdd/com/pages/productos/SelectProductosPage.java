package bdd.com.pages.productos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;


public class SelectProductosPage extends PageObject {


    @FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
    protected List<WebElementFacade> productos;

    @FindBy(xpath = "//*[local-name()='svg']//ancestor::a")
    protected WebElementFacade iconoCarrito;


}

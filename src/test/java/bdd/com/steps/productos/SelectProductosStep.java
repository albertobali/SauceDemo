package bdd.com.steps.productos;

import bdd.com.pages.productos.SelectProductosPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.List;

public class SelectProductosStep extends SelectProductosPage {

    @Step("Agregar productos al carrito de compras")
    public void addProductos(int cantidad) {

        List<WebElementFacade> listaProductos = new ArrayList<>(productos);
        int elementosTotales = listaProductos.size();

            if(cantidad > 0 && cantidad <= elementosTotales) {
                for (int i = 0; i < cantidad; i++) {
                    try {
                        Actions act = new Actions(getDriver());
                        act.click(listaProductos.get(i)).perform();
                    } catch (WebDriverException e) {
                        System.out.println("error de conexion. Reintentando...");
                        i--;
                    }
                }
            }else{
                System.out.println("La cantidad es invalidad o es mayor a la lista de productos actual.");
            }
    }

    @Step("Click en el icono del carrito de compras")
    public void clickIconoCarrito(){
        iconoCarrito.click();
    }



}

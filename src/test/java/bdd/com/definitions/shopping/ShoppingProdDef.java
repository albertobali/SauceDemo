package bdd.com.definitions.shopping;

import bdd.com.steps.productos.SelectProductosStep;
import bdd.com.steps.shopping.ShoppingCartStep;
import bdd.com.steps.validations.ValidationStep;
import io.cucumber.java.an.Cuan;
import io.cucumber.java.an.Y;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ShoppingProdDef {

    @Steps(shared = true)
    SelectProductosStep selectProducto;

    @Steps(shared = true)
    ValidationStep validate;

    @Steps(shared = true)
    ShoppingCartStep shopping;

    @Y("agrega productos al carrito de compras")
    public void agregaProductosCarrito() throws InterruptedException {
        selectProducto.addProductos(3);
    }

    @Y("da click en el icono del carrito")
    public void clicIconoCarrito(){
        selectProducto.clickIconoCarrito();
    }

    @Entonces("el sistema deberia listar los productos agregados en el carrito de compras")
    public void productosListados(){
        Assert.assertTrue(validate.productosEstanListados());
    }

    @Entonces("el sistema deberia mostrar la cesta sin productos")
    public void CarritoVacio(){
        Assert.assertTrue(validate.carritoVacio());
    }

    @Cuando("completa todo el registro de la orden")
    public void completaFormulario(){
        shopping.clickCheckout();

        shopping.ingresarFirstName("prueba");
        shopping.ingresarLastName("apellido");
        shopping.ingresarCodigoPostal("1472");

        shopping.clickContinue();
        shopping.clickFinish();
    }

    @Entonces("el sistema deberia procesar la compra")
    public void completarCompra(){
        Assert.assertTrue(validate.textoCompraFinalizadaDisplayed());
    }
}

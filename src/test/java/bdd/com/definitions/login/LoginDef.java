package bdd.com.definitions.login;

import bdd.com.steps.login.LoginStep;
import bdd.com.steps.validations.ValidationStep;
import bdd.com.utilities.website.WebSite;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    String url_base = "https://www.saucedemo.com/v1/index.html";

    @Dado("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo(url_base);
    }

    @Cuando("ingresa credenciales validas")
    public void userLoginValido(){
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.ClickLogin();
    }

    @Entonces("la aplicacion deberia mostrar el modulo principal de productos")
    public void ingresoCorrecto(){
        Assert.assertTrue(validate.tittleVisible());
    }

    @Cuando("ingresa credneciales invalidas")
    public void userLoginInValido(){
        login.typeUsername("standard_user");
        login.typePassword("secret");
        login.ClickLogin();
    }

    @Entonces("la aplicacion deberia mostrar un mensaje de error")
    public void ingresoIncorrecto(){
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}

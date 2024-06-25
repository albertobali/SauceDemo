package bdd.com.steps.login;

import bdd.com.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Inresar Usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);
    }

    @Step("Inresar password")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("Dar clic boton login")
    public void ClickLogin(){
        btn_login.click();
    }

}

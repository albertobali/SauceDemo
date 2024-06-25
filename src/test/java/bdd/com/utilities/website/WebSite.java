package bdd.com.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {

    @Steps(shared = true)
    PageObject web;

    @Step("Abrir sitio web")
    public void navigateTo(String url) {
        web.setDefaultBaseUrl(url);
        web.open();
    }

}

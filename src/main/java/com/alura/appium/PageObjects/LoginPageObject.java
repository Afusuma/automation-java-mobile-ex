package com.alura.appium.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.internal.FindsById;
import org.w3c.dom.html.HTMLInputElement;

public class LoginPageObject extends PageObjectBase {

    private MobileElement botaoCadastro;
    private final By botaoCadastrarID;

    public LoginPageObject(AppiumDriver driver) {
        super(driver);
        botaoCadastrarID = By.id("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
    }

    @Override
    public void BuscarElementos(){

        botaoCadastro = (MobileElement) driver.findElement(botaoCadastrarID);
    }

    public CadastroPageObject IrParaTelaCadastro() {
        botaoCadastro.click();
        return new CadastroPageObject(this.driver);
    }
}

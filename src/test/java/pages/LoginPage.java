package pages;

import utils.Driver;
import maps.LoginMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void inputNomeUsuario(String usuario) {
        loginMap.inpNomeUsuario.sendKeys(usuario);
    }

    public void clickEntrarUsuario() {
        loginMap.btnEntrar.click();
    }

    public void inputSenha(String senha) {
        loginMap.inpSenha.sendKeys(senha);
    }

    public void clickEntrarSenha() {
        loginMap.btnEntrar.click();
    }

    public void getMensagemErro() {
        loginMap.msgError.getText();
    }

    public void getInfoPage() {
        loginMap.infoPage.getText();
    }

}

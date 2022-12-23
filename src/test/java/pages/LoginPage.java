package pages;

import core.Driver;
import maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void inputNomeUsuario(){
        Driver.visibility(loginMap.inpNomeUsuario);
        loginMap.inpNomeUsuario.sendKeys("nilton.araujo");
    }

    public void clickEntrarUsuario(){
        Driver.visibility(loginMap.btnEntrar);
        loginMap.btnEntrar.click();
    }

    public void inputSenha(){
        Driver.visibility(loginMap.inpSenha);
        loginMap.inpSenha.sendKeys("N!L2602842020");
    }

    public void clickEntrarSenha(){
        Driver.visibility(loginMap.btnEntrar);
        loginMap.btnEntrar.click();
    }

}

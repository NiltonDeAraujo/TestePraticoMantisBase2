package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {

    @FindBy(name = "username")
    public WebElement inpNomeUsuario;
    @FindBy(css = "*[value='Entrar']")
    public WebElement btnEntrar;
    @FindBy(name = "password")
    public WebElement inpSenha;
    @FindBy(xpath = "//span[@class='user-info']")
    public WebElement infoPage;
    @FindBy(xpath = "//p[contains(text(),'Sua conta pode estar desativada ou bloqueada ou o ')]")
    public WebElement msgError;
}

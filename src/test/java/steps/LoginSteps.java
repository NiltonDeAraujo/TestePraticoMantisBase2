package steps;

import core.Driver;
import enums.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.TarefaPage;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    LoginPage loginPage;
    TarefaPage tarefaPage;

    @Before
    public void iniciaNavegador(){
        new Driver(Browser.CHROME);
    }
    @After
    public void fechaNavegador(){
        Driver.getDriver().quit();
    }

    @Dado("que estou no portal mantis bug tracker")
    public void queEstouNoPortalMantisBugTracker() {
        Driver.getDriver().get("http://mantis-prova.base2.com.br");
        loginPage = new LoginPage();
    }

    @Quando("informo o usuario")
    public void informoOUsuario() {
        loginPage.inputNomeUsuario();
    }
    @Quando("aciono o comando entrar")
    public void acionoOComandoEntrar() {
        loginPage.clickEntrarUsuario();
    }
    @Quando("informo a senha")
    public void informoASenha() {
        loginPage.inputSenha();
    }
    @Quando("aciono o comando entrar apos senha")
    public void acionoOComandoEntrarAposSenha() {
        loginPage.clickEntrarSenha();
    }
    @Entao("e apresentado a pagina minha visao")
    public void eApresentadoAPaginaMinhaVisao() {
        tarefaPage = new TarefaPage();
        String logado = tarefaPage.getUsuarioLogado();
         assertEquals("nilton.araujo",logado);
    }

    @Dado("que estou logado")
    public void queEstouLogado() {
        queEstouNoPortalMantisBugTracker();
        informoOUsuario();
        acionoOComandoEntrar();
        informoASenha();
        acionoOComandoEntrarAposSenha();
        eApresentadoAPaginaMinhaVisao();
    }
}

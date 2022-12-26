package steps;

import utils.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Dado("que estou no portal mantis bug tracker")
    public void queEstouNoPortalMantisBugTracker() {
        Driver.getDriver().get("http://mantis-prova.base2.com.br");
    }

    @E("informo o {string}")
    public void informoO(String usuario) {
        loginPage.inputNomeUsuario(usuario);
    }

    @E("aciono o comando entrar")
    public void acionoOComandoEntrar() {
        loginPage.clickEntrarUsuario();
    }

    @Quando("preencho o campo {string}")
    public void preenchoOCampo(String senha) {
        loginPage.inputSenha(senha);
    }

    @E("aciono o comando entrar apos senha")
    public void acionoOComandoEntrarAposSenha() {
        loginPage.clickEntrarSenha();
    }

    @Entao("e apresentado a pagina minha visao")
    public void eApresentadoAPaginaMinhaVisao() {
        loginPage.getInfoPage();
    }

    @Dado("que estou logado {string},{string}")
    public void queEstouLogado(String usuario, String senha) {
        queEstouNoPortalMantisBugTracker();
        informoO(usuario);
        acionoOComandoEntrar();
        preenchoOCampo(senha);
        acionoOComandoEntrarAposSenha();
        eApresentadoAPaginaMinhaVisao();
    }

    @Quando("informo o {string} e informo a {string}")
    public void informoOEInformoASenha(String usuario, String senha) {
        informoO(usuario);
        acionoOComandoEntrar();
        preenchoOCampo(senha);
        acionoOComandoEntrarAposSenha();
    }

    @Entao("e apresentado uma mensagem de erro")
    public void eApresentadoUmaMensagemDeErro() {
        loginPage.getMensagemErro();
    }
}

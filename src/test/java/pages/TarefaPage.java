package pages;

import org.openqa.selenium.WebDriver;
import utils.Driver;
import maps.TarefaMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TarefaPage {
    TarefaMap tarefaMap;

    public TarefaPage() {
        tarefaMap = new TarefaMap();
        PageFactory.initElements(Driver.getDriver(), tarefaMap);
    }

    public void clickCriarTarefa() {
        tarefaMap.btnCriarTarefa.click();
    }

    public void selectDropdownProjeto(String projeto) {
        Select select = new Select(tarefaMap.selectOpcaoProjeto);
        select.selectByVisibleText(projeto);
    }

    public void selectBtnProjeto() {
        tarefaMap.btnSelectProjeto.click();
    }

    public void setResumo(String resumo) {
        tarefaMap.inputResumo.sendKeys(resumo);
    }

    public void setDescricao(String descricao) {
        tarefaMap.inputDescricao.sendKeys(descricao);
    }
    public void clickCadastrarNovaTarefa() {
        tarefaMap.btnCadastrarNovaTarefa.click();
    }
    public void selectFrequencia(String frequencia)  {
        Select select = new Select(tarefaMap.selectOpcaoFrequencia);
        select.selectByVisibleText(frequencia);
    }
    public void selectGravidade(String gravidade) {
        Select select = new Select(tarefaMap.selectOpcaoGravidade);
        select.selectByVisibleText(gravidade);
    }
    public void selectPrioridade(String prioridade) {
        Select select = new Select(tarefaMap.selectOpcaoPrioridade);
        select.selectByVisibleText(prioridade);
    }
    public void setPlataforma(String plataforma) {
        tarefaMap.inputPlataforma.sendKeys(plataforma);
    }

    public void setSo(String so) {
        tarefaMap.inputSo.sendKeys(so);
    }

    public void setVersaoSo(String versaoSo) {
        tarefaMap.inputVersaoSo.sendKeys(versaoSo);
    }
    public void setPassoReproduzir(String passoReproduzir) {
        tarefaMap.inputComoReproduzir.sendKeys(passoReproduzir);
    }
    public void setInfAdicionais(String infAdicionais) {
        tarefaMap.inputInfAdicional.sendKeys(infAdicionais);
    }
    public void selectMarcadores(String marcadores) {
        tarefaMap.selectMarcador.sendKeys(marcadores);
    }
}

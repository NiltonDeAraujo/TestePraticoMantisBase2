package pages;

import core.Driver;
import io.cucumber.java.eo.Se;
import maps.TarefaMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TarefaPage {
    TarefaMap tarefaMap;

    public TarefaPage(){
        tarefaMap = new TarefaMap();
        PageFactory.initElements(Driver.getDriver(), tarefaMap);
    }
    public String getUsuarioLogado(){
        Driver.visibility(tarefaMap.getUsuarioLogado);
        return tarefaMap.getUsuarioLogado.getText();
    }
    public void verTarefa(){
        tarefaMap.verTarefa.click();
    }

    public void clickCriarTarefa(){
        tarefaMap.btnCriarTarefa.click();
    }

    public void selecFrequencia(String frequencia){
        Select select = new Select(tarefaMap.selectOpcaoFrequencia);
        select.selectByVisibleText(frequencia);

    }

    public void selecGravidade(String gravidade){
        Select select = new Select(tarefaMap.selectMarcador);
        select.deselectByVisibleText(gravidade);
    }

    public void selecPrioridade(String prioridade){
        Select select = new Select(tarefaMap.selectOpcaoPrioridade);
        select.deselectByVisibleText(prioridade);
    }

    public void selectPerfil(){
        tarefaMap.selectPerfil.click();
    }

    public void setPlataforma(String plataforma){
        tarefaMap.inputPlataforma.sendKeys();
    }

    public void setSo(String so){
        tarefaMap.inputSo.sendKeys();
    }

    public void setVersaoSo(String versaoSo){
        tarefaMap.inputVersaoSo.sendKeys();
    }

    public void setResumo(String resumo){
        tarefaMap.inputResumo.sendKeys();
    }

    public void setDescricao(String descricao){
        tarefaMap.inputDescricao.sendKeys(descricao);
    }

    public void setPassoReproduzir(String passoReproduzir){
        tarefaMap.inputComoReproduzir.sendKeys();
    }

    public void setInfAdicionais(String infAdicionais){
        tarefaMap.inputInfAdicional.sendKeys();
    }

    public void selectMarcadores(String marcadores){
        Select select = new Select(tarefaMap.selectMarcador);
        select.selectByVisibleText(marcadores);
    }

}

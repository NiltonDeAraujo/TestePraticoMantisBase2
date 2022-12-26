package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TarefaMap {
    @FindBy(xpath = "//span[contains(text(),'Criar Tarefa')]")
    public WebElement btnCriarTarefa;
    @FindBy(id = "select-project-id")
    public WebElement selectOpcaoProjeto;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement btnSelectProjeto;
    @FindBy(id = "summary")
    public WebElement inputResumo;
    @FindBy(name = "description")
    public WebElement inputDescricao;
    @FindBy(css = "*[type=submit]")
    public WebElement btnCadastrarNovaTarefa;
    @FindBy(name = "reproducibility")
    public WebElement selectOpcaoFrequencia;
    @FindBy(name = "severity")
    public WebElement selectOpcaoGravidade;
    @FindBy(name = "priority")
    public WebElement selectOpcaoPrioridade;
    @FindBy(name = "platform")
    public WebElement inputPlataforma;
    @FindBy(name = "os")
    public WebElement inputSo;
    @FindBy(name = "os_build")
    public WebElement inputVersaoSo;
    @FindBy(name = "steps_to_reproduce")
    public WebElement inputComoReproduzir;
    @FindBy(name = "additional_info")
    public WebElement inputInfAdicional;
    @FindBy(name = "tag_string")
    public WebElement selectMarcador;
}

package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TarefaMap {

    @FindBy(css = ".user-info")
    public WebElement getUsuarioLogado;
    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[3]/a")
    public WebElement btnCriarTarefa;
    @FindBy(xpath = "//*[@id=\"reproducibility\"]")
    public WebElement btnFrequencia;
    @FindBy(xpath = "//*[@id=\"reproducibility\"]/option[2]")
    public WebElement selectOpcaoFrequencia;
    @FindBy(xpath = "//*[@id=\"severity\"]")
    public WebElement btnGravidade;
    @FindBy(xpath = "//*[@id=\"severity\"]/option[4]")
    public WebElement selectOpcaoGravidade;
    @FindBy(xpath = "//*[@id=\"priority\"]")
    public WebElement btnPrioridade;
    @FindBy(xpath = "//*[@id=\"priority\"]/option[2]")
    public WebElement selectOpcaoPrioridade;
    @FindBy(xpath = "//*[@id=\"profile_closed_link\"]/i")
    public WebElement selectPerfil;
    @FindBy(xpath = "//*[@id=\"platform\"]")
    public WebElement inputPlataforma;
    @FindBy(xpath = "//*[@id=\"os\"]")
    public WebElement inputSo;
    @FindBy(xpath = "//*[@id=\"os_build\"]")
    public WebElement inputVersaoSo;
    @FindBy(xpath = "//*[@id=\"summary\"]")
    public WebElement inputResumo;
    @FindBy(xpath = "//*[@id=\"description\"]")
    public WebElement inputDescricao;
    @FindBy(xpath = "//*[@id=\"steps_to_reproduce\"]")
    public WebElement inputComoReproduzir;
    @FindBy(xpath = "//*[@id=\"additional_info\"]")
    public WebElement inputInfAdicional;
    @FindBy(css = "*[title='teste']")
    public WebElement selectMarcador;
    @FindBy(xpath = "//*[@id=\"unassigned\"]/div[1]/div[2]/div/a")
    public WebElement verTarefa;
    @FindBy(css = "*[type=submit]")
    public WebElement novaTarefa;







}

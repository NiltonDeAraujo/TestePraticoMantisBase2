package steps;

import utils.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.TarefaPage;

public class TarefaSteps {
    TarefaPage tarefaPage = new TarefaPage();

    @Dado("acesso o menu criar tarefa")
    public void acessoOMenuCriarTarefa() {
        tarefaPage.clickCriarTarefa();
    }
    @Quando("seleciono o projeto")
    public void selecionoOProjeto() {
        tarefaPage.selectDropdownProjeto("Nilton Araujo's Project");
        tarefaPage.selectBtnProjeto();
    }
    @Quando("o campo resumo estiver preenchido")
    public void oCampoResumoEstiverPreenchido() {
        tarefaPage.setResumo("resumo");
    }
    @Quando("o campo descricao estiver preenchido")
    public void oCampoDescricaoEstiverPreenchido() {
        tarefaPage.setDescricao("descrição");
    }
    @Entao("a tarefa deve ser cadastrada")
    public void aTarefaDeveSerCadastrada() {
        tarefaPage.clickCadastrarNovaTarefa();
    }
    @Quando("o campo frequencia estiver preenchido")
    public void oCampoFrequenciaEstiverPreenchido() {
        tarefaPage.selectFrequencia("sempre");
    }
    @Quando("o campo gravidade estiver preenchido")
    public void oCampoGravidadeEstiverPreenchido() {
        tarefaPage.selectGravidade("grande");
    }
    @Quando("o campo prioridade estiver preenchido")
    public void oCampoPrioridadeEstiverPreenchido() {
        tarefaPage.selectPrioridade("urgente");
    }
    @Quando("o campo perfil estiver preenchido")
    public void oCampoPerfilEstiverPreenchido() {
        tarefaPage.setPlataforma("web");
        tarefaPage.setSo("windows");
        tarefaPage.setVersaoSo("64 bits");
    }
    @Quando("o campo passos_para_reproduzir estiver preenchido")
    public void oCampoPassosParaReproduzirEstiverPreenchido() {
        tarefaPage.setPassoReproduzir("passo a passo");
    }
    @Quando("o campo informacoes_adicionais estiver preenchido")
    public void oCampoInformacoesAdicionaisEstiverPreenchido() {
        tarefaPage.setInfAdicionais("informações adicionais");
    }
    @Quando("o campo marcadores estiver preenchido")
    public void oCampoMarcadoresEstiverPreenchido() {
        tarefaPage.selectMarcadores("marcadores");
    }

}

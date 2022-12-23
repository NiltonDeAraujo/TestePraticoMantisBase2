package steps;

import core.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;
import pages.TarefaPage;

import java.util.Map;

public class TarefaSteps {
    TarefaPage tarefaPage;


    @Quando("os campos estiverem preenchidos com")
    public void osCamposEstiveremPreenchidosCom(Map<String, String> map) {
        tarefaPage.verTarefa();
        tarefaPage.clickCriarTarefa();
        tarefaPage.selecFrequencia(map.get("frequencia"));
        tarefaPage.selecGravidade(map.get("gravidade"));
        tarefaPage.selecPrioridade("prioridade");
        tarefaPage.selectPerfil();
        tarefaPage.setPlataforma(map.get("plataforma"));
        tarefaPage.setSo(map.get("so"));
        tarefaPage.setVersaoSo(map.get("versaoSo"));
        tarefaPage.setResumo(map.get("resumo"));
        tarefaPage.setDescricao(map.get("descricao"));
        tarefaPage.setPassoReproduzir(map.get("passoReproduzir"));
        tarefaPage.setInfAdicionais(map.get("infAdicionais"));
        tarefaPage.selectMarcadores(map.get("marcadores"));
    }

    @Entao("a tarefa deve ser cadastrada")
    public void aTarefaDeveSerCadastrada() {
        tarefaPage.clickCriarTarefa();
    }



}

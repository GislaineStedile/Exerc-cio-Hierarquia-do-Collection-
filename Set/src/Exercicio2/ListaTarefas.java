package Exercicio2;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
  Set<Tarefa> setTarefas;

  public ListaTarefas(){
    this.setTarefas = new HashSet<>();
  }
  public void adicionarTarefa(String descricao){
    setTarefas.add(new Tarefa(descricao));
  }
  public void removerTarefa(String descricao){
    for (Tarefa tarefa : setTarefas) {
      if(tarefa.getDescricao().equals(descricao)){
        setTarefas.remove(tarefa);
        break;
      }
    }
  }
   public void exibirTarefas(){
    System.out.println(setTarefas);
   }
   public int contarTarefas(){
    return setTarefas.size();
   }
   public Set<Tarefa> obterTarefasConcluidas(){
    Set<Tarefa> tarefaConcluida = new HashSet<>();
    for(Tarefa t: setTarefas){
      if(t.getAtributo() == true){
        tarefaConcluida.add(t);
      }
    }
    return tarefaConcluida;
   }
   public Set<Tarefa> obterTarefasPendentes(){
    Set<Tarefa> tarefaNaoConcluida = new HashSet<>();
    for(Tarefa t: setTarefas){
      if(t.getAtributo() == false ){
        tarefaNaoConcluida.add(t);
      }
    }
    return tarefaNaoConcluida;
   }
   public void marcarTarefaConcluida(String descricao){
    for(Tarefa t: setTarefas){
      if(t.getDescricao().equals(descricao)){
        t.setAtributo(true);
        break;
      }
    }
  }
    public void marcarTarefaPendente(String descricao){
      for(Tarefa t: setTarefas){
        if(t.getDescricao().equals(descricao)){
          t.setAtributo(false);
          break;
        }
    }
   }
   public void limparListaTarefas(){
    setTarefas.clear();
   }
}

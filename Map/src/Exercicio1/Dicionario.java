package Exercicio1;

import java.util.Map;
import java.util.HashMap;

public class Dicionario {

  private Map<String, String> mapDicionario;

  public Dicionario(){
    this.mapDicionario = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao){
    mapDicionario.put(palavra, definicao);
  }

  public void removerPalavra(String palavra){
    if(!mapDicionario.isEmpty()){
      mapDicionario.remove(palavra);
    }
  }

  public void exibirPalavras(){
    System.out.println(mapDicionario);
  }

  public String pesquisarPorPalavra(String palavra){
    return mapDicionario.get(palavra);
  }
}

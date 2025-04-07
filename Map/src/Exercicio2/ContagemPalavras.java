package Exercicio2;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {

  private Map<String, Integer> mapContar;

  public ContagemPalavras(){
    this.mapContar = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer contagem){
    mapContar.put(palavra, contagem);
  }
  public void removerPalavra(String palavra){
    mapContar.remove(palavra);
  }
  public void exibirContagemPalavras(){
    for (Map.Entry<String,Integer> entry: mapContar.entrySet()) {
      System.out.println("Chave= "+entry.getKey()+" valor= "+entry.getValue());
    }
    System.out.println();
  }
 
  public String encontrarPalavraComMaioValor(){
    String palavraMaisFrequente = null;
    int maxContagem = 0;

    for(Map.Entry<String,Integer> c: mapContar.entrySet()){
      if(c.getValue() > maxContagem){
        palavraMaisFrequente = c.getKey();
        maxContagem = c.getValue();
      }
    }
    return palavraMaisFrequente;
  }
}

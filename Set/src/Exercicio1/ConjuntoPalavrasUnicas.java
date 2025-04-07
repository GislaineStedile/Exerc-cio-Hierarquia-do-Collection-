package Exercicio1;

import java.util.Set;
import java.util.HashSet;


public class ConjuntoPalavrasUnicas {
  private Set<String> setPalavras;

  public ConjuntoPalavrasUnicas(){
    this.setPalavras = new HashSet<>();
  }
  public void adicionarPalavra(String palavra){
    setPalavras.add(palavra);
  }
  public void removerPalavra(String palavra){
    setPalavras.remove(palavra);
  }
  public void verificarPalavra(String palavra){
    if(setPalavras.contains(palavra)){
      System.out.println("Palavra já está adicionada..");
    }else{
      System.out.println("Palavra não está adicionada..");
    }
  }
  public void exibirPalavrasUnicas(){
    System.out.println(setPalavras);
  } 
}

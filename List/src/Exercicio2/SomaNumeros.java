package Exercicio2;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
  private List<Numero> listNumeroInteiro;

  public SomaNumeros(){
    this.listNumeroInteiro = new ArrayList<>();
  }
  public void adicionarNumero(int numero){
    listNumeroInteiro.add(new Numero(numero));
  }
  public int calcularSoma(){
    int soma = 0;
    for(Numero n: listNumeroInteiro){
      soma += n.getNumero();
    }
    return soma;
  }
  public int encontrarMaiorNumero(){
    int maior = 0;
    for(Numero n: listNumeroInteiro){
      if(n.getNumero() > maior){
        maior = n.getNumero();
      }
    }
    return maior;
  }
  public int encontrarMenorNumero(){
    int menor = 0;
    for(Numero n: listNumeroInteiro){
      if(menor == 0){
        menor = n.getNumero();
      }else if(n.getNumero() < menor){
        menor = n.getNumero();
      }
    }
    return menor;
  }
  public void exibirNumeros(){
    System.out.println(listNumeroInteiro);
  }
}

package Exercicio3;

import java.util.Comparator;

public class Numero implements Comparable<Numero>{
  private int numero;

  public Numero(int numero){
    this.numero = numero;
  }
  public int getNumero(){
    return numero;
  }
  @Override
  public String toString(){
    return "[nume= "+numero+"]";
  }
  @Override
  public int compareTo(Numero n){
    return Integer.compare(numero,n.getNumero());
  }
}

class Descendente implements Comparator<Numero>{
  
  @Override
  public int compare(Numero n1, Numero n2){
    return Integer.compare(n1.getNumero(), n2.getNumero());
  }
  
}

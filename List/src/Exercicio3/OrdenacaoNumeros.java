package Exercicio3;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
  List<Numero> listNumero;

  public OrdenacaoNumeros(){
    this.listNumero = new ArrayList<>();
  }
  public void adicionarNumero(int numero){
    listNumero.add(new Numero(numero));
  }
  public List<Numero> ordenarAscendente(){
    List<Numero> listaAscendente = new ArrayList<>(listNumero);
    Collections.sort(listaAscendente);
    return listaAscendente;
  }
  public List<Numero> ordenarDescendente(){
    List<Numero> listaDescendente = new ArrayList<>(listNumero);
    Collections.sort(listaDescendente, new Descendente());
    return listaDescendente;
  }
  public void exibirNumero(){
    System.out.println(listNumero);
  }
}

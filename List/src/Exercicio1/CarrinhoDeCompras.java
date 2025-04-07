package Exercicio1;

import java.util.List;
import java.util.ArrayList;;

public class CarrinhoDeCompras {
  private List<Item> listCompraOnline;

  public CarrinhoDeCompras(){
    this.listCompraOnline = new ArrayList<>();
  }
  public void adicionarItem (String nome, double preco, int quantidade){
    listCompraOnline.add(new Item(nome,preco,quantidade));
  }
  public void removerItem(String nome){
    List<Item> removeCompraOnline = new ArrayList<>();
    for(Item i: listCompraOnline){
      if(i.getNome().equals(nome)){
        removeCompraOnline.add(i);
      }
    }
    listCompraOnline.removeAll(removeCompraOnline);
  }
  public double alcularValorTotal(){
    double valorTotal = 0;
    for(Item t: listCompraOnline){
      valorTotal += t.getPreco() * t.getQuantidade();
    }

    return valorTotal;
  }
  public void exibirItens(){
    System.out.println(listCompraOnline);
  }
}

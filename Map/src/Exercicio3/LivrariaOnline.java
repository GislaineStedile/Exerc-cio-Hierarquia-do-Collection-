package Exercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {

  private Map<String, Livro> mapLivro;

  public LivrariaOnline(){
    mapLivro = new HashMap<>();
  }

  public void adicionarLivro(String link, String titulo, String autor, double preco){
    Livro livro = new Livro(titulo, autor, preco);
    mapLivro.put(link, livro);
  }
  public void removerLivro(String titulo){
    mapLivro.entrySet().removeIf(entry -> entry.getValue().getTitulo().equals(titulo));
  }
  public void exibirLivrosOrdenadosPorPreco(){
    Map<String, Livro> treeMap = new TreeMap<>(mapLivro);
    System.out.println(treeMap);
  }
  public void pesquisarLivrosPorAutor(String autor){
    mapLivro.entrySet().stream().filter(entry -> entry.getValue().getAutor().equals(autor));
  }
}

package Exercicio2;

public class Tarefa {

    private String descricao;
    private boolean atributo;

    public Tarefa(String descricao){
      this.descricao = descricao;
      this.atributo = false;
    }

    public String getDescricao(){
      return descricao;
    }
    public boolean getAtributo(){
      return atributo;
    }
    public void setAtributo(boolean atributo){
      this.atributo = atributo;
    }
  @Override
  public String toString(){
    return "[descricao= "+descricao+", atributo= "+atributo+"]";
  }

}

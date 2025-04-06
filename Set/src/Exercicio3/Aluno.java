package Exercicio3;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private long matrícula;
	private double nota;
	
	
	public Aluno(String nome, long matrícula, double nota) {super();
		this.nome = nome;
		this.matrícula = matrícula;
		this.nota = nota;
	}


	public String getNome() {
		return nome;
	}


	public long getMatrícula() {
		return matrícula;
	}


	public double getNota() {
		return nota;
	}


	@Override
	public String toString() {
		return "nome=" + nome + ", matrícula=" + matrícula + ", nota=" + nota + "]";
	}


	@Override
	public int compareTo(Aluno a) {
		return nome.compareToIgnoreCase(a.getNome());
	}
	

}
class ComparatorPorAltura implements Comparator<Aluno>{

	@Override
	public int compare(Aluno a1, Aluno a2) {
		return Double.compare(a1.getNota(), a2.getNota());
	}
	
}

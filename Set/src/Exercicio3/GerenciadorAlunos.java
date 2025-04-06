package Exercicio3;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class GerenciadorAlunos {

	Set<Aluno> setAlunos;
	
	
	public GerenciadorAlunos() {
		this.setAlunos = new HashSet<>();
	}
	public void adicionarAluno(String nome, long matricula, double media) {
		
		setAlunos.add(new Aluno(nome, matricula, media));
		
	}
	public void removerAluno(long matricula) {
		Aluno removerAluno = null;
		for(Aluno a: setAlunos) {
			if(a.getMatrícula() ==  matricula) {
				removerAluno = a;
				break;
			}
		}
		setAlunos.remove(removerAluno);
	}
	
	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> exibirAluno = new TreeSet<>(setAlunos);
		return exibirAluno;
	}
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> exibirAluno = new TreeSet<>(new ComparatorPorAltura());
		exibirAluno.addAll(setAlunos);
		return exibirAluno;
	}
	public void exibirAlunos() {
		System.out.println(setAlunos);
	}
}

package br.ifs.ccomp.ed1.materialprova;

public class Execucao {
	
	public static void main(String[]args) {
		ListaArranjo<Aluno> alunos = new ListaArranjo<Aluno>();
		
		Aluno aluno1 = new Aluno(1,"Joao");
		alunos.adiciona(aluno1);
		Aluno aluno2 = new Aluno(2,"Maria");
		alunos.adiciona(aluno2);
		Aluno aluno3 = new Aluno(3,"Jose");
		alunos.adiciona(aluno3);
		System.out.println(alunos.toString());
		
		Aluno aluno4 = new Aluno(4, "Paulo");
		alunos.adiciona(0, aluno4);
		System.out.println(alunos.toString());
	
	}
}
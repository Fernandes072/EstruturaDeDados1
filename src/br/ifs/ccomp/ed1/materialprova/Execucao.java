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
		Aluno aluno4 = new Aluno(4,"Paulo");
		alunos.adiciona(aluno4);
		System.out.println(alunos.toString());
		
		ListaArranjo<Aluno> alunos2 = new ListaArranjo<Aluno>();
		Aluno aluno5 = new Aluno(1,"Joao");
		alunos2.adiciona(aluno5);
		Aluno aluno6 = new Aluno(2,"Maria");
		alunos2.adiciona(aluno6);
		Aluno aluno7 = new Aluno(3,"Jose");
		alunos2.adiciona(aluno7);
		Aluno aluno8 = new Aluno(4,"Paulo");
		alunos2.adiciona(aluno8);
		System.out.println(alunos2.toString());
		
		System.out.println(alunos.igual(alunos2));
	}
}
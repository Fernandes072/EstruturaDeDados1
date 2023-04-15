package br.ifs.ccomp.ed1.exer3.lista.teste;
import br.ifs.ccomp.ed1.exer3.lista.*;

public class TesteAdicionaNaPosicao {
	
	public static void main(String[]args) {
		
		Lista alunos = new Lista();
		System.out.println(alunos.toString());
		
		alunos.adiciona(new Aluno("Joao",1));
		alunos.adiciona(new Aluno("Maria",2));
		alunos.adiciona(1,new Aluno("Paulo",3));
		System.out.println(alunos.toString());
		
		System.out.println(alunos.pega(1).getNome().equals("Paulo"));
		System.out.println(alunos.pega(1).getMatricula() == 3);
		System.out.println(alunos.pega(2).getNome().equals("Maria"));
		System.out.println(alunos.pega(2).getMatricula() == 2);
	}
}
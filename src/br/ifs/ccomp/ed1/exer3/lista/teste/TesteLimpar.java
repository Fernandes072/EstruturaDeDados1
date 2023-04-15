package br.ifs.ccomp.ed1.exer3.lista.teste;

import br.ifs.ccomp.ed1.exer3.lista.*;

public class TesteLimpar {
	
	public static void main (String[]args) {
		
		Lista alunos = new Lista();
		
		System.out.println(alunos.toString());
		alunos.adiciona(new Aluno("Joao",1));
		alunos.adiciona(new Aluno("Jose",2));
		System.out.println(alunos.toString());
		
		alunos.Limpar();
		System.out.println(alunos.toString());
	}
}
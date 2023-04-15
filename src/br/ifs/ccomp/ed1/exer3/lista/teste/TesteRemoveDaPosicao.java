package br.ifs.ccomp.ed1.exer3.lista.teste;
import br.ifs.ccomp.ed1.exer3.lista.*;

public class TesteRemoveDaPosicao {
	
	public static void main(String[]args) {
		
		Lista alunos = new Lista();
		System.out.println(alunos.toString());
		
		alunos.adiciona(new Aluno("Joao",1));
		alunos.adiciona(new Aluno("Jose",2));
		alunos.adiciona(new Aluno("Maria",3));
		System.out.println(alunos.toString());
		
		alunos.remove(1);
		System.out.println(alunos.toString());
		
		System.out.println(alunos.pega(0).getNome().equals("Joao"));
		System.out.println(alunos.pega(0).getMatricula() == 1);
		System.out.println(alunos.pega(1).getNome().equals("Maria"));
		System.out.println(alunos.pega(1).getMatricula() == 3);
	}
}
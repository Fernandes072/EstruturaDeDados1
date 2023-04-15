package br.ifs.ccomp.ed1.exer4.listaGenerica.teste;
import br.ifs.ccomp.ed1.exer4.listaGenerica.*;

public class TesteAdicionaNaPosicao {
	
	public static void main(String[]args) {
		
		ListaArranjo<Aluno> lista1 = new ListaArranjo<Aluno>();
		System.out.println(lista1.toString());
		
		lista1.adiciona(new Aluno("Joao",1));
		lista1.adiciona(new Aluno("Maria",2));
		lista1.adiciona(1,new Aluno("Paulo",3));
		System.out.println(lista1.toString());
		
		System.out.println(lista1.pega(1).getNome().equals("Paulo"));
		System.out.println(lista1.pega(1).getMatricula() == 3);
		System.out.println(lista1.pega(2).getNome().equals("Maria"));
		System.out.println(lista1.pega(2).getMatricula() == 2);
	}
}
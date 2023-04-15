package br.ifs.ccomp.ed1.exer4.listaGenerica.teste;
import br.ifs.ccomp.ed1.exer4.listaGenerica.*;

public class TestePegaNaPosicao {
	
	public static void main(String[]args) {
		
		ListaArranjo<Aluno> lista1 = new ListaArranjo<Aluno>();
		System.out.println(lista1.toString());
		
		lista1.adiciona(new Aluno("Joao",1));
		lista1.adiciona(new Aluno("Jose",2));
		System.out.println(lista1.toString());
		
		System.out.println();
		System.out.println(lista1.pega(0) != null);
		System.out.println(lista1.pega(1) != null);
		
		System.out.println(lista1.pega(0).getNome().equals("Joao"));
		System.out.println(lista1.pega(1).getNome().equals("Jose"));
		
		System.out.println(lista1.pega(0).getMatricula() == 1);
		System.out.println(lista1.pega(1).getMatricula()== 2);
		
		System.out.println(lista1.pega(100));
	}
}
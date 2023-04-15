package br.ifs.ccomp.ed1.exer4.listaGenerica.teste;
import br.ifs.ccomp.ed1.exer4.listaGenerica.*;
public class TesteTamanho {
	
	public static void main(String[]args) {
		
		ListaArranjo<Aluno> lista1 = new ListaArranjo<Aluno>();
		System.out.println(lista1.toString());
		
		lista1.adiciona(new Aluno("Joao",1));
		lista1.adiciona(new Aluno("Jose",2));
		System.out.println(lista1.toString());
		System.out.println(lista1.tamanho()== 2);
		lista1.adiciona(new Aluno("Maria",3));
		System.out.println(lista1.toString());
		System.out.println(lista1.tamanho() == 3);
	}
}
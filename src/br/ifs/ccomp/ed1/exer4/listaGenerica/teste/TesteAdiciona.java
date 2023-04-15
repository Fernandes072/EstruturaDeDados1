package br.ifs.ccomp.ed1.exer4.listaGenerica.teste;
import br.ifs.ccomp.ed1.exer4.listaGenerica.*;

public class TesteAdiciona {
	
	public static void main(String[]args) {
		
		ListaArranjo<Aluno> lista1 = new ListaArranjo<Aluno>();
		lista1.adiciona(new Aluno("Joao",1));
		lista1.adiciona(new Aluno("Jose",2));
		System.out.println(lista1.toString());
		
		ListaArranjo<String> lista2 = new ListaArranjo<String>();
		lista2.adiciona("Maria");
		System.out.println(lista2.toString());
	}
}
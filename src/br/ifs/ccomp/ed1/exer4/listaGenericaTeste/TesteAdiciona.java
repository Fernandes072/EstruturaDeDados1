package br.ifs.ccomp.ed1.exer4.listaGenericaTeste;

public class TesteAdiciona {
	
	public static void main(String[]args) {
		
		ListaArranjo<Object> lista1 = new ListaArranjo<Object>();
		lista1.adiciona(new Aluno("Joao",1));
		lista1.adiciona(new Professor("Jose",40));
		System.out.println(lista1.toString());
		System.out.println(lista1.pega(1));
	}
}
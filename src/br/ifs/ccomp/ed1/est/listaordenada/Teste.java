package est.listaordenada;

public class Teste {
	
	public static void main(String[]args) {
		
		ListaOrdenada lista = new ListaOrdenada();
		System.out.println(lista);
		lista.adiciona(new Aluno("Joao", 10));
		lista.adiciona(new Aluno("Maria", 8.5f));
		lista.adiciona(new Aluno("Pedro", 6.5f));
		lista.adiciona(new Aluno("Carlos", 3.5f));
		lista.adiciona(new Aluno("Jessica", 7f));
		lista.adiciona(new Aluno("Maycon", 9));
		lista.adiciona(new Aluno("Joabbe", 4.5f));
		lista.adiciona(new Aluno("Cauã", 5f));
		lista.adiciona(new Aluno("Japa", 1f));
		lista.adiciona(new Aluno("Raimundo", 2f));
		System.out.println(lista);
		
		Lista lista2 = lista.segmento(0, 4);
		System.out.println(lista2);
	}
}
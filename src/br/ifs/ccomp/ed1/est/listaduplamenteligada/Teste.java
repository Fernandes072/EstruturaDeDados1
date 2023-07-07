package est.listaduplamenteligada;

public class Teste {
	
	public static void main(String[]args) {
		
		/*lista.adiciona(new Aluno("Joao", 10));
		lista.adiciona(new Aluno("Maria", 8.5f));
		lista.adiciona(new Aluno("Pedro", 6.5f));
		lista.adiciona(new Aluno("Carlos", 3.5f));
		lista.adiciona(new Aluno("Jessica", 7f));
		lista.adiciona(new Aluno("Maycon", 9));
		lista.adiciona(new Aluno("Joabbe", 4.5f));
		lista.adiciona(new Aluno("Cauã", 5f));
		lista.adiciona(new Aluno("Japa", 1f));
		lista.adiciona(new Aluno("Raimundo", 2f));*/
		
		Lista lista = new ListaDuplamenteLigada();
		System.out.println(lista);
		lista.adiciona(new Aluno("Joao", 10));
		lista.adiciona(new Aluno("Maria", 8.5f));
		lista.adiciona(new Aluno("Pedro", 6.5f));
		lista.adiciona(new Aluno("Carlos", 3.5f));
		lista.adiciona(new Aluno("Jessica", 7f));
		lista.adiciona(new Aluno("Maycon", 9));
		lista.adiciona(new Aluno("Joabbe", 4.5f));
		System.out.println(lista);
		
		lista.segmento(1, 4);
		Lista lista2 = lista.segmento(1, 4);
		System.out.println(lista2);
	}
}
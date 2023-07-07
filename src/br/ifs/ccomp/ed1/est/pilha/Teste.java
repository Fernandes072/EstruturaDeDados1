package est.pilha;

public class Teste {

	public static void main(String[] args) {
		
		Pilha pilha = new PilhaLigada();
		System.out.println(pilha.vazia() == true);
		pilha.adiciona("1");
		pilha.adiciona("2");
		pilha.adiciona("3");
		pilha.adiciona("4");
		pilha.adiciona("5");
		System.out.println(pilha);
		System.out.println(pilha.remove().equals("5"));
		System.out.println(pilha);
		System.out.println(pilha.topo().equals("4"));
		System.out.println(pilha.tamanho() == 4);
		System.out.println(pilha.vazia() == false);
		pilha.limpa();
		System.out.println(pilha.vazia() == true);
		System.out.println(pilha.tamanho() == 0);
		System.out.println(pilha);
	}

}

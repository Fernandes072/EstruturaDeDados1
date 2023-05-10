package br.ifs.ccomp.ed1.exer5;

public class TesteRemove {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println(lista);

		lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Jose", "jose@gmail.com"));
		lista.adiciona(new Aluno("Paulo", "paulo@gmail.com"));
		lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(lista);

		Aluno chave1 = new Aluno("Carlos", null);
		int posicao = lista.busca(chave1);
		System.out.println(posicao);
		
		Aluno chave2 = new Aluno("Paulo", null);
		posicao = lista.busca(chave2);
		System.out.println(posicao);

		Aluno chave3 = new Aluno("Joao", null);
		posicao = lista.busca(chave3);
		System.out.println(posicao);
		
		posicao = lista.buscaUltima(chave3);
		System.out.println(posicao);
		
		lista.buscaRemove(chave3);
		System.out.println(lista);
	}
}
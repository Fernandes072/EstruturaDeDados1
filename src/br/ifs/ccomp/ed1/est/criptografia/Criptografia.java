package est.criptografia;

public class Criptografia {

	public static void main(String[] args) {
		
		String mensagem = new String("Uma mensagem confidencial");
		System.out.println(mensagem);
		String[] palavras = mensagem.split(" ");
		Fila fila = new FilaArranjo();
		for (int i = 0; i < palavras.length; i++) {
			fila.adiciona(palavras[i]);
		}
		System.out.println(fila);
		int nPalavras = fila.tamanho();
		for (int i = 0; i < nPalavras; i++) {
			String palavra = new String( (String) fila.remove());
			String novaPalavra = new String();
			Pilha pilha = new PilhaArranjo();
			for (int j = 0; j < palavra.length(); j++) {
				pilha.adiciona(palavra.charAt(j));
				
			}
			int nLetras = pilha.tamanho();
			for (int j = 0; j < nLetras; j++) {
				novaPalavra = novaPalavra + pilha.remove();
			}
			fila.adiciona(novaPalavra);
		}
		System.out.println(fila);
		mensagem = "";
		for (int i = 0; i < nPalavras; i++) {
			mensagem = mensagem + fila.remove() + " ";
		}
		System.out.println(mensagem);
	}
}

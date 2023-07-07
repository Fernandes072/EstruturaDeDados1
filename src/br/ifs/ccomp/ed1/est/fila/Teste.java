package est.fila;

public class Teste {

	public static void main(String[] args) {
		
		Fila fila = new FilaLigada();
		System.out.println(fila.vazia() == true);
		fila.adiciona("1");
		fila.adiciona("2");
		fila.adiciona("3");
		fila.adiciona("4");
		fila.adiciona("5");
		System.out.println(fila);
		System.out.println(fila.remove().equals("1"));
		System.out.println(fila);
		System.out.println(fila.consulta().equals("2"));
		System.out.println(fila.tamanho() == 4);
		System.out.println(fila.vazia() == false);
		fila.limpa();
		System.out.println(fila.vazia() == true);
		System.out.println(fila.tamanho() == 0);
		System.out.println(fila);
		fila.adiciona("1");
		fila.adiciona("2");
		fila.adiciona("3");
		fila.adiciona("4");
		fila.adiciona("5");
		System.out.println(fila);
		Fila fila2 = fila.removeLote(3);
		System.out.println(fila2);
		System.out.println(fila);
		System.out.println(fila.tamanho() == 2);
		System.out.println(fila.vazia() == false);
	}

}

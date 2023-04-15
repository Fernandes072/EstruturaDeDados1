package br.ifs.ccomp.ed1.exer3.lista.teste;
import br.ifs.ccomp.ed1.exer3.lista.*;

public class TesteAdiciona {
	
	public static void main(String[]args) {
		
		Lista alunos = new Lista();
		/*System.out.println(alunos.toString());
		alunos.adiciona(new Aluno("Joao",1));
		alunos.adiciona(new Aluno("Jose",2));
		System.out.println(alunos.toString());*/
		
		long ini1 = System.currentTimeMillis();
		for (int i = 0; i <= 100000; i++) {
			alunos.adiciona(new Aluno("Aluno"+(i+1),(i+1)));
		}
		long fin1 = System.currentTimeMillis();
		System.out.println("Adiciona: " + (fin1-ini1));
		
		Lista alunos2 = new Lista();
		long ini2 = System.currentTimeMillis();
		for (int i = 0; i <= 100000; i++) {
			alunos2.adicionaLinear(new Aluno("Aluno"+(i+1),(i+1)));
		}
		long fin2 = System.currentTimeMillis();
		System.out.println("Adiciona linear: " + (fin2-ini2));
	}
}
package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		// Declara��o das vari�veis
		
		int escolhaDoComputador;
		int escolhaDoUsuario;
		
		
		Random aleatorio = new Random();

		System.out.println("--------------------------");
		System.out.println("JOKENPO");
		System.out.println("--------------------------");
		System.out.println("Escolha uma op��o entre 1 e 3");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("---------------------------");
		
		Scanner leitor = new Scanner(System.in);
		
		escolhaDoUsuario = leitor.nextInt();
		
		escolhaDoComputador = aleatorio.nextInt(1+2)+1;
		
				
		System.out.println("Voc� escolheu: " + escolhaDoUsuario);
		System.out.println("O computador escolheu: " + escolhaDoComputador);
		leitor.close();
		
		if (escolhaDoUsuario == escolhaDoComputador) {
			System.out.println("EMPATOU!");	
		}
		if (escolhaDoUsuario == 1 && escolhaDoComputador ==2) {
			System.out.println("O computador ganhou porque o papel enrola a pedra!");
		}
		if (escolhaDoUsuario == 1 && escolhaDoComputador ==3) {
			System.out.println("Voc� ganhou porque a pedra quebra a tesoura!");	
		}
		if (escolhaDoUsuario == 2 && escolhaDoComputador ==1) {
			System.out.println("Voc� ganhou porque o papel enrola a pedra!");	
		}
		if (escolhaDoUsuario == 2 && escolhaDoComputador ==3) {
			System.out.println("O computador  ganhou porque a tesoura corta o papel!");	
		}
		if (escolhaDoUsuario == 3 && escolhaDoComputador ==1) {
			System.out.println("O computador  ganhou porque a pedra quebra a tesoura!");	
		}
		if (escolhaDoUsuario == 3 && escolhaDoComputador ==2) {
			System.out.println("Voc�  ganhou porque a tesoura corta o papel!");	
		}

	}

}

package Desafio;
//Coloque em maiúscula a primeira letra de cada frase na string

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		String frase;
		String[] palavra;
		Scanner leitura;		
		leitura = new Scanner(System.in);	
		StringBuffer novaFrase = new StringBuffer();
		
		System.out.println("Digite uma frase para colocar em maiúscula a primeira letra de cada palavra na string:");
		frase = leitura.nextLine();		
		palavra = frase.split(" ");
		
		for(int i = 0 ; i < palavra.length ; i++) {
			novaFrase.append(palavra[i].substring(0,1).toUpperCase() + palavra[i].substring(1).toLowerCase());
				if(!(i+1 == palavra.length))
					novaFrase.append(" ");
		}
		System.out.println(novaFrase);
	}
}

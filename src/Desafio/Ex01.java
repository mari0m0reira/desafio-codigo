package Desafio;

//Reverta a ordem das palavras nas frases, mantendo a ordem das palavras:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		String frase;
		String[] palavra;
		StringBuffer novaFrase = new StringBuffer();
		Scanner leitura;		
		leitura = new Scanner(System.in);	
		
		System.out.println("Digite uma frase para reverter a ordem das palavras nas frases, mantendo a ordem das palavras:");
		frase = leitura.nextLine();		
		palavra = frase.split(" ");
	
		for(int i = 0; i < palavra.length ; i++)
			novaFrase.append(palavra[palavra.length - 1 - i] + " ");
		System.out.print(novaFrase);		
	}
}
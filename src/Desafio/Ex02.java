package Desafio;
//Remova todos os caracteres duplicados da String abaixo:

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		char[] letras;
		String frase;
		StringBuffer novaFrase = new StringBuffer();
		Scanner leitura;
		Boolean achou = true;
				
		leitura = new Scanner(System.in);	
		
		System.out.println("Digite uma frase para remover todos os caracteres duplicados da String:");
		frase = leitura.nextLine();		
		letras = new char[frase.length()];
		letras = frase.toCharArray();		
		novaFrase.append(letras[0]);	
		
		for(int i = 1; i < letras.length ; i++) {			
			if(letras[i] == ' ') {
				novaFrase.append(letras[i]);
			}else {
				for(int j = 0 ; j < i ; j++) {
					if(letras[i] == letras[j]) 
						achou = false;
				}				
				if(achou)
					novaFrase.append(letras[i]);	
				achou = true;
			}
		}
		System.out.println(novaFrase);
	}
}

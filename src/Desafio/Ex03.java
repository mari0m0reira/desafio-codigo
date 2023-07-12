package Desafio;
//Encontre a substring palindroma mais longa da string.

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int Auxiliar = 0, maiorPalindromo = 0, inicioPalindromo = 0, finalPalindromo = 0, inicio = 0, fim = 0;
		char[] letras;
		String frase;
		StringBuffer palindromo= new StringBuffer();	
		Scanner leitura;
		boolean achou = false;
				
		leitura = new Scanner(System.in);	
		
		System.out.println("Digite uma palavra para encontrar a substring palindroma mais longa da string:");
		frase = leitura.next();		
		frase = frase.toLowerCase();
		letras = new char[frase.length()];
		letras = frase.toCharArray();
		
		for(int i = 0 ; i < letras.length ; i++) {
			Auxiliar = i;
			for(int j = letras.length -1 ; j > Auxiliar ; j --) {
				if(letras[Auxiliar] == letras[j]) {
					if(achou == false) {
						inicio = Auxiliar;
						fim = j;						
						achou = true;
					}
					Auxiliar++;
				}else {
					inicio = 0;
					achou = false;
					fim = 0;
					Auxiliar = i;
				}					
			}
			
			if(achou) {
				if((fim - inicio + 1) > maiorPalindromo) {
					inicioPalindromo = inicio;
					finalPalindromo = fim;
					maiorPalindromo = fim - inicio + 1;
				}
			}
			achou = false;					
				
		}		
		if(finalPalindromo == 0) {
			System.out.println("Não existe nenhum palindromo");
		}else {
			
			for(int i = inicioPalindromo ; i <= finalPalindromo ; i++) {
			palindromo.append(letras[i]);			
		}
	}			
		System.out.println(palindromo);		
	}
}

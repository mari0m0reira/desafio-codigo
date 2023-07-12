package Desafio;
//Verifique se a string é um anagrama de um palindromo:

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex5 {

	public static void main(String[] args) {
		
		char[] letras;
		String palavra;	
		Scanner leitura;
				
		leitura = new Scanner(System.in);	
		
		System.out.println("Digite uma palavra para verificar se a string é um anagrama de um palindromo:");
		palavra = leitura.next();		
		palavra = palavra.toLowerCase();
		letras = new char[palavra.length()];
		letras = palavra.toCharArray();
		System.out.println(verificar(letras));
	}

	public static boolean verificar(char letras[]) {
		Map<Character, Integer> quantidadeLetras = new TreeMap<>();;
		int contador, impar = 0;
		for(char c : letras) {
			contador = 0;
			for(int i = 0 ; i < letras.length ; i++) {
				if(c == letras[i])
					contador ++;
			}
			quantidadeLetras.put(c, contador);
		}
		
		if(quantidadeLetras.size() > Math.round((double)letras.length /2)) 
			return false;	
							
		for(char c : quantidadeLetras.keySet()) 
			if(quantidadeLetras.get(c)%2 == 1)
				impar++;
				
		if(letras.length%2==0) {
			if(impar!=0) 
				return false;
			
		}else if(impar != 1) 
			return false;
					
		return true;
	}	
}

	
package bucles;

import java.util.Arrays;
import java.util.Scanner;

public class bucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//calculo de factorial
		Scanner inputObj = new Scanner (System.in);
		System.out.println("ingrese el numero para calcular su factorial: ");
		int base = inputObj.nextInt();
		int factorial = 1;
		int paso = 1;
		do {
			factorial = factorial * paso;
			paso++;
		} while (paso <= base);
		System.out.println("El factorial de " + base + "es" + factorial);
		} 
	     


	/*	
	// ejercicio parabolica
	
			double limInf = -4;
			double limSup = 4;
			double intervalo = 0.5; 
			double posActual = limInf;// defino la posicion actual para mantener inalterables los limites Representa a X
			double resultado = 0;
			
			while (posActual >= limInf && posActual <= limSup) {
				resultado = Math.pow(posActual, 2) + (3 * posActual) + 5; 
				System.out.println("Para x = " + posActual + "el valor es" + resultado);
				posActual += intervalo;		
				}
		*/
		/*
			//For con Variable String
			
			String texto = "Esto es un texto de prueba";
			for (int pos = 0; pos < texto.length(); pos++) {
				char letra = texto.charAt(pos);
				System.out.println("La letra en la pos = " + pos + " es " + letra);
			}
		*/
		/*
		// Si quiero un numero en vez de una letra
		
		String texto = "Esto es un texto de prueba";
		for (int pos = 0; pos < texto.length(); pos++) {
			char letra = texto.charAt(pos);
			System.out.println("La letra  " + letra + " en ASCII vale " + (int)letra);
			}
		*/
		/*
		//vamos a recorrer el String y pasar todas las letras a mayusculas
		
		String texto = "Esto es un texto de prueba";
		String textoM = "";
		for (int pos = 0; pos < texto.length(); pos++) {
			char letra = texto.charAt(pos);
			if (letra >= 97) {
				letra -= 32;
			}
			System.out.println(letra + " - " + (int)letra);
			textoM += letra;
		}     
	       System.out.println(texto);
	       System.out.println(textoM);
	    */
		
		
	
	    
		/*
		Scanner inputObj = new Scanner(System.in);
		System.out.println("ingrese la cantidad de personas a cargar:");
		int cantIng = inputObj.nextInt();
		
		String[] arrPersonas = new String (cantIng) {
			for(int pos=0; pos < cantIng; pos++)
				
				
		}
		*/
		

		int a = 3; 
		System.out.println(a==3 && a>3);
	}
	
	
	



package ejercicio_1;

import java.util.Scanner;

/*Escribir una función que reciba un número n y devuelva true si n es primo o false
en caso contrario.*/

public class numerosPrimos_ej1 {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
 		
		System.out.println("Ingrese un numero:");
		int number = scanner.nextInt();
		int auxiliar=0;
		int sum = 0;
		
		for(int i=1;i<=number;i++) {
			
			auxiliar = number%i;
	
			if(auxiliar == 0) {
				sum = sum + 1;
			}		
		}
		
		if(sum <= 2) {
			System.out.println("Es un numero primo");
		}
		else {
			System.out.println("No es un numero primo");
 
		}
		
	}
}
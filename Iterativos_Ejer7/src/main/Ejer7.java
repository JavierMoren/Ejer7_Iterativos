package main;

public class Ejer7 {

	public static void main(String[] args) {
		//Diseñar un programa que muestre el producto de los 10 primeros números impares.
		final int MAX = 9;

		int contador = 1;
		int resultado;
		int impar1 = 1;
		int impar2 = 3;
		
		while(contador <= 10) {
			 resultado = impar1 * impar2;
			 contador++;
			 impar1 = impar1 +2;
			 impar2 = impar2 +2;
			 System.out.println(impar1+" * "+impar2+" = "+resultado);
		}

	}

}

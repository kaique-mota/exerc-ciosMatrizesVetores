package Exerc�cios;

import java.util.Scanner;

public class Exercicio03 {

	
	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			double[][] matriz = new double[3][3];
			double valores = 0.0;
			
			for(int l = 0; l< 3; l++) {
				for(int c = 0; c<3; c++) {
					System.out.printf("Digite os n�meros: [%d][%d]",  l, c);
					matriz[l][c] = entrada.nextDouble();
					
					if(matriz[l][c] > 10) {
						valores++;
					}
				}
			}
			System.out.println("\nVoc� digitou " + valores + " n�meros acima de 10");
		}
	}
}

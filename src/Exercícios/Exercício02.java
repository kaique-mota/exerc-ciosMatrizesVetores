package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio02 {
	/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
.*/
	
	     public static void main(String[] args) {
         
	     Scanner entrada = new Scanner(System.in);
         
         int vetor[] = new int[6];
         int numeros, contadorPar = 0, contadorImpar = 0, somaPares = 0;
         
         for(int i = 0; i<6; i++) {
        	 System.out.println("Digite 6 n�meros:");
        	 numeros = entrada.nextInt();
        	 
        	 if(numeros % 2 == 0) {
        		 contadorPar++;
        		 somaPares = somaPares + numeros;
        	 }
        	 if(numeros % 2 != 0) {
        		 contadorImpar++;
        	 }
         }
             System.out.println("A soma dos pares � : " + somaPares);
             System.out.println("A quantidade de n�meros pares � : " + contadorPar);
             System.out.println("A quantidade de n�meros �mpares � : " + contadorImpar);
	}
}

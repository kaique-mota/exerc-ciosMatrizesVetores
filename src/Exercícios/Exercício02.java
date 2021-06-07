package Exercícios;

import java.util.Scanner;

public class Exercício02 {
	/*2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
.*/
	
	     public static void main(String[] args) {
         
	     Scanner entrada = new Scanner(System.in);
         
         int vetor[] = new int[6];
         int numeros, contadorPar = 0, contadorImpar = 0, somaPares = 0;
         
         for(int i = 0; i<6; i++) {
        	 System.out.println("Digite 6 números:");
        	 numeros = entrada.nextInt();
        	 
        	 if(numeros % 2 == 0) {
        		 contadorPar++;
        		 somaPares = somaPares + numeros;
        	 }
        	 if(numeros % 2 != 0) {
        		 contadorImpar++;
        	 }
         }
             System.out.println("A soma dos pares é : " + somaPares);
             System.out.println("A quantidade de números pares é : " + contadorPar);
             System.out.println("A quantidade de números ímpares é : " + contadorImpar);
	}
}

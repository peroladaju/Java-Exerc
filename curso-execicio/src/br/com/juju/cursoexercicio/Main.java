package br.com.juju.cursoexercicio;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner leitor = new Scanner(System.in);
	
	/* int x, y, result;
	
	x = leitor.nextInt();
	y = leitor.nextInt();
	
	result = x + y;
	System.out.println("A soma dos valores = " + result);
	*/
	
	/*double pi = Math.PI;
	double raio, result;
	 raio = leitor.nextDouble();
	 
	 result = pi * Math.pow(raio, 2);
	 System.out.printf("O valor de raio � igual � %.4f",result);
	 */
	 /* int A, B, C, D, result;
	 
		A = leitor.nextInt();
		B = leitor.nextInt();
		C = leitor.nextInt();
		D = leitor.nextInt();
		
		result = (A * B - C * D);
		
		System.out.println("Diferen�a: " + result);
	 */
	/*int id, hora;
	double  valorH , result;
	
	id = leitor.nextInt();
	hora =leitor.nextInt();
	valorH = leitor.nextDouble();
	
	result =  valorH * hora;
	
	System.out.println("NUMBER = " + id);
	System.out.printf("SALARY = u$ %.2f", result);
	*/
	
	leitor.close();
	}

}

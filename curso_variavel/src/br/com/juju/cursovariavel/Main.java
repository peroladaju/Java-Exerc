package br.com.juju.cursovariavel;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);

	//String x;
	//x = sc.next();
	//System.out.println("Voc� digitou: " + x);
	//int y;
	// y = sc.nextInt();
	// System.out.println("Voc� digitou: " + y);
	
	//double c;
	//c = sc.nextDouble();
	//System.out.printf("Voc� digitou: %.2f%n", c);
	
	//char e;
	//e = sc.next().charAt(0);
	//System.out.println("Voc� digitou: " + e);
	
	/*String x;
	int y;
	double c;
	char e;
	x = sc.next();
	y = sc.nextInt();
	c = sc.nextDouble();
	e = sc.next().charAt(0);
	System.out.println("Dados digitados:");
	System.out.println(x);
	System.out.println(y);
	System.out.println(c);
	System.out.println(e);*/
	
		int x;
	String s1, s2, s3;
	x = sc.nextInt();
	//esse nextLine � utilizado para corrigir a quebra do nextInt
	 sc.nextLine();
	s1 = sc.nextLine();
	s2 = sc.nextLine();
	s3 = sc.nextLine();
	
	System.out.println("DADOS DIGITADOS");
	System.out.println(x);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	
	sc.close();
	}

}

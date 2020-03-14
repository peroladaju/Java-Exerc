import java.util.Locale;

class Main {

	public static void main(String[] args) {
		/*		
		int y = 32;
		double x = 10.35784;
		System.out.println("Você começou sua jornada");
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		System.out.printf("%.4f%n",x + "%.4f%n",x );*/
		
		String nome = "Maria";
		int idade = 28;
		float salario = (float) 2500.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f", nome, idade,salario);
	}

}

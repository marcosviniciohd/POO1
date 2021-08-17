import java.util.Locale;
import java.util.Scanner;

public class Program01 {

	static int numero1;
	static int numero2;
	
	public static void verificaNumero() {
		if (numero1 > numero2) {
			System.out.println(numero1 + " maior que " + numero2);
		} else if (numero1 < numero2) {
			System.out.println(numero1 + " menor que " + numero2);
		} else if (numero1 == numero2) {
			System.out.println(numero1 + " igual a " + numero2);
		}
	}
	
	public static void mediaAritmetica() {
		double media = (numero1 + numero2) / 2;
		System.out.println("A média aritmética de " + numero1 + " + " + numero2 + " é igual a " + media);
	}
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número 1");
		numero1 = sc.nextInt();
		System.out.println("Digite o número 2");
		numero2 = sc.nextInt();

		verificaNumero();
		mediaAritmetica();
		
		sc.close();
	}

}

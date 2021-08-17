import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	static int numero;

	public static void verificaNumeroPositivoNegativo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número desejado ");
		numero = sc.nextInt();
		int contaNumeroPositivos = 0;
		int contaNumerosNegativos = 0;
		while (numero != 0) {
			if (numero > 0) {
				contaNumeroPositivos += 1;

			} else {
				contaNumerosNegativos += 1;

			}

			numero = sc.nextInt();
		}

		System.out.println("Somas positivas = " + contaNumeroPositivos);
		System.out.println("Somas positivas = " + contaNumerosNegativos);

		sc.close();
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		verificaNumeroPositivoNegativo();

	}

}

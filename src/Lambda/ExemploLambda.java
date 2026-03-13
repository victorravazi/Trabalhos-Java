import java.util.Arrays;
import java.util.*;

public class ExemploLambda {
	public static void main(String[] args) {
		List<Integer> ListaDeNumeros = Arrays.asList(15, 3, 5, 2);
		List<Integer> NumerosPares = new ArrayList<>();

		final int i = 10;
		// for (Integer elemento : ListaDeNumeros) {
		// System.out.println(elemento);
		// }
		ListaDeNumeros.forEach((numero) -> {
			System.out.println("Valor de I " + i);
			if (numero % 2 == 0) {
				NumerosPares.add(numero);
			}
		});
		System.out.println("Numeros Pares " + NumerosPares);
	}
}

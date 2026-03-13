import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExercicioLambda {
	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();

		numeros.add(5);
		numeros.add(1);
		numeros.add(9);
		numeros.add(4);

		numeros.removeIf(numero -> numero % 2 == 0);

		System.out.println("Numeros ímpares: " + numeros);
	}
}

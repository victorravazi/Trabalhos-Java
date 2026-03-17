import java.util.Set;
import java.util.HashSet;

public class SetExercise {
	public static void main(String[] args) {
		Set<Integer> conjuntoInteiros = new HashSet<>();

		conjuntoInteiros.add(1);
		conjuntoInteiros.add(3);
		conjuntoInteiros.add(6);
		conjuntoInteiros.add(10);

		boolean possui = conjuntoInteiros.contains(1);
		System.out.println("Este conjunto contem o numero 1: " + possui);

		System.out.println("Todos os numeros do conjunto: " + conjuntoInteiros);

		conjuntoInteiros.remove(6);

		System.out.println("Numeros do conjunto apos remoção " + conjuntoInteiros);
	}
}

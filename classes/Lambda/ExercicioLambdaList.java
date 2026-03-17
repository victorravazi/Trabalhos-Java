import java.util.ArrayList;
import java.util.List;

public class ExercicioLambdaList {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();

		lista.add("Banana");
		lista.add("Maçaaaaa");
		lista.add("Uva");
		lista.addFirst("Melao");
		lista.add(0, "krl");

		lista.removeIf(caracter -> caracter.length() > 5);
		System.out.println("Lista ao remover palavras maiores que 5 letras " + lista);

		lista.forEach(System.out::println);
	}
}

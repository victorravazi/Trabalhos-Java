import java.util.*;

public class ExemploList {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();

		lista.add("Java");
		lista.add("Python");
		lista.add("C++");

		// verificando se a lista tem um elemento
		System.out.println("Tem java: " + lista.contains("Java"));

		// adicionando todos os elementos de outras list
		List<String> outraLista = Arrays.asList("Javascript", "Ruby");
		lista.addAll(outraLista);

		// Imprimir
		System.out.println("Lista completa: " + lista);

		// removendo um elemento
		lista.remove("Python");
		System.out.println(lista);

		// Obtendo um elemento pelo indice
		String elemento = lista.get(2);
		System.out.println(elemento);

		// Limpando a lista

		lista.clear();
		System.out.println(lista);
	}
}

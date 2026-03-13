import java.util.Set;
import java.util.HashSet;

public class ExemploSet {
	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<>();

		// Adicionando elemento
		conjunto.add("Java");
		conjunto.add("Python");

		// Verificando se o conjunto tem algum elemento especifico
		System.out.println("Contem java? " + conjunto.contains("Java")); // retorna true ou false

		// adicionando mais elementos
		conjunto.add("Javascript");
		conjunto.add("Ruby");

		System.out.println("Conjunto completo " + conjunto);

		// removendo um elemento
		conjunto.remove("Python");

		// Apos a remoção no conjunto
		System.out.println("Conjunto apos remoçao " + conjunto);

		boolean foiAdicionado = conjunto.add("Java");
		System.out.println("java foi adicionado novamente: " + foiAdicionado); // deve receber false

		// limpando o conjunto
		conjunto.clear();
		System.out.println("Conjunto apos limpar: " + conjunto);
	}

}

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<>();

		mapa.put("Java", 20);
		mapa.put("Python", 10);
		mapa.put("C++", 15);

		// Verificando se um mapa tem uma chave
		System.out.println("Contem 'java'? " + mapa.containsKey("Java"));

		// Obtendo o valor associado a uma chave
		System.out.println("Valor associado a 'Java': " + mapa.get("Java"));

		mapa.put("Javascript", 25); // adicionando mais elementos
		mapa.put("Ruby", 5);

		// Imprime sem ordem
		System.out.println("Mapa completo " + mapa);

		// removendo um elemento
		mapa.remove("Python");
		System.out.println("Mapa após remoção do elemento " + mapa);

		// Atualizando o Java
		mapa.put("Java", 30);
		System.out.println("Mapa após a atualização do elemento java " + mapa);

		mapa.clear();
		System.out.println(mapa);
	}
}

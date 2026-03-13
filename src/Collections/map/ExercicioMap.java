import java.util.Map;
import java.util.HashMap;

public class ExercicioMap {
	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<>();

		// Codigo e quantidade
		mapa.put("132-321", 3);
		mapa.put("512-785", 2);
		mapa.put("333-888", 8);
		mapa.put("000-999", 5);

		System.out.println("Verificando a quantidade " + mapa.get("132-321"));
		mapa.replace("000-999", 5, 10);
		System.out.println(mapa);
	}
}

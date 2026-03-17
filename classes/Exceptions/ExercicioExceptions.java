public class ExercicioExceptions {
	public static void main(String[] args) {
		Integer numero = null;
		try {
			numero.toString();
		} catch (NullPointerException e) {
			System.out.println("Erro: Voce tentou acessar uma variavel nula - " + e.getMessage());
		} finally {
			System.out.println("Finalizando programa");
		}

	}
}

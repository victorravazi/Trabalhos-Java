public class ExercicioArrayException {

	public static int acessarElemento(int[] array, int indice) {
		try {
			return array[indice];
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Erro: voce tentou acessar um indice invalido neste array - " + ae.getMessage());
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] numArray = { 1, 4, 6 };

		System.out.println("Elemento no indice 2 -> " + acessarElemento(numArray, 2));

		System.out.println("Elemento no indice 6 -> " + acessarElemento(numArray, 6));

	}
}

public class ExceptionsEmMetodos {
	public static int calularMedia(int totalNotas, int quantidadeAlunos) throws ArithmeticException {
		return totalNotas / quantidadeAlunos;
	}

	public static void main(String[] args) {
		int totalNotas = 1;
		int quantidadeAlunos = 0;

		try {
			int media = calularMedia(totalNotas, quantidadeAlunos);
			System.out.println("Media das notas " + media);
		} catch (ArithmeticException ae) {
			System.out.println("Erro: Divisao por zero! - " + ae.getMessage());
		}

	}
}

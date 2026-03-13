public class ExceptionsDivisaoPorZero {
	public static void main(String[] args) {
		int totalNotas = 0;
		int quantidadeAlunos = 0;

		try {
			int media = totalNotas / quantidadeAlunos; // Divisao por zero
		} catch (ArithmeticException e) {
			System.out.println("Problema: Divisao por zero!");
		} finally {
			System.out.println("O programa foi encerrado");
		}

	}
}

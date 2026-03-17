public class ObjetoNulo {
	public static void main(String[] args) {
		String nome = "Victor";

		try {
			int tamanho = nome.length(); // tentando acessar a String nome para ver seu tamanho
			System.out.println("Tamanho do nome " + tamanho);
		} catch (NullPointerException e) {
			System.out.println("Erro: a variável é nula");
		} finally {
			System.out.println("Encerrando programa");
		}
	}
}

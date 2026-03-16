import java.io.*;

class ManipulacaoDeArquivos {
	public void escreverNoArquivo(String nome, String conteudo) throws IOException {
		FileWriter escrever = new FileWriter(nome);
		escrever.write(conteudo);
		escrever.close();
	}

	public void lerArquivo(String nome) throws IOException {
		FileReader reader = new FileReader(nome);
		int data = reader.read();

		while (data != -1) {
			System.out.print((char) data); // Casting
			data = reader.read();
		}
		reader.close();
	}
}

public class ExerciciosIO extends ManipulacaoDeArquivos {
	public static void main(String[] args) {
		ManipulacaoDeArquivos arq = new ManipulacaoDeArquivos();

		try {
			arq.escreverNoArquivo("arquivo", "blablablalba");
			arq.lerArquivo("arquivo");
		} catch (IOException e) {
			System.out.println("Erro de IO: " + e.getMessage());
		}
	}
}

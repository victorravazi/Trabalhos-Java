import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

class ManipulaArquivos {
	public void EscreverNoArquivo(String nomeArquivo, String conteudoArquivo) throws IOException {
		Path caminho = Paths.get(nomeArquivo);
		Files.write(caminho, conteudoArquivo.getBytes());
	}

	public void LerNoArquivo(String nomeArquivo) throws IOException {
		Path caminho = Paths.get(nomeArquivo);
		byte[] bytes = Files.readAllBytes(caminho);
		String content = new String(bytes);
		System.out.println(content);

	}
}

public class ExercicioNIO extends ManipulaArquivos {
	public static void main(String[] args) {
		ManipulaArquivos arquivos = new ManipulaArquivos();
		try {
			arquivos.EscreverNoArquivo("ArquivoEx2", "oooooooooooo");
			arquivos.LerNoArquivo("ArquivoEx2");
		} catch (IOException e) {
			System.out.println("Problemas de IO: " + e.getMessage());
		}
	}
}

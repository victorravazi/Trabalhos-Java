import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class ExemploJavaNIO {
	public static void main(String[] args) {

		Path path = Paths.get("NovoArquivo.txt");

		try {
			// Escrevendo um arquivo
			Files.write(path, "Amen Break ".getBytes());

			// Lendo um arquivo
			byte[] bytes = Files.readAllBytes(path);

			String content = new String(bytes);
			System.out.println(content);
		} catch (IOException e) {
			System.out.println("Problemas de IO: " + e.getMessage());
		}
	}
}

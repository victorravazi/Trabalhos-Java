import java.io.*;

public class ExemploJavaIO {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("meuArquivo.txt");

			writer.write("olá, mundo");
			writer.close();

			// Lendo um arquivo
			FileReader reader = new FileReader("meuArquivo.txt");

			int data = reader.read();

			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Problema de IO: " + e.getMessage());
		}
	}
}

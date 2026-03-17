import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class PontosChave {
	// método para serializar os contatos
	private static void serializarContatos(List<Contato> listaContatos) throws IOException {
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Agenda.ser"))) {
			outputStream.writeObject(listaContatos);
			System.out.println("Contatos Serializados e salvos com sucesso ");
		}
	}

	// Metodo para deserializar a agenda
	@SuppressWarnings("unchecked")
	private static void deserializarContatos() throws IOException, ClassNotFoundException {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Agenda.ser"))) {
			List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();
			for (Contato contato : contatosLidos) {
				System.out.println("Nome: " + contato.nome + "Telefone: " + contato.telefone);
			}

		}
	}

	public static void main(String[] args) {
		Contato contato1 = new Contato("Victor", "1699778412");
		Contato contato2 = new Contato("Murilo", "12039213");
		Contato contato3 = new Contato("Brenda", "123123123213");

		List<Contato> ListaContatos = new ArrayList<>();
		ListaContatos.add(contato1);
		ListaContatos.add(contato2);
		ListaContatos.add(contato3);

		try {
			serializarContatos(ListaContatos);
			deserializarContatos();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Erro ao manipular contatos: " + e.getMessage());
		}
	}
}

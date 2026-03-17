
interface Produto {
	void adicionarQuantidade(int quantidade);

	void removerQuantidade(int quantidade);

	String getNome();

	int getQuantidade();

}

class ProdutoImpl implements Produto {

	private String nome;
	private int quantidade;

	public ProdutoImpl(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	@Override
	public void adicionarQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}

	@Override
	public void removerQuantidade(int quantidade) {
		if (this.quantidade < quantidade) {
			System.out.println("Voce tentou remover quantidades maiores do que as possiveis");
		} else {
			this.quantidade -= quantidade;
		}
	}

	@Override
	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String getNome() {
		return nome;
	}
}

public class ControleDeEstoque {
	public static void main(String[] args) {
		ProdutoImpl produto1 = new ProdutoImpl("Mouse", 10);
		System.out.println("Nome: " + produto1.getNome());
		System.out.println("Quantidade:" + produto1.getQuantidade());
		System.out.println("Depois de adicionar Quantidade");
		produto1.adicionarQuantidade(10);
		System.out.println("Nome: " + produto1.getNome());
		System.out.println("Quantidade:" + produto1.getQuantidade());

	}
}

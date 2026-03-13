public class CaixaComGeneric<T> {
	private T coisaNaCaixa;

	public void guardar(T coisa) {
		this.coisaNaCaixa = coisa;
	}

	public T pegar() {
		return coisaNaCaixa;
	}

	public static void main(String[] args) {
		CaixaComGeneric<Carrinho> caixaCarrinhos = new CaixaComGeneric<>();
		caixaCarrinhos.guardar(new Carrinho("Carrinho esportivo"));

		CaixaComGeneric<Boneca> caixaBonecas = new CaixaComGeneric<>();
		caixaBonecas.guardar(new Boneca("Boneca Monster high"));

		Boneca boneca = caixaBonecas.pegar();
		Carrinho carrinho = caixaCarrinhos.pegar();

		System.out.println(boneca.getNome());
		System.out.println(carrinho.getModelo());
	}
}

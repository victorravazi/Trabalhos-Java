class CaixaBrinquedosNoGeneric {
	private Object coisaNaCaixa;

	public void guardar(Object coisa) {
		this.coisaNaCaixa = coisa;
	}

	public Object pegar() {
		return coisaNaCaixa;
	}

	public static void main(String[] args) {
		CaixaBrinquedosNoGeneric caixaDeCarrinhos = new CaixaBrinquedosNoGeneric();
		caixaDeCarrinhos.guardar(new Carrinho("Hot wheels"));

		CaixaBrinquedosNoGeneric caixaDeBonecas = new CaixaBrinquedosNoGeneric();
		caixaDeBonecas.guardar(new Boneca("Boneca Barbie"));
		if (caixaDeCarrinhos.pegar() instanceof Carrinho) {
			Carrinho carrinho = (Carrinho) caixaDeCarrinhos.pegar();
			System.out.println(carrinho.getModelo());
		}

		if (caixaDeBonecas.pegar() instanceof Boneca) {
			Boneca boneca = (Boneca) caixaDeBonecas.pegar();
			System.out.println(boneca.getNome());
		}

	}
}

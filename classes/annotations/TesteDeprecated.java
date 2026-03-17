class InformaRegras {
	@Deprecated
	public void mostraRegrasAposentadoria() {
		System.out.println("Mostrar regras aposentadoria");
	}

	public void mostrarNovasRegrasAposentadoria() {
		System.out.println(" NOVAS REGRAS APOSENTADORIA");
	}
}

public class TesteDeprecated {
	@SuppressWarnings("deprecation") // Suprime o aviso de deprecation, sem isso vai dar o aviso de Deprecação
	public static void main(String[] args) {
		InformaRegras regras = new InformaRegras();

		// Uso do metodo Obsoleto (Deprecated)
		regras.mostraRegrasAposentadoria();

		// Uso do novo metodo
		regras.mostrarNovasRegrasAposentadoria();

	}
}

abstract class Loja {

	private String cnpj;
	private String razaosocial;
	private boolean aberta;

	public Loja(String cnpj, String razaosocial) {
		this.cnpj = cnpj;
		this.razaosocial = razaosocial;
	}

	protected void setLoja(boolean aberta) {
		this.aberta = aberta;
	}

	protected boolean estaAberta() {
		return aberta;
	}

	abstract void abrirLoja();

	abstract void fecharLoja();

}

public class LojaAbstrata extends Loja {
	public LojaAbstrata(String cnpj, String razaosocial) {
		super(cnpj, razaosocial);
	}

	@Override
	public void abrirLoja() {
		setLoja(true);
		System.out.println(" Loja foi aberta");
	}

	@Override
	public void fecharLoja() {
		setLoja(false);
		System.out.println("A loja foi fechada");
	}

	public static void main(String[] args) {
		LojaAbstrata loja1 = new LojaAbstrata("123.123-32", "Loja Brasil");
		System.out.println("Loja esta aberta?: " + loja1.estaAberta());
		loja1.abrirLoja();
		System.out.println("Loja esta aberta?: " + loja1.estaAberta());
		loja1.fecharLoja();
		System.out.println("Loja esta aberta?: " + loja1.estaAberta());

	}
}

class Funcionario {
	private String nome;
	private double salario;

	public void addAumento(double valor) {
		salario += valor;
	}

	public double ganhoAnual() {
		return salario * 12;
	}

	public double getSalario() {
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

class Assistente extends Funcionario {

	public double ganhoAnual() {
		return super.ganhoAnual() + 10;
	}
}

public class TesteHeranca {
	public static void main(String[] args) {
		Assistente assistente1 = new Assistente();

		assistente1.addAumento(1000);
		assistente1.setNome("JOAO");
		assistente1.setSalario(2000);

		System.out.println("nome: " + assistente1.getNome());
		System.out.println("Salario " + assistente1.ganhoAnual());
	}
}

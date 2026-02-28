abstract class Veiculo {
	private String placa;
	private int ano;

	public void exibirInformacoes() {
		System.out.println("Placa do carro: " + placa);
		System.out.println("Ano do carro " + ano);
	}

	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}
}

class Onibus extends Veiculo {
	public int assentos;

	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Assentos do onibus: " + assentos);
	}

	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}

}

class Caminhao extends Veiculo {
	public int eixos;

	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Eixos do caminhao: " + eixos);
	}

	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}
}

class ExercicioPolimorfismo {
	public static void main(String[] args) {
		Veiculo onibus1 = new Onibus("AAA-EEE", 2006, 24);
		Veiculo caminhao1 = new Caminhao("OOO-UUU", 1998, 6);
		onibus1.exibirInformacoes();
		System.out.println(" ");
		caminhao1.exibirInformacoes();
	}
}

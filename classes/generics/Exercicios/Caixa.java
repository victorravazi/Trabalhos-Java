public class Caixa<T> {
	private Object[] elementos;

	public Caixa(int capacidade) {
		elementos = new Object[capacidade];
	}

	public void adicionar(T elemento, int indice) {
		elementos[indice] = elemento;
	}

	@SuppressWarnings("unchecked")
	public T obter(int indice) {
		return (T) elementos[indice];
	}

	public static void main(String[] args) {
		// Caixa para preços
		Caixa<Double> caixaPrecos = new Caixa<>(3);

		caixaPrecos.adicionar(10.5, 0);
		caixaPrecos.adicionar(20.0, 1);
		caixaPrecos.adicionar(35.9, 2);

		System.out.println("Preços:");
		System.out.println(caixaPrecos.obter(0));
		System.out.println(caixaPrecos.obter(1));
		System.out.println(caixaPrecos.obter(2));

		// Caixa para letras
		Caixa<Character> caixaLetras = new Caixa<>(3);

		caixaLetras.adicionar('A', 0);
		caixaLetras.adicionar('B', 1);
		caixaLetras.adicionar('C', 2);

		System.out.println("\nLetras:");
		System.out.println(caixaLetras.obter(0));
		System.out.println(caixaLetras.obter(1));
		System.out.println(caixaLetras.obter(2));
	}
}

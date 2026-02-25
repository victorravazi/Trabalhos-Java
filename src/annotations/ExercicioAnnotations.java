class SuperClasse {
	public void imprime() {
		System.out.println("Imprime");
	}
}

class MinhaClass extends SuperClasse {
	@Override
	public void imprime() {
		System.out.println("imprime outra coisa!@!!");
	}
}

public class ExercicioAnnotations {
	public static void main(String[] args) {
		MinhaClass classe1 = new MinhaClass();
		classe1.imprime();
	}
}

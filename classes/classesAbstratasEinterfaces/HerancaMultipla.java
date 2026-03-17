interface Interface1 {

	void metodo1();
}

interface Interface2 {
	void metodo2();
}

abstract class ClasseExemplo implements Interface1, Interface2 {
	public void metodo1() {
		System.out.println("Metodo 1");
	}

	public void metodo2() {
		System.out.println("Metodo 2");
	}
}

public class HerancaMultipla extends ClasseExemplo {
	public static void main(String[] args) {
		HerancaMultipla teste = new HerancaMultipla();
		teste.metodo1();
		teste.metodo2();
	}
}

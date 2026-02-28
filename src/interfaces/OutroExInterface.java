import java.lang.classfile.Interfaces;

interface ExemploInterfaceEspecial {
	// Metodo Abstrato
	void metodoAbstrato();

	// metodo default
	default void metodoDefault() {
		System.out.println("Este é um metodo default de uma interface");
	}

	// Metod Static
	static void metodoStatic() {
		System.out.println("Metodo Static de uma interface");
	}
}

class OutroExInterface implements ExemploInterfaceEspecial {
	public void metodoAbstrato() {
		System.out.println("Metodo Abstrato Sobrescrito");
	}

	public static void main(String[] args) {
		OutroExInterface ex1 = new OutroExInterface();
		ex1.metodoAbstrato();
		ex1.metodoDefault();
		ExemploInterfaceEspecial.metodoStatic();
	}
}

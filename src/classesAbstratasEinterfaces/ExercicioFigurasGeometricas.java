abstract class FiguraGeometrica {
	abstract int calcularArea(int base, int altura);

	abstract int calcularPerimetro(int a, int b, int c);
}

public class ExercicioFigurasGeometricas extends FiguraGeometrica {
	int calcularPerimetro(int a, int b, int c) {
		int perimetro = a + b + c;
		return perimetro;
	}

	int calcularArea(int base, int altura) {
		int area = (base * altura) / 2;
		return area;
	}

	public static void main(String[] args) {
		ExercicioFigurasGeometricas triangulo = new ExercicioFigurasGeometricas();
		System.out.println(triangulo.calcularArea(10, 10));
		System.out.println(triangulo.calcularPerimetro(3, 4, 6));

	}
}

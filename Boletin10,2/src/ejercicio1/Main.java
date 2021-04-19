package ejercicio1;

public class Main {
	
	public static void pintarFigura(Figura a) {
		System.out.println(a.toString());
		System.out.println(a.calcularArea());
		if(a instanceof Cuadrado) {
			((Cuadrado) a).pintarCuadrado();
		}
	}
	
	public static void main(String[] args) {
		Circulo circulo=new Circulo(10);
		Rectangulo rectangulo=new Rectangulo(5, 8);
		Triangulo triangulo=new Triangulo(5, 7);
		Cuadrado cuadrado=new Cuadrado(5, 5);
		
		pintarFigura(circulo);
		pintarFigura(rectangulo);
		pintarFigura(triangulo);
		pintarFigura(cuadrado);

	}

}

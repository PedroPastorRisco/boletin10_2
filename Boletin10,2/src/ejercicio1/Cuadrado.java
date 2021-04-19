package ejercicio1;

public class Cuadrado extends Rectangulo {

	public Cuadrado(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	public void pintarCuadrado() {
		for(int i=0;i<super.getAltura();i++) {
			for(int j=0;j<super.getBase();j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	

}

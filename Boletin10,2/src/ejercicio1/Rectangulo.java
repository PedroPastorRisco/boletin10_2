package ejercicio1;

public class Rectangulo implements Figura{
	private double base, altura;
	
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	

	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}


	@Override
	public double calcularArea() {
		return base*altura;
	}

}

package ejercicio1;


public class Circulo implements Figura {
	
	private double radio;
	final double PI=3.14;
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	

	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}
	


	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", PI=" + PI + "]";
	}


	@Override
	public double calcularArea() {
		return radio*radio*PI;
	}

	
}

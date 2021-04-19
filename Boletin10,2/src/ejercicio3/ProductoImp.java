package ejercicio3;

public class ProductoImp implements Producto {
	
	private int id;
	private String marca;
	
	public ProductoImp(int id,String marca) {
		this.id=id;
		this.marca=marca;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public void setId(int id) {
		this.id=id;
		
	}
	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return marca;
	}
	@Override
	public void setMarca(String marca) {
		this.marca=marca;
		
	}
	
	

}

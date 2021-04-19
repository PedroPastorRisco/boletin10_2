package ejercicio3;

public class PersonaImp implements Persona {
	
	private int id;
	private String nombre;
	
	public PersonaImp(int id,String nombre) {
		this.id=id;
		this.nombre=nombre;
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
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre=nombre;
		
	}
	

}

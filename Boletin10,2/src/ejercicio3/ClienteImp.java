package ejercicio3;

public class ClienteImp extends PersonaImp implements Cliente {

	private boolean socio;
	
	public ClienteImp(int id, String nombre,boolean socio) {
		super(id, nombre);
		this.socio=socio;
	}

	
	@Override
	public boolean isSocio() {
		// TODO Auto-generated method stub
		return socio;
	}

	@Override
	public void setSocio(boolean socio) {
		this.socio=socio;
		
	}
	
	

	
	

}

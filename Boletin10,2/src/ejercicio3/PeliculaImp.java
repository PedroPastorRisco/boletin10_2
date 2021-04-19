package ejercicio3;

public class PeliculaImp extends ProductoImp implements Pelicula{
	
	private String director;
	
	public PeliculaImp(int id, String marca,String director) {
		super(id, marca);
		this.director=director;
	}

	@Override
	public String getDirector() {
		// TODO Auto-generated method stub
		return director;
	}

	@Override
	public void setDirector(String director) {
		this.director=director;
		
	}

}

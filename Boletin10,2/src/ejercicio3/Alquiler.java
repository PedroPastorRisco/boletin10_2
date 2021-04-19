package ejercicio3;

import java.time.LocalDate;

public class Alquiler {
	
	private ClienteImp cliente;
	private PeliculaImp pelicula;
	private LocalDate fecha;
	
	public Alquiler(ClienteImp cliente,PeliculaImp pelicula,LocalDate fecha) {
		this.cliente=cliente;
		this.pelicula=pelicula;
		this.fecha=fecha;
	}


	public ClienteImp getCliente() {
		return cliente;
	}



	public void setCliente(ClienteImp cliente) {
		this.cliente = cliente;
	}



	public PeliculaImp getPelicula() {
		return pelicula;
	}



	public void setPelicula(PeliculaImp pelicula) {
		this.pelicula = pelicula;
	}



	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "Alquiler [cliente=" + cliente.getNombre() + ", pelicula=" + pelicula.getId() + ", fecha=" + fecha + "]";
	}
	
	

}

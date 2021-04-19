package ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;




public class Main {

	public static void main(String[] args) {
		List<Alquiler> listaAlquileres=new ArrayList<>();
		
		ClienteImp cliente1=new ClienteImp(1, "Pedro Pastor", true);
		ClienteImp cliente2=new ClienteImp(2, "Santiago Martinez", false);
		PeliculaImp pelicula1=new PeliculaImp(10, "Warner", "Cristiano Ronaldo");
		PeliculaImp pelicula2=new PeliculaImp(78, "Marvel", "Perro Sanchez");
		Alquiler alquiler=new Alquiler(cliente1, pelicula2, LocalDate.parse("2018-06-13"));
		Alquiler alquiler2=new Alquiler(cliente2, pelicula1, LocalDate.now());
		listaAlquileres.add(alquiler);
		listaAlquileres.add(alquiler2);
		for (Alquiler alquilerPrueba : listaAlquileres) {
			System.out.println(alquilerPrueba.toString());
		}
	}

}

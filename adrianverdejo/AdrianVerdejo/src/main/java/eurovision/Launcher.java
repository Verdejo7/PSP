package eurovision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Launcher {

	public static void main(String[] args) {
		
		ArrayList<Paises> pais = new ArrayList<>();
		pais.add(new Paises("Servia", 3));
		pais.add(new Paises("Moldavia", 8));
		pais.add(new Paises("Hungria", 5));
		pais.add(new Paises("Ucrania", 2));
		pais.add(new Paises("Hungria", 5));
		pais.add(new Paises("Suecia", 1));
		pais.add(new Paises("Australia", 4));
		pais.add(new Paises("Noruega", 7));
		pais.add(new Paises("Dinamarca", 1));
		pais.add(new Paises("Eslovenia", 3));
		pais.add(new Paises("Holanda", 10));
		pais.add(new Paises("Albania", 6));
		pais.add(new Paises("República Checa", 4));
		pais.add(new Paises("Lituania", 1));
		pais.add(new Paises("Israel", 5));
		pais.add(new Paises("Estonia", 8));
		pais.add(new Paises("Bulgaria", 2));
		pais.add(new Paises("Austria", 7));
		pais.add(new Paises("Finlandia", 4));
		pais.add(new Paises("Irlanda", 2));
		pais.add(new Paises("Chipre", 1));
		pais.add(new Paises("Italia", 6));
		pais.add(new Paises("Reino Unido", 5));
		pais.add(new Paises("Francia", 1));
		pais.add(new Paises("Alemania", 10));
		pais.add(new Paises("España", 12));
		
		Collections.sort(pais);
		
		for (Paises paises : pais){
			System.err.println(paises.getNombre()+ " : "+ paises.getPuntuacion());
		}
		
		Map<Paises, Integer> mapaDePuntuaciones = new HashMap<>();
		
		Paises paisMaxPunt = Collections.max(mapaDePuntuaciones.entrySet(), Map.Entry.comparingByValue()).getKey();
		int maximaPuntuacion = mapaDePuntuaciones.get(paisMaxPunt);
		
		Paises paisMinPunt = Collections.min(mapaDePuntuaciones.entrySet(), Map.Entry.comparingByValue()).getKey();
		int minimaPuntuacion = mapaDePuntuaciones.get(paisMinPunt);
		
		System.out.println("Pais con maxima puntuacion");
		System.out.println(paisMaxPunt.getNombre()+" : "+ maximaPuntuacion + " puntos");
		
		System.out.println("Pais con maxima puntuacion");
		System.out.println(paisMinPunt.getNombre()+" : "+ minimaPuntuacion + " puntos");

	}

}

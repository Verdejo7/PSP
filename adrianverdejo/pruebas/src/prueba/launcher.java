package prueba;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class launcher {
	public static void main(String[] args) {
	// Crea un mapa para almacenar la puntuacion de cada pais
    Map<String, Integer> puntuacion = new HashMap<>();

    // Itera por los paises finalistas
    for (String pais : paises.paisesFinalistas) {
        // Genera aleatoriamente los 10 paises a los que va a votar
        Set<String> paisesVotados = generarPaisesVotados(pais);

        // Asigna los puntos a los paises votados
        for (String paisVotado : paisesVotados) {
            puntuacion.put(paisVotado, puntuacion.getOrDefault(paisVotado, 0) + generarPuntuacion());
        }
    }

    // Ordena la puntuacion por orden alfabetico
    Map<String, Integer> puntuacionOrdenada = puntuacion.entrySet().stream().sorted(Map.Entry.comparingByKey())
    		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    // Imprime la puntuacion ordenada
    System.out.println("Puntuación ordenada por orden alfabético:");
    for (Map.Entry<String, Integer> entrada : puntuacionOrdenada.entrySet()) {
        System.out.println(entrada.getKey() + ": " + entrada.getValue());
    }

    // Obtiene el pais con la puntuacion mas alta y la mas baja
    Map.Entry<String, Integer> paisMasAlto = puntuacion.entrySet().stream().max(Map.Entry.comparingByValue()).get();
    Map.Entry<String, Integer> paisMasBajo = puntuacion.entrySet().stream().min(Map.Entry.comparingByValue()).get();

    // Imprime el pais con la puntuacion mas alta y la mas baja
    System.out.println("País con la puntuación más alta: " + paisMasAlto.getKey() + " (" + paisMasAlto.getValue() + " puntos)");
    System.out.println("País con la puntuación más baja: " + paisMasBajo.getKey() + " (" + paisMasBajo.getValue() + " puntos)");
}

private static Set<String> generarPaisesVotados(String pais) {
    // Crea un conjunto para almacenar los paises votados
    Set<String> paisesVotados = new HashSet<>();

    // Itera por los paises finalistas
    for (String paisFinalista : paises.paisesFinalistas) {
        // Si el pais no es el mismo que el que esta votando y no lo ha votado ya, lo añade al conjunto
        if (!pais.equals(paisFinalista) && !paisesVotados.contains(paisFinalista)) {
            paisesVotados.add(paisFinalista);
        }
    }

    // Devuelve el conjunto de paises votados
    return paisesVotados;
}

private static int generarPuntuacion() {
    // Genera un numero aleatorio entre 1 y 12
    int puntuacion = (int) (Math.random() * 12) + 1;

    // Devuelve la puntuacion
    return puntuacion;
	}
}

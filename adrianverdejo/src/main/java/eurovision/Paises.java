package eurovision;

import java.util.Objects;

public class Paises implements Comparable<Paises> {
	protected String nombre;
	protected int puntuacion;
	
	public Paises(String nombre, int puntuacion) {
		super();
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, puntuacion);
	}
	
	
	
	public int compareTo(Paises otroPais) {
		return nombre.compareTo(otroPais.nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paises other = (Paises) obj;
		return Objects.equals(nombre, other.nombre) && puntuacion == other.puntuacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paises [nombre=");
		builder.append(nombre);
		builder.append(", puntuacion=");
		builder.append(puntuacion);
		builder.append("]");
		return builder.toString();
	}
	
}

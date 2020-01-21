/**
 * 
 * @author 
 *
 */

public class Emisora {
	private String nombre;
	private int frecuencia; // 1 FM   0 AM
	
	
	public Emisora(String nombre, int frecuencia) {
		this.nombre = nombre;
		this.frecuencia = frecuencia;  // 1 FM   0 AM
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the frecuencia
	 */
	public int getFrecuencia() {
		return frecuencia;
	}


	/**
	 * @param frecuencia the frecuencia to set
	 */
	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	
	

}

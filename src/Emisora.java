/**
 * 
 * @author josej
 *
 */
public class Emisora {
	private String nombre;
	private int frecuencia; // 1 FM   0 AM
	private int orden;
	
	
	public Emisora(String nombre, int frecuencia, int orden) {
		this.nombre = nombre;
		this.frecuencia = frecuencia;  // 1 FM   0 AM
		this.orden = orden;
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
	 * @return the orden
	 */
	public int getOrden() {
		return orden;
	}


	/**
	 * @param orden the orden to set
	 */
	public void setOrden(int orden) {
		this.orden = orden;
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

/**
 * Hoja de trabajo 1
 * @author Jose Hurtarte
 * @author Javier Coto
 *
 */
public interface iRadio {
	
	/**
	 * 
	 * @return Estacion actual
	 */
	public String estacionActual();
	
	/**
	 * 
	 * @return estado de encendido/apagado
	 */
	public boolean estado();
	
	/**
	 * apaga/enciende
	 */
	public void onOff();
	
	/**
	 * Cambia frecuencia
	 */
	public void cambiarFrecuencia();
	
	/**
	 * Avanza estacion
	 */
	public void avanzar();
	
	/**
	 * Guarda estacion
	 * @param boton
	 */
	public void guardar(int boton);
	
	/**
	 * Selecciona la emisora
	 */
	public void seleccionarEmisora(int boton);
	
}

/**
 * @author Jose Hurtarte
 * @author Javier Coto
 *
 */
public interface iRadio {
	
	/**
	 * 
	 * @return
	 */
	public String estacionActual();
	
	/**
	 * 
	 * @return
	 */
	public boolean estado();
	
	/**
	 * 
	 */
	public void onOff();
	
	/**
	 * 
	 */
	public void cambiarFrecuencia();
	
	/**
	 * 
	 */
	public void avanzar();
	
	/**
	 * 
	 * @param boton
	 */
	public void guardar(int boton);
	
	/**
	 * 
	 */
	public void seleccionarEmisora();
	
}

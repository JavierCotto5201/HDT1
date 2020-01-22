/**
 * @author josej
 *
 */


public class ControladorRadio implements iRadio {
	private boolean encendido;
	private int frecuencia;    //1 FM  0 AM
	private Emisora[][] emisorasFavoritas;
	private Emisora[][] emisorasTotales;
	private int posicionAm;
	private int posicionFm;
	
	

	/**
	 * 
	 */
	public ControladorRadio() {
		encendido = false;
		frecuencia = 1; //    1 FM  0 AM
		emisorasFavoritas = new Emisora[2][12];
		emisorasTotales = new Emisora[2][15];
		posicionAm = 0;
		posicionFm = 0;
		
	}

	@Override
	public String estacionActual() {
		String descripcionEstacion = "";
		
		int posicion = posicionAm;
		if(frecuencia == 1) {
			posicion = posicionFm;
		}
		
		if(emisorasTotales[frecuencia][posicion] != null) {
			if(frecuencia == 1) {
				descripcionEstacion +="FM  ";
			}
			if(frecuencia == 0) {
				descripcionEstacion +="AM  ";
			}
			
			descripcionEstacion += emisorasTotales[frecuencia][posicion].getNombre();
		}
	
		return descripcionEstacion;
	}

	@Override
	public boolean estado() {
	
		return encendido;
	}

	@Override
	public void onOff() {
		encendido = !encendido;

	}

	@Override
	public void cambiarFrecuencia() {
		if(frecuencia == 0) {
			frecuencia = 1;
		}
		
		else if(frecuencia == 1) {
			frecuencia = 0;
		}

	}

	@Override
	public void avanzar() {
		if(frecuencia == 0) {
			posicionAm++;
			if(posicionAm > 19) {
				posicionAm = 0;
			}
		}
		
		else if(frecuencia == 1) {
			posicionFm++;
			if(posicionFm > 19) {
				posicionFm = 0;
			}
		}

	}

	@Override
	public void guardar(int boton) {
		if(frecuencia == 0) {
			emisorasFavoritas[frecuencia][boton-1] = emisorasTotales[frecuencia][posicionAm];
		}
		
		else if(frecuencia == 1) {
			emisorasFavoritas[frecuencia][boton-1] = emisorasTotales[frecuencia][posicionFm];
		}

	}

	@Override
	public void seleccionarEmisora(int boton) {
		
		//emisorasFavoritas[frecuencia][boton-1];
		

	}

}

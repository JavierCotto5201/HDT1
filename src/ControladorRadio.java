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
		encendido = true;
		frecuencia = 1; //    1 FM  0 AM
		emisorasFavoritas = new Emisora[2][12];
		emisorasTotales = new Emisora[2][20];
		posicionAm = 0;
		posicionFm = 0;
		
		//Llenado de emisoras FM
		emisorasTotales[1][0] = new Emisora("88.1", 1, 0);
		emisorasTotales[1][1] = new Emisora("89.7", 1, 1);
		emisorasTotales[1][2] = new Emisora("90.1", 1, 2);
		emisorasTotales[1][3] = new Emisora("91.1", 1, 3);
		emisorasTotales[1][4] = new Emisora("91.3", 1, 4);
		emisorasTotales[1][5] = new Emisora("92.2", 1, 5);
		emisorasTotales[1][6] = new Emisora("94.9", 1, 6);
		emisorasTotales[1][7] = new Emisora("95.0", 1, 7);
		emisorasTotales[1][8] = new Emisora("95.3", 1, 8);
		emisorasTotales[1][9] = new Emisora("96.5", 1, 9);
		emisorasTotales[1][10] = new Emisora("97.3", 1, 10);
		emisorasTotales[1][11] = new Emisora("98.3", 1, 11);
		emisorasTotales[1][12] = new Emisora("99.3", 1, 12);
		emisorasTotales[1][13] = new Emisora("100.3", 1, 13);
		emisorasTotales[1][14] = new Emisora("100.9", 1, 14);
		emisorasTotales[1][15] = new Emisora("101.1", 1, 15);
		emisorasTotales[1][16] = new Emisora("101.5", 1, 16);
		emisorasTotales[1][17] = new Emisora("102.5", 1, 17);
		emisorasTotales[1][18] = new Emisora("107.3", 1, 18);
		emisorasTotales[1][19] = new Emisora("107.7", 1, 19);
		
		//Llenado de emisoras AM
		emisorasTotales[0][0] = new Emisora("560", 0, 0);
		emisorasTotales[0][1] = new Emisora("580", 0, 1);
		emisorasTotales[0][2] = new Emisora("610", 0, 2);
		emisorasTotales[0][3] = new Emisora("640", 0, 3);
		emisorasTotales[0][4] = new Emisora("700", 0, 4);
		emisorasTotales[0][5] = new Emisora("730", 0, 5);
		emisorasTotales[0][6] = new Emisora("760", 0, 6);
		emisorasTotales[0][7] = new Emisora("790", 0, 7);
		emisorasTotales[0][8] = new Emisora("820", 0, 8);
		emisorasTotales[0][9] = new Emisora("880", 0, 9);
		emisorasTotales[0][10] = new Emisora("910", 0, 10);
		emisorasTotales[0][11] = new Emisora("940", 0, 11);
		emisorasTotales[0][12] = new Emisora("970", 0, 12);
		emisorasTotales[0][13] = new Emisora("1030", 0, 13);
		emisorasTotales[0][14] = new Emisora("1090", 0, 14);
		emisorasTotales[0][15] = new Emisora("1120", 0, 15);
		emisorasTotales[0][16] = new Emisora("1150", 0, 16);
		emisorasTotales[0][17] = new Emisora("1190", 0, 17);
		emisorasTotales[0][18] = new Emisora("1270", 0, 18);
		emisorasTotales[0][19] = new Emisora("1330", 0, 19);
		
		
		
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
		if(encendido == false) {
			descripcionEstacion = "";   //PD se puede cambiar a un mensaje tipo 'RADIO APAGADA'
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
		if(emisorasFavoritas[frecuencia][boton-1] != null) {
			 if(frecuencia == 1) {
				 posicionFm = emisorasFavoritas[frecuencia][boton-1].getOrden();
			 }
			 if(frecuencia == 0) {
				 posicionAm = emisorasFavoritas[frecuencia][boton-1].getOrden();
			 }
		}
		

	}

}

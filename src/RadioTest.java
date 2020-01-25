import static org.junit.Assert.*; 

import org.junit.Test;

 public class RadioTest {
	 

	 
	@Test
	public void testOnoff() {
		ControladorRadio radioPrueba= new ControladorRadio();
		 radioPrueba.onOff(); //deberia de encender la Radio
		 radioPrueba.onOff(); //deberia de apagar la Radio
		 radioPrueba.onOff(); //deberia de encender la Radio
		 //deberia de devolver un estado de encendido
		 assertTrue(radioPrueba.estado());
	}
	
	@Test
	public void testFM() {
		ControladorRadio radioPrueba= new ControladorRadio();
		radioPrueba.onOff();
		String actual = radioPrueba.estacionActual();
		//deberia de devolver la primera estacion dentro de la lista
		assertEquals("FM  88.1",actual);
		
	}
	
	@Test
	public void testApagado() {
		ControladorRadio radioPrueba= new ControladorRadio();
		radioPrueba.cambiarFrecuencia();
		radioPrueba.avanzar();
		//No tendria que devolver un string el metodo avanzar si no esta encendia la radio
		
		assertEquals("", radioPrueba.estacionActual());
		
		
	}
}

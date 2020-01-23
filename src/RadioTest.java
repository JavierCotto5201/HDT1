import static org.junit.Assert.*; 

import org.junit.Test;

 public class RadioTest {
	 

	 
	@Test
	public void testOnoff() {
		ControladorRadio radioPrueba= new ControladorRadio();
		 radioPrueba.onOff(); //deberia de encender la Radio
		 radioPrueba.onOff(); //deberia de apagar la Radio
		 radioPrueba.onOff(); //deberia de encender la Radio
		 assertTrue(radioPrueba.estado());
	}
	
	@Test
	public void testFM() {
		ControladorRadio radioPrueba= new ControladorRadio();
		
		assertFalse("FM  88.1".equals(radioPrueba.estacionActual()));
		
	}
	
	@Test
	public void testFrecuencia() {
		ControladorRadio radioPrueba= new ControladorRadio();
		radioPrueba.cambiarFrecuencia();
		
		assertTrue(radioPrueba.estacionActual().equals(""));
		
		
	}
}

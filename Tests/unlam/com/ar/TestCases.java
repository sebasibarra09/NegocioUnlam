package unlam.com.ar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TestCases {

	

	@Test
	public void queSePuedanAlmacenarLosDistintosTiposDeTransacciones() {
		
		assertTrue(true);
	}
	
	@Test
	public void queSePuedanAlmacenarLosDistintosTiposDePersonas() {
		Billetera bille = new Billetera ("Bille");
		PersonaJuridica vendedor = new PersonaJuridica(15873212L, "Pedrito");
		PersonaFisica comprador = new PersonaFisica(158732L, "Pedrito");
		bille.almacernarPersonaJuridica(vendedor);
		bille.almacernarPersonaFisica(comprador);
		bille.almacernarPersonaFisica(new PersonaFisica(1587322L, "Pedrito"));
		
		assertEquals(2, bille.getPersonasFisicas().size());
		assertFalse(bille.getPersonasJuridicas().isEmpty());
	}
	
	@Test
	public void queSePuedanAsociadACadaPersonaSusMedios() {
		PersonaFisica comprador = new PersonaFisica(158732L, "Pedrito");
		MedioDePago medio = new TarjetaDeDebito(18L, "Visa");
		MedioDePago medio2 = new TarjetaDeCredito(188L, "Visa");
		MedioDePago medio3 = new CuentasBancarias(185L, "Visa");
		MedioDePago medio4 = new CuentasVirtuales(187L, "Visa");
	
		comprador.asociarMedioDePago(medio);
		comprador.asociarMedioDePago(medio2);
		comprador.asociarMedioDePago(medio3);
		comprador.asociarMedioDePago(medio4);
		
		assertEquals(4, comprador.getMediosDePago().size());
		assertFalse(comprador.getMediosDePago().isEmpty());
	}
	
	
	@Test
	public void queSePuedanAsociadACadaPersonaSusMedios2() {
		PersonaFisica comprador = new PersonaFisica(158732L, "Pedrito");
		MedioDePago medio = new TarjetaDeDebito(18L, "Visa");
		MedioDePago medio2 = new TarjetaDeCredito(188L, "Visa");
		MedioDePago medio3 = new CuentasBancarias(185L, "Visa");
		CuentasVirtuales medio4 = new CuentasVirtuales(187L, "Visa");
	
		comprador.asociarMedioDePago(medio);
		comprador.asociarMedioDePago(medio2);
		comprador.asociarMedioDePago(medio3);
		comprador.asociarMedioDePago(medio4);
		
		System.out.println(medio4.getSaldo());
		medio4.depositar(800.0);
		System.out.println(medio4.getSaldo());
		medio4.depositar(800.0);
		System.out.println(medio4.getSaldo());
		medio4.extraer(750.0);
		System.out.println(medio4.getSaldo());
		
		assertEquals(4, comprador.getMediosDePago().size());
		assertFalse(comprador.getMediosDePago().isEmpty());
	}
	
	

}

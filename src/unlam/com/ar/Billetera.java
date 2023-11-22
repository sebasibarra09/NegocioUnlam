package unlam.com.ar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Billetera {
	
	private String nombre;
	private Set <PersonaJuridica> personasJuridicas;
	private Set <PersonaFisica> personasFisicas;
	private List<Compra> compras;
	

	public Billetera(String nombre) {
		this.nombre = nombre;
		this.personasJuridicas = new HashSet<>();
		this.personasFisicas = new HashSet<>();
		this.compras= new ArrayList<>();
	}
	
	public void almacernarPersonaJuridica(PersonaJuridica vendedor) {
		personasJuridicas.add(vendedor);
	}
	
	public void almacernarPersonaFisica(PersonaFisica comprador) {
		personasFisicas.add(comprador);
	}
	
	public void realizarCompra(PersonaJuridica vendedor, Double importe) {
		Compra compr = new Compra(vendedor, importe);
		compras.add(compr);
	}
	
	
	
	
	
	
	
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<PersonaJuridica> getPersonasJuridicas() {
		return personasJuridicas;
	}

	public void setPersonasJuridicas(Set<PersonaJuridica> personasJuridicas) {
		this.personasJuridicas = personasJuridicas;
	}

	public Set<PersonaFisica> getPersonasFisicas() {
		return personasFisicas;
	}

	public void setPersonasFisicas(Set<PersonaFisica> personasFisicas) {
		this.personasFisicas = personasFisicas;
	}
	
	
	

}

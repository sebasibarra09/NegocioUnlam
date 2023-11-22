package unlam.com.ar;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PersonaFisica extends Persona {
	
	private Set<MedioDePago> mediosDePago; 

	public PersonaFisica(Long id, String nombre) {
		super(id, nombre);
		this.mediosDePago = new TreeSet<>();
	}
	
	public void asociarMedioDePago(MedioDePago medio) {
		mediosDePago.add(medio);
	}

	public Set<MedioDePago> getMediosDePago() {
		return mediosDePago;
	}

	public void setMediosDePago(Set<MedioDePago> mediosDePago) {
		this.mediosDePago = mediosDePago;
	}

}

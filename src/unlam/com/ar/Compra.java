package unlam.com.ar;

public class Compra {
	
	private PersonaJuridica comercio;
	private Double importe;
	private Boolean pagada;
	

	public Compra(PersonaJuridica comercio, Double importe) {
		this.comercio=comercio;
		this.importe=importe;
	
	}

}

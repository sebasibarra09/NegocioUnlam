package unlam.com.ar;

public class TarjetaDeCredito extends MedioDePago implements Pagadora {

	public TarjetaDeCredito(Long numero, String tipo) {
		super(numero, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

}

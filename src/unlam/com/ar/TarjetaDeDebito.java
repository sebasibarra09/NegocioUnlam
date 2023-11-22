package unlam.com.ar;

public class TarjetaDeDebito extends MedioDePago implements Pagadora {

	public TarjetaDeDebito(Long numero, String tipo) {
		super(numero, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

}

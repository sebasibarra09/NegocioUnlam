package unlam.com.ar;

public class CuentasBancarias extends MedioDePago implements Transferible{

	public CuentasBancarias(Long numero, String tipo) {
		super(numero, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean extraer(Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

}

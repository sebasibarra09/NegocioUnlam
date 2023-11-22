package unlam.com.ar;

public class CuentasVirtuales extends MedioDePago implements Pagadora, Transferible {
	
	private Double saldo ;

	public CuentasVirtuales(Long numero, String tipo) {
		super(numero, tipo);
		this.saldo=0.0;
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getSaldo() {
		return this.saldo;
	}

	@Override
	public void depositar(Double importe) {
		this.saldo += importe;
		return;
		
	}

	@Override
	public Boolean extraer(Double importe) {
		if (saldo >= importe) {
			this.saldo-=importe;
			return true;
		}	
	return false;
	}

}

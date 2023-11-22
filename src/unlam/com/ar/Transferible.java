package unlam.com.ar;

public interface Transferible {
	
	Double getSaldo();
	void depositar(Double importe);
	Boolean extraer(Double importe);
}

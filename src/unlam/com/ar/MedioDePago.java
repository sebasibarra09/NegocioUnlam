package unlam.com.ar;

public class MedioDePago implements Comparable{
	
	private Long numero;
	private String tipo;

	public MedioDePago(Long numero, String tipo){
		this.numero = numero;
		this.tipo = tipo;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedioDePago other = (MedioDePago) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		return this.numero.compareTo(((MedioDePago) o).getNumero());
	}
	
	
	
}

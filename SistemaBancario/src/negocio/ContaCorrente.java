package negocio;

/**
 * Classe {@link ContaCorrente} que representa uma conta corrente real
 * e que poderá ser associada a um cliente.
 * @author Gustavo Farias
 */
public class ContaCorrente {
	
	private int id;
	
	private double saldo;
	
	private boolean ativa;

	public ContaCorrente(int id, double saldo, boolean ativa) {
		this.id = id;
		this.saldo = saldo;
		this.ativa = ativa;
	}

	/**
	 * Método que retorna o ID da conta corrente. 
	 * @return ID da conta corrente
	 */
	public int getId() {
		return id;
	}

	/**
	 * Método que atualiza o ID da conta corrente. 
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Método que retorna o saldo da conta corrente. 
	 * @return saldo da conta corrente
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método que atualiza o saldo da conta corrente. 
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método que retorna o status da conta corrente, podendo ser Ativa ou Inativa. 
	 * @return status da conta corrente
	 */
	public boolean isAtiva() {
		return ativa;
	}

	/**
	 * Método que atualiza o status da conta corrente. 
	 */
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	/**
	 * Método que retorna a representação textual de uma conta corrente. 
	 * @return representação textual da conta corrente
	 */
	@Override
	public String toString() {
		
		String str = "========================="
					+ "Id: " + this.id + "\n"
					+ "Saldo: " + this.saldo + "\n"
					+ "Status: " + (ativa?"Ativa":"Inativa") + "\n"
					+ "=========================";
		return str;
	}
	
}

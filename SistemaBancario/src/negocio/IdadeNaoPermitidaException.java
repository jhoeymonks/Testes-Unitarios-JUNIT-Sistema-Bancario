package negocio;

/**
 * Exceção a ser lançada quando a idade de um possível novo cliente não for aceita.
 * 
 * @author Gustavo Farias
 */
public class IdadeNaoPermitidaException extends Exception {

	public static String MSG_IDADE_INVALIDA = "A idade do cliente precisa estar entre 18 e 65 anos.";
	
	public IdadeNaoPermitidaException(String msg) {
		super(msg);
	}

}

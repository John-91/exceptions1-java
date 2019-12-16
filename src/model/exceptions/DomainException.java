package model.exceptions;

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L; //nao � obrigado a tratar
	
	public DomainException(String msg) {
		super(msg);
	}
}

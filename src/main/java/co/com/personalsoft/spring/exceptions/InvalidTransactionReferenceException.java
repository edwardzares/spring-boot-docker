package co.com.personalsoft.spring.exceptions;

public class InvalidTransactionReferenceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidTransactionReferenceException(String message) {
		super(message);
	}
	
}

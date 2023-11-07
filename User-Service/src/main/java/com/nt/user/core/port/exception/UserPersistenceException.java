package com.nt.user.core.port.exception;

public class UserPersistenceException extends RuntimeException {

	private static final long serialVersionUID = 2204976279249508371L;

	public static final String ERROR_DB_SAVING = "Error saving record in database.";

	public UserPersistenceException(Throwable cause) {
		super(cause);
	}

}

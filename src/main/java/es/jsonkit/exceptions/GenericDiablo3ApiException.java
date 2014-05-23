package es.jsonkit.exceptions;

public class GenericDiablo3ApiException extends Exception {

	public GenericDiablo3ApiException() {
		super();
	}

	public GenericDiablo3ApiException(final String message) {
		super(message);
	}

	public GenericDiablo3ApiException(final Throwable throwable) {
		super(throwable);
	}

	public GenericDiablo3ApiException(final String message, final Throwable throwable) {
		super(message, throwable);
	}
}

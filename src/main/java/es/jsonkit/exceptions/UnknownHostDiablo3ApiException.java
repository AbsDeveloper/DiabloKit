package es.jsonkit.exceptions;

public class UnknownHostDiablo3ApiException extends GenericDiablo3ApiException {

	public UnknownHostDiablo3ApiException() {
		super();
	}

	public UnknownHostDiablo3ApiException(final String message) {
		super(message);
	}

	public UnknownHostDiablo3ApiException(final Throwable throwable) {
		super(throwable);
	}

	public UnknownHostDiablo3ApiException(final String message, final Throwable throwable) {
		super(message, throwable);
	}
}

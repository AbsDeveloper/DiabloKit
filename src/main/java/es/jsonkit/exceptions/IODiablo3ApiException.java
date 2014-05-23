package es.jsonkit.exceptions;

public class IODiablo3ApiException extends GenericDiablo3ApiException {

	public IODiablo3ApiException() {
		super();
	}

	public IODiablo3ApiException(final String message) {
		super(message);
	}

	public IODiablo3ApiException(final Throwable throwable) {
		super(throwable);
	}

	public IODiablo3ApiException(final String message, final Throwable throwable) {
		super(message, throwable);
	}
}

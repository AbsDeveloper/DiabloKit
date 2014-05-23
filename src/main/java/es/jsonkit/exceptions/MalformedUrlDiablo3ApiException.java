package es.jsonkit.exceptions;

public class MalformedUrlDiablo3ApiException extends GenericDiablo3ApiException {

	public MalformedUrlDiablo3ApiException() {
		super();
	}

	public MalformedUrlDiablo3ApiException(final String message) {
		super(message);
	}

	public MalformedUrlDiablo3ApiException(final Throwable throwable) {
		super(throwable);
	}

	public MalformedUrlDiablo3ApiException(final String message, final Throwable throwable) {
		super(message, throwable);
	}
}

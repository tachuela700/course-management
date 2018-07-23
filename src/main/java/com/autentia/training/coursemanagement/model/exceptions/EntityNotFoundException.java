package com.autentia.training.coursemanagement.model.exceptions;

public class EntityNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Constructs a new <code>EntityNotFoundException</code> exception with
     * <code>null</code> as its detail message.
     */
    public EntityNotFoundException() {
        super();
    }

    /**
     * Constructs a new <code>EntityNotFoundException</code> exception with the
     * specified detail message.
     *
     * @param message
     *            the detail message.
     */
    public EntityNotFoundException(String message) {
        super(message);
    }
}

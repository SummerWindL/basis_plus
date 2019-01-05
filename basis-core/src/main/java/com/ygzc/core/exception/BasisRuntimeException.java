package com.ygzc.core.exception;

/**
 * @author yanl.fu
 *
 */
public class BasisRuntimeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8185689735036753020L;
	
	public BasisRuntimeException() {
		super();
	}
	
	public BasisRuntimeException(String message) {
		super(message);
	}
	
	public BasisRuntimeException(String message,Throwable throwable) {
		super(message,throwable);
	}
	
	public BasisRuntimeException(Throwable throwable) {
		super(throwable);
	}

}

package com.sapient.publicis.week2;

import java.io.Serializable;
import java.util.Arrays;

public class SessionObj implements Serializable {
	
	public String operation;
	public String[] inputs;
	
	public SessionObj(String operation, String[] inputs) {
		super();
		this.inputs = inputs;
		this.operation = operation;
	}

	@Override
	public String toString() {
		return " Operation = " + operation + ", inputs = " + Arrays.toString(inputs);
	}	
}

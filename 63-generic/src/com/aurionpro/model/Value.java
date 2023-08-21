package com.aurionpro.model;

public class Value<T> {
	
	private T value;

	public Value(T value) {
		super();
		this.value = value;
	}
	
	public void print() {
		System.out.println(value);
		
	}

	@Override
	public String toString() {
		return "Value [value=" + value + "]";
	}
	}



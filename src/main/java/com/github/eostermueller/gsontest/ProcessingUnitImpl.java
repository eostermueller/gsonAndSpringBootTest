package com.github.eostermueller.gsontest;

import java.util.Locale;

public class ProcessingUnitImpl {
	
	private Descriptor descriptor = new Descriptor();
	
	public void setDescriptor(Descriptor d) {
		descriptor = d;
		
	}
	
	public Descriptor getDescriptor() {
		return descriptor;
	}	
}

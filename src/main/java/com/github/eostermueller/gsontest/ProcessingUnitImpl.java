package com.github.eostermueller.gsontest;

import java.util.Locale;

public class ProcessingUnitImpl {
	
	private Descriptor descriptor = new Descriptor();
	private String useCaseName;
	private MethodWrapper method;
	boolean selected = false;
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public void setUseCaseName(String val) {
		this.useCaseName = val;
	}
	
	public String getUseCaseName() {
		return this.useCaseName;
	}
	
	public void setMethodWrapper(MethodWrapper val) {
		this.method = val;
	}

	
	public MethodWrapper getMethodWrapper() {
		return this.method;
	}
	
	public void setDescriptor(Descriptor d) {
		descriptor = d;
		
	}
	
	public Descriptor getDescriptor() {
		return descriptor;
	}	
	public String getMessage(Locale locale) {
		return this.getDescriptor().getMessage(locale).getMessage();
	}
	public void addMessage(Locale locale, String desc) throws HavocException {
		this.getDescriptor().addMessage(locale, desc);
	}
}

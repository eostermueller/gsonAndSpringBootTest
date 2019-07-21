package com.github.eostermueller.gsontest;

import java.lang.reflect.Type;

import com.google.gson.InstanceCreator;

public class ProcessingUnitInstanceCreator implements InstanceCreator<ProcessingUnitImpl> {

	@Override
	public ProcessingUnitImpl createInstance(Type type) {
		return new ProcessingUnitImpl();
	}


}

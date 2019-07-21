package com.github.eostermueller.gsontest;

import java.lang.reflect.Type;

import com.google.gson.InstanceCreator;

public class DescriptorInstanceCreator implements InstanceCreator<Descriptor> {

	@Override
	public Descriptor createInstance(Type type) {
		Descriptor d = null;
		d = new Descriptor();
		return d;
	}


}

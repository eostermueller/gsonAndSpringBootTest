package com.github.eostermueller.gsontest;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WorkloadImpl  {
	Object verboseState;


	public void setVerboseState(Object pu) {
		this.verboseState = pu;
		
	}
	public Object getVerboseState() {
		return this.verboseState;
	}

}

package com.github.eostermueller.gsontest;

public class ApiResponse {
	private long nanoStart = 0L;
	private long nanoStop = 0L;

	public long getNanoStart() {
		return nanoStart;
	}
	public void setNanoStart(long nanoStart) {
		this.nanoStart = nanoStart;
	}
	public long getNanoStop() {
		return nanoStop;
	}
	public void setNanoStop(long nanoStop) {
		this.nanoStop = nanoStop;
	}
	public ApiResponse(long nanoTime) {
		this.nanoStart = nanoTime;
	}
	public int getMessage() {
		return message;
	}
	public void setMessage(int message) {
		this.message = message;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public int message = 0;
	public Object result = null;
}

package com.imaginnovate.exception;

public class ResourceNofoundException extends RuntimeException{

	private String resourceName;
	private String fileName;
	private Object feildValue;
	
	
	public ResourceNofoundException(String resourceName, String fileName, Object feildValue) {
		super(String.format("% not found",resourceName,fileName,feildValue ));
		this.resourceName = resourceName;
		this.fileName = fileName;
		this.feildValue = feildValue;
	}
	
	public String getResourceName() {
		return resourceName;
	}
	public String getFileName() {
		return fileName;
	}
	public Object getFeildValue() {
		return feildValue;
	}
}

package com.LMS.base.constants;

public enum BrowserTypes {
	
	CHROME("chrome"),
	FIREFOX("firefox"),
	EDGE("edge");

	BrowserTypes(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	private String type;
	
	
	

}

package com.softwerke.nrv.newspaper.util;

public enum StatusEnums {
	UNCHECKED(1), CHECKED(2), PUBLISHED(3);
	
	private int value;
	
	private StatusEnums(int value) {
		this.value = value;
	}
	
	//TODO
	public static StatusEnums byNumber(int value) {
		StatusEnums status = StatusEnums.UNCHECKED;
		if (value == 2) {
			status = StatusEnums.CHECKED;
		}
		if (value == 3) {
			status = StatusEnums.PUBLISHED;
		}
		return status;
	}
		
	public int getValue() {
        return value;
    }	
}

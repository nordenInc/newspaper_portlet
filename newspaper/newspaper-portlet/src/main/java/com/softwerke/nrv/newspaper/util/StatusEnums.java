package com.softwerke.nrv.newspaper.util;

public enum StatusEnums {
	UNCHECKED(1), CHECKED(2), PUBLISHED(3);
	
	private int value;
	
	private StatusEnums(int value) {
		this.value = value;
	}

	public static StatusEnums byNumber(int value) {
		StatusEnums status = StatusEnums.UNCHECKED;
		for (StatusEnums statusEnum:StatusEnums.values()) {
			if (statusEnum.getValue() == value) {
				status = statusEnum;
			}
		}
		return status;
	}
		
	public int getValue() {
        return value;
    }	
}

package com.softwerke.nrv.newspaper.util;

import java.util.HashMap;
import java.util.Map;

public enum StatusEnums {
	UNCHECKED(1), CHECKED(2), PUBLISHED(3);
	
	private int value;
	private static Map<Object,Object> map = new HashMap<>();
	
	private StatusEnums(int value) {
		this.value = value;
	}
	
	static {
        for (StatusEnums statusEnums : StatusEnums.values()) {
            map.put(statusEnums.value, statusEnums);
        }
    }
	
	public static StatusEnums valueOf(int statusEnums) {
        return (StatusEnums) map.get(statusEnums);
    }
	
	public int getValue() {
        return value;
    }	
}

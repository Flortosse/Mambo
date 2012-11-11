

// Generated on 11/11/2012 20:41:43
package org.mambo.protocol.client.enums;

public enum NumericalValueTypeEnum {
    NUMERICAL_VALUE_DEFAULT(0),
    NUMERICAL_VALUE_COLLECT(1),
    NUMERICAL_VALUE_CRAFT(2),
    NUMERICAL_VALUE_PADDOCK(3),
    NUMERICAL_VALUE_RED(64),
    NUMERICAL_VALUE_BLUE(65),
    NUMERICAL_VALUE_GREEN(66);
    
    private int value;
    NumericalValueTypeEnum(int value) { this.value = value; }
    public int value() { return value; }
    
    public static NumericalValueTypeEnum valueOf(int value) {
    	for (NumericalValueTypeEnum a : values()) {
    		if (a.value == value)
    			return a;
    	}
    	return null;
    }
    
}

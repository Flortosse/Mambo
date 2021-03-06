

// Generated on 05/08/2013 19:04:44
package org.mambo.protocol.enums;

public enum CrafterDirectoryParamBitEnum {
    CRAFT_OPTION_NONE(0),
    CRAFT_OPTION_NOT_FREE(1),
    CRAFT_OPTION_NOT_FREE_EXCEPT_ON_FAIL(2),
    CRAFT_OPTION_RESOURCES_REQUIRED(4);
    
    private int value;
    CrafterDirectoryParamBitEnum(int value) { this.value = value; }
    public int value() { return value; }
    
    public static CrafterDirectoryParamBitEnum valueOf(int value) {
    	for (CrafterDirectoryParamBitEnum a : values()) {
    		if (a.value == value)
    			return a;
    	}
    	return null;
    }
    
}

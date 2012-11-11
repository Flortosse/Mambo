

// Generated on 11/11/2012 18:18:42
package org.mambo.protocol.client.enums;

public enum CharacterCreationResultEnum {
    OK(0),
    ERR_NO_REASON(1),
    ERR_INVALID_NAME(2),
    ERR_NAME_ALREADY_EXISTS(3),
    ERR_TOO_MANY_CHARACTERS(4),
    ERR_NOT_ALLOWED(5),
    ERR_NEW_PLAYER_NOT_ALLOWED(6),
    ERR_RESTRICED_ZONE(7);
    
    private int value;
    CharacterCreationResultEnum(int value) { this.value = value; }
    public int value() { return value; }
    
    public static CharacterCreationResultEnum valueOf(int value) {
    	for (CharacterCreationResultEnum a : values()) {
    		if (a.value == value)
    			return a;
    	}
    	return null;
    }
    
}
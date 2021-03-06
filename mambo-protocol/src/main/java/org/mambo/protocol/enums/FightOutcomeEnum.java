

// Generated on 05/08/2013 19:04:44
package org.mambo.protocol.enums;

public enum FightOutcomeEnum {
    RESULT_LOST(0),
    RESULT_DRAW(1),
    RESULT_VICTORY(2),
    RESULT_TAX(5),
    RESULT_DEFENDER_GROUP(6);
    
    private int value;
    FightOutcomeEnum(int value) { this.value = value; }
    public int value() { return value; }
    
    public static FightOutcomeEnum valueOf(int value) {
    	for (FightOutcomeEnum a : values()) {
    		if (a.value == value)
    			return a;
    	}
    	return null;
    }
    
}

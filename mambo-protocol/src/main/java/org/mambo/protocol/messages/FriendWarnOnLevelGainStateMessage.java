

// Generated on 05/08/2013 19:37:51
package org.mambo.protocol.messages;

import java.util.*;
import org.mambo.protocol.types.*;
import org.mambo.protocol.enums.*;
import org.mambo.protocol.*;
import org.mambo.core.io.*;

public class FriendWarnOnLevelGainStateMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 6078;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public boolean enable;
    
    public FriendWarnOnLevelGainStateMessage() { }
    
    public FriendWarnOnLevelGainStateMessage(boolean enable) {
        this.enable = enable;
    }
    
    @Override
    public void serialize(Buffer buf) {
        buf.writeBoolean(enable);
    }
    
    @Override
    public void deserialize(Buffer buf) {
        enable = buf.readBoolean();
    }
    
}

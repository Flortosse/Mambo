

// Generated on 11/11/2012 19:16:57
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.protocol.client.io.*;

public class AchievementUpdateMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 6207;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public Achievement achievement;
    
    public AchievementUpdateMessage() { }
    
    public AchievementUpdateMessage(Achievement achievement) {
        this.achievement = achievement;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        achievement.serialize(writer);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        achievement = new Achievement();
        achievement.deserialize(reader);
    }
    
}
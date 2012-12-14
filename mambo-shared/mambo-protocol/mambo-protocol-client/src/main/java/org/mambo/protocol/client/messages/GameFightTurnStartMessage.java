

// Generated on 12/14/2012 18:44:06
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.core.io.*;

public class GameFightTurnStartMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 714;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public int id;
    public int waitTime;
    
    public GameFightTurnStartMessage() { }
    
    public GameFightTurnStartMessage(int id, int waitTime) {
        this.id = id;
        this.waitTime = waitTime;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        writer.writeInt(id);
        writer.writeInt(waitTime);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        id = reader.readInt();
        waitTime = reader.readInt();
        if (waitTime < 0)
            throw new RuntimeException("Forbidden value on waitTime = " + waitTime + ", it doesn't respect the following condition : waitTime < 0");
    }
    
}

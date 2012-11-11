

// Generated on 11/11/2012 19:16:58
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.protocol.client.io.*;

public class GameActionFightPointsVariationMessage extends AbstractGameActionMessage {
    public static final int MESSAGE_ID = 1030;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public int targetId;
    public short delta;
    
    public GameActionFightPointsVariationMessage() { }
    
    public GameActionFightPointsVariationMessage(short actionId, int sourceId, int targetId, short delta) {
        super(actionId, sourceId);
        this.targetId = targetId;
        this.delta = delta;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        super.serialize(writer);
        writer.writeInt(targetId);
        writer.writeShort(delta);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        super.deserialize(reader);
        targetId = reader.readInt();
        delta = reader.readShort();
    }
    
}
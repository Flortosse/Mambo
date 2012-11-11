

// Generated on 11/11/2012 19:16:58
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.protocol.client.io.*;

public class GameActionFightDispellEffectMessage extends GameActionFightDispellMessage {
    public static final int MESSAGE_ID = 6113;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public int boostUID;
    
    public GameActionFightDispellEffectMessage() { }
    
    public GameActionFightDispellEffectMessage(short actionId, int sourceId, int targetId, int boostUID) {
        super(actionId, sourceId, targetId);
        this.boostUID = boostUID;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        super.serialize(writer);
        writer.writeInt(boostUID);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        super.deserialize(reader);
        boostUID = reader.readInt();
        if (boostUID < 0)
            throw new RuntimeException("Forbidden value on boostUID = " + boostUID + ", it doesn't respect the following condition : boostUID < 0");
    }
    
}
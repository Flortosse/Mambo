

// Generated on 12/14/2012 18:44:05
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.core.io.*;

public class MoodSmileyRequestMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 6192;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public byte smileyId;
    
    public MoodSmileyRequestMessage() { }
    
    public MoodSmileyRequestMessage(byte smileyId) {
        this.smileyId = smileyId;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        writer.writeByte(smileyId);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        smileyId = reader.readByte();
    }
    
}

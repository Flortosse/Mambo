

// Generated on 11/11/2012 19:17:02
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.protocol.client.io.*;

public class EmoteListMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 5689;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public byte[] emoteIds;
    
    public EmoteListMessage() { }
    
    public EmoteListMessage(byte[] emoteIds) {
        this.emoteIds = emoteIds;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        writer.writeUnsignedShort(emoteIds.length);
        for (byte entry : emoteIds) {
            writer.writeByte(entry);
        }
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        int limit = reader.readUnsignedShort();
        emoteIds = new byte[limit];
        for (int i = 0; i < limit; i++) {
            emoteIds[i] = reader.readByte();
        }
    }
    
}
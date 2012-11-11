

// Generated on 11/11/2012 19:17:07
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.protocol.client.io.*;

public class IgnoredAddRequestMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 5673;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public String name;
    public boolean session;
    
    public IgnoredAddRequestMessage() { }
    
    public IgnoredAddRequestMessage(String name, boolean session) {
        this.name = name;
        this.session = session;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        writer.writeString(name);
        writer.writeBoolean(session);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        name = reader.readString();
        session = reader.readBoolean();
    }
    
}
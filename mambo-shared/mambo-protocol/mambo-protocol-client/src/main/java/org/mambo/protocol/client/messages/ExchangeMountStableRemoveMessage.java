

// Generated on 12/14/2012 18:44:13
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.core.io.*;

public class ExchangeMountStableRemoveMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 5964;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public double mountId;
    
    public ExchangeMountStableRemoveMessage() { }
    
    public ExchangeMountStableRemoveMessage(double mountId) {
        this.mountId = mountId;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        writer.writeDouble(mountId);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        mountId = reader.readDouble();
    }
    
}

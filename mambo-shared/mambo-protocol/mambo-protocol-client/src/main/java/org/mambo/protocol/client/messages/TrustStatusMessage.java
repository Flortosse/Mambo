

// Generated on 11/11/2012 19:17:12
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.protocol.client.io.*;

public class TrustStatusMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 6267;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public boolean trusted;
    
    public TrustStatusMessage() { }
    
    public TrustStatusMessage(boolean trusted) {
        this.trusted = trusted;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        writer.writeBoolean(trusted);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        trusted = reader.readBoolean();
    }
    
}
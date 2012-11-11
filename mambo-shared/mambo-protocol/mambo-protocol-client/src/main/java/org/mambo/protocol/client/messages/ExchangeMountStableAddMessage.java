

// Generated on 11/11/2012 19:17:09
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.protocol.client.io.*;

public class ExchangeMountStableAddMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 5971;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public MountClientData mountDescription;
    
    public ExchangeMountStableAddMessage() { }
    
    public ExchangeMountStableAddMessage(MountClientData mountDescription) {
        this.mountDescription = mountDescription;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        mountDescription.serialize(writer);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        mountDescription = new MountClientData();
        mountDescription.deserialize(reader);
    }
    
}


// Generated on 11/11/2012 19:17:06
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.protocol.client.io.*;

public class SpellForgetUIMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 5565;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public boolean open;
    
    public SpellForgetUIMessage() { }
    
    public SpellForgetUIMessage(boolean open) {
        this.open = open;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        writer.writeBoolean(open);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        open = reader.readBoolean();
    }
    
}
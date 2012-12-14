

// Generated on 12/14/2012 18:44:16
package org.mambo.protocol.client.messages;

import java.util.*;
import org.mambo.protocol.client.types.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.core.io.*;

public class GoldAddedMessage extends NetworkMessage {
    public static final int MESSAGE_ID = 6030;
    
    @Override
    public int getNetworkMessageId() {
        return MESSAGE_ID;
    }
    
    public GoldItem gold;
    
    public GoldAddedMessage() { }
    
    public GoldAddedMessage(GoldItem gold) {
        this.gold = gold;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        gold.serialize(writer);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        gold = new GoldItem();
        gold.deserialize(reader);
    }
    
}



// Generated on 11/11/2012 19:06:12
package org.mambo.protocol.client.types;

import java.util.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.protocol.client.io.*;

public class GameFightFighterNamedInformations extends GameFightFighterInformations {
    public static final short TYPE_ID = 158;
    
    @Override
    public short getTypeId() {
        return TYPE_ID;
    }
    
    public String name;
    
    public GameFightFighterNamedInformations() { }
    
    public GameFightFighterNamedInformations(int contextualId, EntityLook look, EntityDispositionInformations disposition, byte teamId, boolean alive, GameFightMinimalStats stats, String name) {
        super(contextualId, look, disposition, teamId, alive, stats);
        this.name = name;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        super.serialize(writer);
        writer.writeString(name);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        super.deserialize(reader);
        name = reader.readString();
    }
    
}
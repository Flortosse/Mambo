

// Generated on 11/11/2012 19:06:13
package org.mambo.protocol.client.types;

import java.util.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.protocol.client.io.*;

public class PartyMemberArenaInformations extends PartyMemberInformations {
    public static final short TYPE_ID = 391;
    
    @Override
    public short getTypeId() {
        return TYPE_ID;
    }
    
    public short rank;
    
    public PartyMemberArenaInformations() { }
    
    public PartyMemberArenaInformations(int id, short level, String name, EntityLook entityLook, int lifePoints, int maxLifePoints, short prospecting, short regenRate, short initiative, boolean pvpEnabled, byte alignmentSide, short rank) {
        super(id, level, name, entityLook, lifePoints, maxLifePoints, prospecting, regenRate, initiative, pvpEnabled, alignmentSide);
        this.rank = rank;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        super.serialize(writer);
        writer.writeShort(rank);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        super.deserialize(reader);
        rank = reader.readShort();
        if (rank < 0 || rank > 2300)
            throw new RuntimeException("Forbidden value on rank = " + rank + ", it doesn't respect the following condition : rank < 0 || rank > 2300");
    }
    
}
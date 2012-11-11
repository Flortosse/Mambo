

// Generated on 11/11/2012 19:06:14
package org.mambo.protocol.client.types;

import java.util.*;
import org.mambo.protocol.client.enums.*;
import org.mambo.protocol.client.*;
import org.mambo.protocol.client.io.*;

public class IgnoredOnlineInformations extends IgnoredInformations {
    public static final short TYPE_ID = 105;
    
    @Override
    public short getTypeId() {
        return TYPE_ID;
    }
    
    public String playerName;
    public byte breed;
    public boolean sex;
    
    public IgnoredOnlineInformations() { }
    
    public IgnoredOnlineInformations(int accountId, String accountName, String playerName, byte breed, boolean sex) {
        super(accountId, accountName);
        this.playerName = playerName;
        this.breed = breed;
        this.sex = sex;
    }
    
    @Override
    public void serialize(DataWriterInterface writer) {
        super.serialize(writer);
        writer.writeString(playerName);
        writer.writeByte(breed);
        writer.writeBoolean(sex);
    }
    
    @Override
    public void deserialize(DataReaderInterface reader) {
        super.deserialize(reader);
        playerName = reader.readString();
        breed = reader.readByte();
        if (breed < PlayableBreedEnum.Feca.value() || breed > PlayableBreedEnum.Zobal.value())
            throw new RuntimeException("Forbidden value on breed = " + breed + ", it doesn't respect the following condition : breed < PlayableBreedEnum.Feca.value() || breed > PlayableBreedEnum.Zobal.value()");
        sex = reader.readBoolean();
    }
    
}
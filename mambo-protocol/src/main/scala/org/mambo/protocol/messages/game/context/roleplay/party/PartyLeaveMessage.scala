




















// Generated on 05/03/2013 10:34:47
// Scala version by Blackrush
package org.mambo.protocol.messages

import org.mambo.core.io._
import org.mambo.protocol.{Message => BaseMessage, _}
import org.mambo.protocol.types._
import org.mambo.protocol.enums._

trait PartyLeaveMessage extends AbstractPartyMessage {
  override val messageId = 5594

  protected trait Message extends AbstractPartyMessage.Message with Serializable {
    override val messageId = PartyLeaveMessage.messageId


    override def serialize(buf: Buffer) {
      super.serialize(buf)

    }

  }

  override def deserialize(buf: Buffer) = {
    val partyId = buf.readInt()

    create(partyId)
  }

}

object PartyLeaveMessage extends PartyLeaveMessage {
  case class MessageImpl(partyId: Int) extends Message
  type Target = MessageImpl

  override def create(partyId: Int) = MessageImpl(partyId)

  def apply(partyId: Int) = create(partyId)
  def unapply(msg: MessageImpl) = MessageImpl.unapply(msg)
}

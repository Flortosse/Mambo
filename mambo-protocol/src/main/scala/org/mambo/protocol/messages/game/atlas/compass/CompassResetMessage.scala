




















// Generated on 05/03/2013 10:34:35
// Scala version by Blackrush
package org.mambo.protocol.messages

import org.mambo.core.io._
import org.mambo.protocol.{Message => BaseMessage, _}
import org.mambo.protocol.types._
import org.mambo.protocol.enums._

trait CompassResetMessage extends MessageDeserializer {
  val messageId = 5584

  protected trait Message extends BaseMessage with Serializable {
    val messageId = CompassResetMessage.messageId

    val theType: Byte

    def serialize(buf: Buffer) {
      buf.writeByte(theType)
    }

  }

  protected def create(theType: Byte): Target = throw new IllegalAccessException

  def deserialize(buf: Buffer) = {
    val theType = buf.readByte()

    create(theType)
  }

}

object CompassResetMessage extends CompassResetMessage {
  case class MessageImpl(theType: Byte) extends Message
  type Target = MessageImpl

  override def create(theType: Byte) = MessageImpl(theType)

  def apply(theType: Byte) = create(theType)
  def unapply(msg: MessageImpl) = MessageImpl.unapply(msg)
}

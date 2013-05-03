




















// Generated on 05/03/2013 10:34:58
// Scala version by Blackrush
package org.mambo.protocol.messages

import org.mambo.core.io._
import org.mambo.protocol.{Message => BaseMessage, _}
import org.mambo.protocol.types._
import org.mambo.protocol.enums._

trait InventoryPresetDeleteMessage extends MessageDeserializer {
  val messageId = 6169

  protected trait Message extends BaseMessage with Serializable {
    val messageId = InventoryPresetDeleteMessage.messageId

    val presetId: Byte

    def serialize(buf: Buffer) {
      buf.writeByte(presetId)
    }

  }

  protected def create(presetId: Byte): Target = throw new IllegalAccessException

  def deserialize(buf: Buffer) = {
    val presetId = buf.readByte()

    create(presetId)
  }

}

object InventoryPresetDeleteMessage extends InventoryPresetDeleteMessage {
  case class MessageImpl(presetId: Byte) extends Message
  type Target = MessageImpl

  override def create(presetId: Byte) = MessageImpl(presetId)

  def apply(presetId: Byte) = create(presetId)
  def unapply(msg: MessageImpl) = MessageImpl.unapply(msg)
}

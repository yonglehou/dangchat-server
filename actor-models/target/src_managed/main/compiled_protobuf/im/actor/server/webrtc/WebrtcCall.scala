// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package im.actor.server.webrtc


import im.actor.server.model.ModelTypeMappers._

@SerialVersionUID(0L)
final case class WebrtcCall(
    id: Long = 0L,
    initiatorUserId: Int = 0,
    receiverUserId: Int = 0
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[WebrtcCall] with com.trueaccord.lenses.Updatable[WebrtcCall] {
    @transient
    lazy val serializedSize: Int = {
      var __size = 0
      if (id != 0L) { __size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, id) }
      if (initiatorUserId != 0) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, initiatorUserId) }
      if (receiverUserId != 0) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, receiverUserId) }
      __size
    }
    def writeTo(output: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = id
        if (__v != 0L) {
          output.writeInt64(1, __v)
        }
      };
      {
        val __v = initiatorUserId
        if (__v != 0) {
          output.writeInt32(2, __v)
        }
      };
      {
        val __v = receiverUserId
        if (__v != 0) {
          output.writeInt32(3, __v)
        }
      };
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): im.actor.server.webrtc.WebrtcCall = {
      var __id = this.id
      var __initiatorUserId = this.initiatorUserId
      var __receiverUserId = this.receiverUserId
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __id = __input.readInt64()
          case 16 =>
            __initiatorUserId = __input.readInt32()
          case 24 =>
            __receiverUserId = __input.readInt32()
          case tag => __input.skipField(tag)
        }
      }
      im.actor.server.webrtc.WebrtcCall(
          id = __id,
          initiatorUserId = __initiatorUserId,
          receiverUserId = __receiverUserId
      )
    }
    def withId(__v: Long): WebrtcCall = copy(id = __v)
    def withInitiatorUserId(__v: Int): WebrtcCall = copy(initiatorUserId = __v)
    def withReceiverUserId(__v: Int): WebrtcCall = copy(receiverUserId = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = id
          if (__t != 0L) __t else null
        }
        case 2 => {
          val __t = initiatorUserId
          if (__t != 0) __t else null
        }
        case 3 => {
          val __t = receiverUserId
          if (__t != 0) __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = im.actor.server.webrtc.WebrtcCall
}

object WebrtcCall extends com.trueaccord.scalapb.GeneratedMessageCompanion[WebrtcCall]  {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[WebrtcCall]  = this
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): im.actor.server.webrtc.WebrtcCall = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    im.actor.server.webrtc.WebrtcCall(
      __fieldsMap.getOrElse(__fields.get(0), 0L).asInstanceOf[Long],
      __fieldsMap.getOrElse(__fields.get(1), 0).asInstanceOf[Int],
      __fieldsMap.getOrElse(__fields.get(2), 0).asInstanceOf[Int]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = ModelWebrtcProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = im.actor.server.webrtc.WebrtcCall(
  )
  implicit class WebrtcCallLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, WebrtcCall]) extends com.trueaccord.lenses.ObjectLens[UpperPB, WebrtcCall](_l) {
    def id: com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.id)((c_, f_) => c_.copy(id = f_))
    def initiatorUserId: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.initiatorUserId)((c_, f_) => c_.copy(initiatorUserId = f_))
    def receiverUserId: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.receiverUserId)((c_, f_) => c_.copy(receiverUserId = f_))
  }
  final val ID_FIELD_NUMBER = 1
  final val INITIATOR_USER_ID_FIELD_NUMBER = 2
  final val RECEIVER_USER_ID_FIELD_NUMBER = 3
}
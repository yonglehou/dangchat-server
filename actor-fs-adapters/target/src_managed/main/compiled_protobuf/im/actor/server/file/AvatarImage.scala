// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package im.actor.server.file



@SerialVersionUID(0L)
final case class AvatarImage(
    fileLocation: im.actor.server.file.FileLocation = im.actor.server.file.FileLocation.defaultInstance,
    width: Int = 0,
    height: Int = 0,
    fileSize: Long = 0L
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[AvatarImage] with com.trueaccord.lenses.Updatable[AvatarImage] {
    @transient
    lazy val serializedSize: Int = {
      var __size = 0
      __size += 1 + com.google.protobuf.CodedOutputStream.computeRawVarint32Size(fileLocation.serializedSize) + fileLocation.serializedSize
      __size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, width)
      __size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, height)
      __size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, fileSize)
      __size
    }
    def writeTo(output: com.google.protobuf.CodedOutputStream): Unit = {
      output.writeTag(1, 2)
      output.writeRawVarint32(fileLocation.serializedSize)
      fileLocation.writeTo(output)
      output.writeInt32(2, width)
      output.writeInt32(3, height)
      output.writeInt64(4, fileSize)
    }
    def mergeFrom(__input: com.google.protobuf.CodedInputStream): im.actor.server.file.AvatarImage = {
      var __fileLocation = this.fileLocation
      var __width = this.width
      var __height = this.height
      var __fileSize = this.fileSize
      var _done__ = false
      while (!_done__) {
        val _tag__ = __input.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __fileLocation = com.trueaccord.scalapb.LiteParser.readMessage(__input, __fileLocation)
          case 16 =>
            __width = __input.readInt32()
          case 24 =>
            __height = __input.readInt32()
          case 32 =>
            __fileSize = __input.readInt64()
          case tag => __input.skipField(tag)
        }
      }
      im.actor.server.file.AvatarImage(
          fileLocation = __fileLocation,
          width = __width,
          height = __height,
          fileSize = __fileSize
      )
    }
    def withFileLocation(__v: im.actor.server.file.FileLocation): AvatarImage = copy(fileLocation = __v)
    def withWidth(__v: Int): AvatarImage = copy(width = __v)
    def withHeight(__v: Int): AvatarImage = copy(height = __v)
    def withFileSize(__v: Long): AvatarImage = copy(fileSize = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => fileLocation
        case 2 => width
        case 3 => height
        case 4 => fileSize
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = im.actor.server.file.AvatarImage
}

object AvatarImage extends com.trueaccord.scalapb.GeneratedMessageCompanion[AvatarImage]  {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[AvatarImage]  = this
  def fromFieldsMap(__fieldsMap: Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): im.actor.server.file.AvatarImage = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    im.actor.server.file.AvatarImage(
      __fieldsMap(__fields.get(0)).asInstanceOf[im.actor.server.file.FileLocation],
      __fieldsMap(__fields.get(1)).asInstanceOf[Int],
      __fieldsMap(__fields.get(2)).asInstanceOf[Int],
      __fieldsMap(__fields.get(3)).asInstanceOf[Long]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = FileProto.descriptor.getMessageTypes.get(1)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 1 => __out = im.actor.server.file.FileLocation
    }
  __out
  }
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = im.actor.server.file.AvatarImage(
    fileLocation = im.actor.server.file.FileLocation.defaultInstance,
    width = 0,
    height = 0,
    fileSize = 0L
  )
  implicit class AvatarImageLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, AvatarImage]) extends com.trueaccord.lenses.ObjectLens[UpperPB, AvatarImage](_l) {
    def fileLocation: com.trueaccord.lenses.Lens[UpperPB, im.actor.server.file.FileLocation] = field(_.fileLocation)((c_, f_) => c_.copy(fileLocation = f_))
    def width: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.width)((c_, f_) => c_.copy(width = f_))
    def height: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.height)((c_, f_) => c_.copy(height = f_))
    def fileSize: com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.fileSize)((c_, f_) => c_.copy(fileSize = f_))
  }
  final val FILE_LOCATION_FIELD_NUMBER = 1
  final val WIDTH_FIELD_NUMBER = 2
  final val HEIGHT_FIELD_NUMBER = 3
  final val FILE_SIZE_FIELD_NUMBER = 4
}
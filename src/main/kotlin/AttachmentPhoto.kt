class AttachmentPhoto(variable : Photo) : Attachment {
    override val type: String = "Photo"
    val photo = variable
    override fun toString(): String {
        return "AttachmentPhoto(type='$type', photo=$photo)"
    }
}
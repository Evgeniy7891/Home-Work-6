class AttachmentAlbum(variable: Album) : Attachment {
    override val type: String = "Album"
    val album = variable
    override fun toString(): String {
        return "AttachmentAlbum(type='$type', album=$album)"
    }
}
class AttachmentVideo(variable : Video) : Attachment {
    override val type: String = "Video"
    val video = variable
    override fun toString(): String {
        return "AttachmentVideo(type='$type', video=$video)"
    }
}
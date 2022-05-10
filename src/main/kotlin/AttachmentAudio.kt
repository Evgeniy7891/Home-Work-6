class AttachmentAudio (variable: Audio) : Attachment {
    override val type = "Audio"
    val audio = variable
    override fun toString(): String {
        return "AttachmentAudio(type='$type', audio=$audio)"
    }
}
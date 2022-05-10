class AttachmentPage(variable: Page) : Attachment {
    override val type: String = "Page"
    val page = variable
    override fun toString(): String {
        return "AttachmentPage(type='$type', page=$page)"
    }
}
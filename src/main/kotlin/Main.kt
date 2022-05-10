fun main(args: Array<String>) {
    val admin = ServiceVK()
        // создание обектов типа Attachment c полем type и со вторым вложенными, которое определилось на базе первого поля type
    val user1: Attachment = AttachmentAudio(Audio(1, 1, 1, 1, "Cool"))
    val user2: Attachment = AttachmentAlbum(Album(2, 2, 2, 2, "Good"))
    val user3: Attachment = AttachmentPage(Page(3, 3, 3, 3, "Nice"))
    val user4: Attachment = AttachmentPhoto(Photo(4, 4, 4, 4, "Normal"))
    val user5: Attachment = AttachmentVideo(Video(5, 5, 5, 5, "Great"))

    admin.add(user1)
    admin.add(user2)
    admin.add(user3)
    admin.add(user4)
    admin.add(user5)

    println(admin.sizeAr())
    admin.print()
    admin.select(user4)
    admin.select(user1)

}

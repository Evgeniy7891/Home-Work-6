class ServiceVK {
    // создаем массив типа Attachment
    var arrayAttachment = emptyArray<Attachment>()
    // функция добавления элементов в массив
    fun add (name: Attachment): Attachment {
        arrayAttachment += name
        return arrayAttachment.last()
    }

    fun sizeAr(): Int {
        return arrayAttachment.size
    }

    fun print(){
        for (pool in arrayAttachment) {
            print(pool)
        }
    }
    //  пример Smart cast
    fun select (name: Attachment){
        if (name is AttachmentAudio) {
            println("Yes")
    }
        val audio = name.type
        println("$audio")
    }
}

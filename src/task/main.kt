package task

fun main(args: Array<String>) {
    val pubLibrary= PublicLibrary()

    pubLibrary.addBook(Book("Amar Ace Jol", "Humayun Ahmed", 1996))
    pubLibrary.addBook(Book("Kew Kew Kotha Rakhe", "Najim Uddin", 2002))
    pubLibrary.addBook(Book("Kew Kothao Nei", "Humayun Ahmed", 1998))

    println("**********************  All Books  ***********************")
    pubLibrary.viewAllBooks()

    println("******************** Find Books By Author *******************")
    pubLibrary.findBookByAuthor("Humayun Ahmed")
}
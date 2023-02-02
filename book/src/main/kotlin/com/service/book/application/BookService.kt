package com.service.book.application

import org.springframework.stereotype.Service

@Service
class BookService {

    fun listBooks(): List<Book> {
        return mutableListOf(
            Book("1","The shining", "", "1"),
            Book("2","IT", "", "1"),
            Book("3","Harry Potter and the Goblet of Fire", "", "2"),
            Book("4","Fantastic Beasts and Where to Find Them", "", "2"),
            Book("5","The Hobbit", "", "3"),
            Book("6","The Lord of the Rings", "", "3"),
            Book("7","Beowulf", "", "3"),
            Book("8","Murder on the Orient Express", "", "4"),
            Book("9","Death on the Nile", "", "4"),
            Book("10","And Then There Were None", "", "4"),
            Book("11","The A.B.C. Murders", "", "4")
        );
    }
    fun listBookByAuthor(author: String) : List<Book>? {
        return this.listBooks().filter { it.authorId == author }
    }

    fun getBookById(id: String): Book? {
        return this.listBooks().find { it.id == id }
    }

}
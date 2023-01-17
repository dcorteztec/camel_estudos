package com.service.book.application

import org.springframework.stereotype.Service

@Service
class BookService {

    fun listBooks(): List<Book> {
        return mutableListOf(
            Book("The shining", "", "1"),
            Book("IT", "", "1"),
            Book("Harry Potter and the Goblet of Fire", "", "2"),
            Book("Fantastic Beasts and Where to Find Them", "", "2"),
            Book("The Hobbit", "", "3"),
            Book("The Lord of the Rings", "", "3"),
            Book("Beowulf", "", "3"),
            Book("Murder on the Orient Express", "", "4"),
            Book("Death on the Nile", "", "4"),
            Book("And Then There Were None", "", "4"),
            Book("The A.B.C. Murders", "", "4")
        );
    }
    fun listBookByAuthor(author: String) : List<Book>? {
        return this.listBooks().filter { it.authorId == author }
    }

}
package com.service.book.application

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/books")
class BookController(
    private val service: BookService
    ) {


    @GetMapping("")
    fun listBooks():List<Book>{
        return service.listBooks()
    }

    @GetMapping("/{id}")
    fun getBookById(@PathVariable id: String): Book? {
        return service.getBookById(id)
    }

    @GetMapping("/author/{author}")
    fun listBooksByAuthor(@PathVariable author: String): List<Book>? {
        return service.listBookByAuthor(author)
    }


}
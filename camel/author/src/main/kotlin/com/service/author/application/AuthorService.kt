package com.service.author.application

import org.springframework.stereotype.Service

@Service
class AuthorService {

    fun listAuthors(): List<Author> {
        return mutableListOf(
             Author("1", "stephen-king", "Stephen King"),
             Author("2", "jk-rowling", "J. K. Rowling"),
             Author("3", "jr-tolkien", "J. R. Tolkien"),
             Author("4", "agatha-christie", "Agatha Christie"),
             Author("5", "jane-austin", "Jane Austin")
        );
    }

    fun getAuthorByName(name: String) : Author? {
        return this.listAuthors().firstOrNull() { it.name == name }
    }

    fun getAuthorById(id: String) : Author? {
        return this.listAuthors().firstOrNull() { it.id == id }
    }
}
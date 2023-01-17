package com.service.author.application

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/authors")
class AuthorController(
    private val service: AuthorService
) {

    @GetMapping("")
    fun listAuthors():List<Author>{
        return service.listAuthors()
    }

    @GetMapping("/{name}")
    fun byName(@PathVariable name: String): Author? {
        return service.getAuthorByName(name)
    }

    fun byId(@PathVariable id: String): Author? {
        return service.getAuthorById(id)
    }
}
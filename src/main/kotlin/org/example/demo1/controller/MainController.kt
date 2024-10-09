package org.example.demo1.controller

import org.example.demo1.entity.Person
import org.example.demo1.repository.PersonRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController (
    val personRepository: PersonRepository
){
    @GetMapping("/all")
    fun getAll(): ResponseEntity<List<Person>> {
        return ResponseEntity.ok(personRepository.findAll())
    }

    @PostMapping("/add")
    fun add(@RequestBody name: String): ResponseEntity<Person> {
        return ResponseEntity.ok(personRepository.save(Person().apply { this.name = name }))
    }
}
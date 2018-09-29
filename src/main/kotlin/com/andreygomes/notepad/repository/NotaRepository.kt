package com.andreygomes.notepad.repository

import com.andreygomes.notepad.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository : MongoRepository<Nota, String> {

    fun findByTituloContainingIgonoreCase(titulo: String): List<Nota>

}
package com.andreygomes.notepad.service

import com.andreygomes.notepad.model.Nota
import com.andreygomes.notepad.repository.NotaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NotaService {
    @Autowired
    lateinit var notaRepository: NotaRepository

    fun salvar(nota: Nota): Nota {
        return notaRepository.save(nota)
    }

    fun buscarTodos() : List<Nota> {
        return notaRepository.findAll()
    }

    fun apagar(id: String) {
        notaRepository.deleteById(id)
    }

    fun buscarPorTitulo(titulo: String): List<Nota> {
        return notaRepository.findByTituloContainingIgonoreCase(titulo)
    }

}
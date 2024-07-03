// src/main/java/com/exemplo/controller/EntidadeController.java
package com.exemplo.controller;

import com.exemplo.model.Entidade;
import com.exemplo.repository.EntidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entidades")
public class EntidadeController {

    @Autowired
    private EntidadeRepository entidadeRepository;

    @GetMapping
    public List<Entidade> getAllEntidades() {
        return entidadeRepository.findAll();
    }

    @PostMapping
    public Entidade createEntidade(@RequestBody Entidade entidade) {
        return entidadeRepository.save(entidade);
    }

    // Outros endpoints, como update, delete, etc.
}

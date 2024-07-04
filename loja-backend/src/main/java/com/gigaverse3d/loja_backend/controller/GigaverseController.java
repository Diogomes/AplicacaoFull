package com.gigaverse3d.loja_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GigaverseController {

    @GetMapping("/Gigaverse")
    public java.lang.String showGigaversePage() {
        // Lógica para mostrar a página Gigaverse
        return "gigaversePage"; // Nome da página ou conteúdo a ser retornado
    }
}

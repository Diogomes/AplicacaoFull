package com.gigaverse3d.lojabackend.controller;

import com.gigaverse3d.lojabackend.model.Produto;
import com.gigaverse3d.lojabackend.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produto getProdutoById(@PathVariable Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @PutMapping("/{id}")
    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produtoDetails) {
        Produto produto = produtoRepository.findById(id).orElse(null);

        if (produto != null) {
            produto.setNome(produtoDetails.getNome());
            produto.setTipo(produtoDetails.getTipo());
            produto.setPreco(produtoDetails.getPreco());
            produto.setDescricao(produtoDetails.getDescricao());
            produto.setImagens(produtoDetails.getImagens());
            return produtoRepository.save(produto);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }
}

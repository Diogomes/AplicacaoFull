package com.gigaverse3d.lojabackend.repository;

import com.gigaverse3d.lojabackend.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // métodos personalizados de consulta, se necessário
}

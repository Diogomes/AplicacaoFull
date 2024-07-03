// src/main/java/com/exemplo/repository/EntidadeRepository.java
package com.exemplo.repository;

import com.exemplo.model.Entidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadeRepository extends JpaRepository<Entidade, Long> {
}

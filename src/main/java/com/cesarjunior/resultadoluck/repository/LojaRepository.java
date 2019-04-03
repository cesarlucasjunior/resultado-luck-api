package com.cesarjunior.resultadoluck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesarjunior.resultadoluck.domain.Loja;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Integer> {

}

package com.cesarjunior.resultadoluck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesarjunior.resultadoluck.domain.Funcionaria;

@Repository
public interface FuncionariaRepository extends JpaRepository<Funcionaria, Integer> {

}

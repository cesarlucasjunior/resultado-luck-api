package com.cesarjunior.resultadoluck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesarjunior.resultadoluck.domain.ResultadoObtido;

@Repository
public interface ResultadoObtidoRepository extends JpaRepository<ResultadoObtido, Integer>{

}

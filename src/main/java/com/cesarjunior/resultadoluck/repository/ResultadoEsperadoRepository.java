package com.cesarjunior.resultadoluck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cesarjunior.resultadoluck.domain.ResultadoEsperado;

@Repository
public interface ResultadoEsperadoRepository extends JpaRepository<ResultadoEsperado, Integer>{

}

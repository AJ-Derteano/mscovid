package com.aneyra.mscovid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aneyra.mscovid.model.PositivosCovid;

public interface PositivosCovidRepository extends JpaRepository<PositivosCovid, Long> {

}
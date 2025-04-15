package com.aneyra.mscovid.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.aneyra.mscovid.dtos.PositivosCovidRequest;
import com.aneyra.mscovid.model.PositivosCovid;
import com.aneyra.mscovid.repositories.PositivosCovidRepository;

@Service
public class PositivosCovidService {

  private final PositivosCovidRepository repository;

  public PositivosCovidService(PositivosCovidRepository repository) {
    this.repository = repository;
  }

  public Optional<PositivosCovid> savePositivoCovid(PositivosCovidRequest positivoCovid) {

    PositivosCovid positivo = new PositivosCovid();
    positivo.setIdPersona(positivoCovid.getIdPersona());
    positivo.setFechaCorte(positivoCovid.getFechaCorte());
    positivo.setFechaResultado(positivoCovid.getFechaResultado());
    positivo.setDepartamento(positivoCovid.getDepartamento());
    positivo.setProvincia(positivoCovid.getProvincia());
    positivo.setDistrito(positivoCovid.getDistrito());
    positivo.setMetododx(positivoCovid.getMetododx());
    positivo.setEdad(positivoCovid.getEdad());
    positivo.setSexo(positivoCovid.getSexo());
    positivo.setUbigeo(positivoCovid.getUbigeo());

    repository.save(positivo);

    return Optional.of(positivo);
  }

  public Page<PositivosCovid> getAllPositivos(Pageable pageable) {
    return repository.findAll(pageable);
  }

  public Optional<PositivosCovid> getPositivoById(Long id) {
    return repository.findById(id);
  }

}

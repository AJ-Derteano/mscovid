package com.aneyra.mscovid.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aneyra.mscovid.dtos.PositivosCovidRequest;
import com.aneyra.mscovid.model.PositivosCovid;
import com.aneyra.mscovid.services.PositivosCovidService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/positivo-covid")
public class PositivoCovidController {
  private final PositivosCovidService service;

  public PositivoCovidController(PositivosCovidService service) {
    this.service = service;
  }

  @GetMapping
  public Page<PositivosCovid> getAll(Pageable pageable) {
    return service.getAllPositivos(pageable);
  }

  @GetMapping("/{id}")
  public ResponseEntity<PositivosCovid> getById(@PathVariable Long id) {
    return service.getPositivoById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  public ResponseEntity<PositivosCovid> create(@RequestBody PositivosCovidRequest entity) {
    PositivosCovid created = service.savePositivoCovid(entity).orElse(null);
    if (created != null) {
      return ResponseEntity.ok(created);
    } else {
      return ResponseEntity.badRequest().build();
    }

  }

}

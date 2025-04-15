package com.aneyra.mscovid.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PositivosCovidRequest {
  private String departamento;
  private String provincia;
  private String distrito;
  private String metododx;
  private String edad;
  private String sexo;
  private Date fechaResultado;
  private String ubigeo;
  private Long idPersona;
  private Date fechaCorte;
}

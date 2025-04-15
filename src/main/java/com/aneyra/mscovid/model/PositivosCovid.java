package com.aneyra.mscovid.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "positivos_covid")
public class PositivosCovid {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "fecha_corte")
  private Date fechaCorte;

  private String departamento;

  private String provincia;

  private String distrito;

  private String metododx;

  private String edad;

  private String sexo;

  @Column(name = "fecha_resultado")
  private Date fechaResultado;

  private String ubigeo;

  @Column(name = "id_persona")
  private Long idPersona;
}

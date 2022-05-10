package com.launchacademy.disneyfilms.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="characters")
@Getter
@Setter
@NoArgsConstructor
public class Character {
  @Id
  @SequenceGenerator(name="character_generator", sequenceName="characters_id_seq", allocationSize = 1)
  @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="character_generator")
  @Column(name="id", nullable=false, unique=true)
  private Long id;

  @NotBlank
  @Size(max=20)
  @Column(name = "name")
  private String name;

  @NotNull
  @Column(name = "princess")
  private boolean princess;

}

package com.launchacademy.disneyfilms.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="films")
@Getter
@Setter
@NoArgsConstructor
public class Film {
  @Id
  @SequenceGenerator(name="films_generator", sequenceName="films_id_seq", allocationSize = 1)
  @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="films_generator")
  @Column(name="id", nullable=false, unique=true)
  private Long id;

  @Column(name="title")
  @NotBlank
  private String title;

  @Column(name="type")
  private String type;

  @OneToMany(mappedBy = "film")
  @JsonIgnoreProperties("film")
  private List<Character> characters;

}

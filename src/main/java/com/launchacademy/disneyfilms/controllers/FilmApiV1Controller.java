package com.launchacademy.disneyfilms.controllers;

import com.launchacademy.disneyfilms.models.Film;
import com.launchacademy.disneyfilms.services.FilmService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/films")
public class FilmApiV1Controller {

  private FilmService filmService;

  @Autowired
  public FilmApiV1Controller(FilmService filmService) {
    this.filmService = filmService;
  }

//  @GetMapping
//  public List<Film> getIndex() {
//    return filmService.findAll();
//  }

  @GetMapping
  public Map<String, List<Film>> getIndex() {
    Map<String, List<Film>> mapData = new HashMap<>();
    mapData.put("films", filmService.findAll());
    return mapData;
  }

  @GetMapping("/{id}")
  public Map<String, Film> getShow(@PathVariable Long id) {
    Map<String, Film> mapData = new HashMap<>();
    Optional<Film> result = filmService.findById(id);

    if(result.isPresent()){
      mapData.put("film", result.get());
    }

    return mapData;
  }
}

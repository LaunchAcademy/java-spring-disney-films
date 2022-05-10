package com.launchacademy.disneyfilms.services;

import com.launchacademy.disneyfilms.models.Film;
import java.util.List;
import java.util.Optional;

public interface FilmService {
  List<Film> findAll();
  Optional<Film> findById(Long id);
  void save(Film film);
  List<Film> getByTitle(String title);
  Long count();
}

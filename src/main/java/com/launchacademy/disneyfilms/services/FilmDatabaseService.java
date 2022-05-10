package com.launchacademy.disneyfilms.services;

import com.launchacademy.disneyfilms.models.Film;
import com.launchacademy.disneyfilms.repositories.FilmRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmDatabaseService implements FilmService{

  private FilmRepository repository;

  @Autowired
  public FilmDatabaseService(FilmRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Film> findAll() {
    return (List<Film>)repository.findAll();
  }

  @Override
  public Optional<Film> findById(Long id) {
    return repository.findById(id);
  }

  @Override
  public void save(Film film) {
    repository.save(film);
  }

  @Override
  public List<Film> getByTitle(String title) {
    return repository.getByTitle(title);
  }

  @Override
  public Long count() {
    return repository.count();
  }
}

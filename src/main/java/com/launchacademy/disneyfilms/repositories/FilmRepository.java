package com.launchacademy.disneyfilms.repositories;

import com.launchacademy.disneyfilms.models.Film;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
  List<Film> getByTitle(String title);
}

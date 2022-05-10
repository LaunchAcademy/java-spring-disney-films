package com.launchacademy.disneyfilms.seeders;

import com.launchacademy.disneyfilms.models.Film;
import com.launchacademy.disneyfilms.services.FilmService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FilmsSeeder {
  private FilmService filmService;

  @Autowired
  public void FilmsSeeder(FilmService filmService) {
    this.filmService = filmService;
  }

  public void seed() {
    List<Film> filmsList = new ArrayList();
    List<Character> characterList = new ArrayList();

    Film filmOne = new Film();
    filmOne.setTitle("Moana");
    filmOne.setType("Animation");
    filmsList.add(filmOne);

    Film filmTwo = new Film();
    filmTwo.setTitle("Atlantis");
    filmTwo.setType("Animation");
    filmsList.add(filmTwo);

    Film filmThree = new Film();
    filmThree.setTitle("Beauty and the Beast (2017)");
    filmThree.setType("Live Action");
    filmsList.add(filmThree);

    Film filmFour = new Film();
    filmFour.setTitle("Aladdin");
    filmFour.setType("Animation");
    filmsList.add(filmFour);

    Film filmFive = new Film();
    filmFive.setTitle("Frozen");
    filmFive.setType("Animation");
    filmsList.add(filmFive);

    Film filmSix = new Film();
    filmSix.setTitle("Launch Academy");
    filmSix.setType("Reality");
    filmsList.add(filmSix);

    if (filmService.count() == 0) {
      for (Film name : filmsList) {
        filmService.save(name);
      }
    }
  }
}

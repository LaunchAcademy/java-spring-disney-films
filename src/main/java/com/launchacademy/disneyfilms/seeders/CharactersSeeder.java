package com.launchacademy.disneyfilms.seeders;

import com.launchacademy.disneyfilms.models.Character;
import com.launchacademy.disneyfilms.models.Film;
import com.launchacademy.disneyfilms.services.CharacterService;
import com.launchacademy.disneyfilms.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CharactersSeeder {
  private FilmService filmService;
  private CharacterService characterService;

  @Autowired
  public void CharactersSeeder(FilmService filmService, CharacterService characterService) {
    this.filmService = filmService;
    this.characterService = characterService;
  }

  public void seed() {
    Film moana = filmService.getByTitle("Moana").get(0);
    Film atlantis = filmService.getByTitle("Atlantis").get(0);

    if (characterService.count() == 0) {
      Character characterOne = new Character();
      characterOne.setName("Moana");
      characterOne.setPrincess(true);
      characterOne.setFilm(moana);

      Character characterTwo = new Character();
      characterTwo.setName("Maui");
      characterTwo.setPrincess(false);
      characterTwo.setFilm(moana);

      Character characterThree = new Character();
      characterThree.setName("Milo");
      characterThree.setPrincess(false);
      characterThree.setFilm(atlantis);

      characterService.save(characterOne);
      characterService.save(characterTwo);
      characterService.save(characterThree);
    }
  }
}
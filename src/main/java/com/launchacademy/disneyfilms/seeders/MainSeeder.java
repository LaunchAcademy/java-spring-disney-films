package com.launchacademy.disneyfilms.seeders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainSeeder implements CommandLineRunner {

  CharactersSeeder charactersSeeder;
  FilmsSeeder filmsSeeder;

  public MainSeeder(CharactersSeeder charactersSeeder, FilmsSeeder filmsSeeder) {
    this.charactersSeeder = charactersSeeder;
    this.filmsSeeder = filmsSeeder;
  }

  @Override
  public void run(String... args) throws Exception {
    filmsSeeder.seed();
    charactersSeeder.seed();
  }
}

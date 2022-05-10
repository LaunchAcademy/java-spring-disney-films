package com.launchacademy.disneyfilms.services;

import com.launchacademy.disneyfilms.models.Character;
import com.launchacademy.disneyfilms.repositories.CharacterRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterDatabaseService implements CharacterService{

  private CharacterRepository repository;

  @Autowired
  public CharacterDatabaseService(
      CharacterRepository repository) {
    this.repository = repository;
  }


  @Override
  public List<Character> findAll() {
    return (List<Character>)repository.findAll();
  }

  @Override
  public void save(Character character) {
    repository.save(character);
  }

  @Override
  public Long count() {
    return repository.count();
  }
}

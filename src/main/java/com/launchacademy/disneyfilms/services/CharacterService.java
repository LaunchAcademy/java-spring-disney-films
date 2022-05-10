package com.launchacademy.disneyfilms.services;

import com.launchacademy.disneyfilms.models.Character;
import java.util.List;

public interface CharacterService {
  List<Character> findAll();
  void save(Character character);
  Long count();
}

package com.launchacademy.disneyfilms.repositories;

import com.launchacademy.disneyfilms.models.Character;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends CrudRepository<Character, Long> {

}

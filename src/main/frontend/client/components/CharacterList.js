import React from "react"

import CharacterTile from "./CharacterTile"

const CharacterList = ({ characters, title }) => {
  const characterTiles = characters?.map((character) => {
    return <CharacterTile key={character.id} character={character} />
  })
  return (
    <div>
      <h3>{title} Characters</h3>
      <ul>{characterTiles}</ul>
    </div>
  )
}

export default CharacterList

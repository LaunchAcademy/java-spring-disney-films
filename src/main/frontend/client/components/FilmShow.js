import React, { useEffect, useState } from "react"
import { useLocation } from "react-router-dom"

import CharacterList from "./CharacterList"

const FilmShow = (props) => {
  let currentWebLocation = useLocation()
  const [film, setFilm] = useState({})
  const [errors, setErrors] = useState({})
  const filmId = props.match.params.id

  const fetchFilm = async () => {
    try {
      const response = await fetch(`/api/v1/films/${filmId}`)
      if (!response.ok) {
        const errorMessage = `${response.status} (${response.statusText})`
        const error = new Error(errorMessage)
        throw error
      }
      const responseBody = await response.json()
      setFilm(responseBody.film)
    } catch (err) {
      console.error(`Error in fetch: ${err.message}`)
    }
  }

  useEffect(() => {
    fetchFilm()
  }, [currentWebLocation.pathname])

  return (
    <div>
      <CharacterList characters={film.characters} title={film.title} />
    </div>
  )
}

export default FilmShow

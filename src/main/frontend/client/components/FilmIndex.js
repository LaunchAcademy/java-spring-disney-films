import React, { useEffect, useState } from "react"

import FilmTile from "./FilmTile"

const FilmIndex = (props) => {
  const [films, setFilms] = useState([])

  const fetchFilms = async () => {
    try {
      const response = await fetch("/api/v1/films")
      if (!response.ok) {
        const errorMessage = `${response.status} (${response.statusText})`
        const error = new Error(errorMessage)
        throw error
      }
      const responseBody = await response.json()
      setFilms(responseBody.films)
    } catch (err) {
      console.error(`Error in fetch: ${err.message}`)
    }
  }

  useEffect(() => {
    fetchFilms()
  }, [])

  const filmTiles = films.map((film) => {
    return <FilmTile key={film.id} film={film} />
  })

  return (
    <div>
      <h1>Disney Films</h1>
      {filmTiles}
    </div>
  )
}

export default FilmIndex

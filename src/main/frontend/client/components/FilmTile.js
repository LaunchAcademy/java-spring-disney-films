import React from "react"
import { Link } from "react-router-dom"

const FilmTile = ({ film: { id, title } }) => {
  return (
    <div>
      <Link to={`/films/${id}`}>
        <h2>{title}</h2>
      </Link>
    </div>
  )
}

export default FilmTile

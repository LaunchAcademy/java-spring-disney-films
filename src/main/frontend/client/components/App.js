import React, { useEffect } from "react"
import { hot } from "react-hot-loader/root"
import "foundation-sites"
import $ from "jquery"
import "../assets/scss/main.scss"

import { Route, BrowserRouter, Switch, Redirect } from "react-router-dom"

import FilmIndex from "./FilmIndex"
import FilmShow from "./FilmShow"

const App = (props) => {
  useEffect(() => {
    $(document).foundation()
  }, [])

  return (
    <BrowserRouter>
      <Switch>
        <Route exact path="/">
          <Redirect to="/films" />
        </Route>
        <Route exact path="/films" component={FilmIndex} />
        <Route exact path="/films/:id" component={FilmShow} />
      </Switch>
    </BrowserRouter>
  )
}

export default hot(App)

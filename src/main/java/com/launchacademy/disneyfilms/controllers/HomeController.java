package com.launchacademy.disneyfilms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping(value = {"/films", "/films/{id}"})
  public String forward() {
    return "forward:/";
  }
}

package org.launchcode.EnumerablePlanets.controllers;

import org.launchcode.EnumerablePlanets.data.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanetController {
    @GetMapping
    public String displayIndex(Model model) {
        model.addAttribute("planets", Planets.values());
        return "index";
    }
}

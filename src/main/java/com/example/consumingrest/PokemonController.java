package com.example.consumingrest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping(PokemonController.POKEMON)
public class PokemonController {
    public static  final  String POKEMON = "/pokemon";

    @Autowired
    Service service;

    @GetMapping
    public String getPokemonQuote(Model model){
        ArrayList <PokemonQuote> pokemons = service.getPokemonQuote();
        model.addAttribute("pokemon", pokemons);

        return  "pokemon";
    }
}

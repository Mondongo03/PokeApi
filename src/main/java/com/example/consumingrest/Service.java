package com.example.consumingrest;

import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@org.springframework.stereotype.Service
public class Service {

 RestTemplate restTemplate = new RestTemplate();

    ArrayList<PokemonQuote> quotesPok = new ArrayList<PokemonQuote>();

    ArrayList<MoveQuote> quotes2Mov = new ArrayList<MoveQuote>();
 public ArrayList<PokemonQuote> getPokemonQuote(){
     //807 pokemons dispo
     PokemonQuote quote = null;
     quote = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/1", PokemonQuote.class);
     for (int i = 1; i <= 807; i++) {
         quote = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/" + i, PokemonQuote.class);
         quotesPok.add(quote);
     }
 return quotesPok;
 }

    public ArrayList<MoveQuote> getMoveQuote(){
        //807 pokemons dispo
        MoveQuote quote2 = null;
        quote2 = restTemplate.getForObject("https://pokeapi.co/api/v2/move/1", MoveQuote.class);
        for (int i = 1; i <= 100; i++) {
            quote2 = restTemplate.getForObject("https://pokeapi.co/api/v2/move/" + i, MoveQuote.class);
            quotes2Mov.add(quote2);
        }
        return quotes2Mov;
    }
}

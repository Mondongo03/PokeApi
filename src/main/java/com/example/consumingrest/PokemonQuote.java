package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)

public record PokemonQuote(String name, Sprites sprites){}

record Sprites(Other other) {}
    record Other(Home home){}
    record Home(String front_default){}

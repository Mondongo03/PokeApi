package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record MoveQuote(String name, Status damage_class, Type type, String accuracy, String power, String pp){}

record Type(String name){}

record Status(String name){}






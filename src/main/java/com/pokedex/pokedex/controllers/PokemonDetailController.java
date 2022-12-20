package com.pokedex.pokedex.controllers;

import com.pokedex.pokedex.model.Description;
import com.pokedex.pokedex.model.Descriptions;
import com.pokedex.pokedex.model.Pokemon;
import com.pokedex.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("pokemondetail")
@RestController
public class PokemonDetailController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/{id}")
    public Pokemon getTodo(@PathVariable("id") int id) {
        Pokemon  Pokemondescription = pokemonService.getPokemonDetail(id);
        return Pokemondescription;
    }


}

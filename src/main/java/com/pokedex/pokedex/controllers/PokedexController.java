package com.pokedex.pokedex.controllers;

import com.pokedex.pokedex.model.Pokemon;
import com.pokedex.pokedex.model.PokemonListResponse;
import com.pokedex.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("pokedex")
@RestController
public class PokedexController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping()
    public List<Pokemon> getPokemonList() {
        String number  = "0";
        ArrayList<Pokemon> pokemonListResp = pokemonService.getPokemonResults(number);
        return pokemonListResp;
    }



}

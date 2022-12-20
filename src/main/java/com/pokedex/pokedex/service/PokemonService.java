package com.pokedex.pokedex.service;

import com.pokedex.pokedex.model.Description;
import com.pokedex.pokedex.model.Pokemon;

import java.util.ArrayList;

public interface PokemonService {

    ArrayList<Pokemon> getPokemonResults(String numberPokemons);
    Pokemon getPokemonDetail(int number);
}

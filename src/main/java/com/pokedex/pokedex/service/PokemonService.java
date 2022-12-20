package com.pokedex.pokedex.service;

import com.pokedex.pokedex.model.Pokemon;

import java.util.ArrayList;

public interface PokemonService{

    ArrayList<Pokemon> getPokemonResults() throws Exception;
    Pokemon getPokemonDetail(int number) throws Exception;
}

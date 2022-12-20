package com.pokedex.pokedex.Dto;

import com.pokedex.pokedex.model.Pokemon;

import java.util.List;

public class PokemonListDto {

    private List<Pokemon> pokemonList;

    private String error;


    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

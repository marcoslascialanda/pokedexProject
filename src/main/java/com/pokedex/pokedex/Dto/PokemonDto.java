package com.pokedex.pokedex.Dto;

import com.pokedex.pokedex.model.Pokemon;

public class PokemonDto {

    private Pokemon pokemon;

    private String error;

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

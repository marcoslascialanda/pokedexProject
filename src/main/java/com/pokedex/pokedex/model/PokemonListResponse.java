package com.pokedex.pokedex.model;

import java.util.ArrayList;

public class PokemonListResponse {

    private ArrayList<PokemonResponse> results;

    public ArrayList<PokemonResponse> getResults() {
        return results;
    }

    public void setResults(ArrayList<PokemonResponse> results) {
        this.results = results;
    }
}

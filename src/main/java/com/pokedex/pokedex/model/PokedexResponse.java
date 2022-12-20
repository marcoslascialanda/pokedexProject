package com.pokedex.pokedex.model;

import java.util.ArrayList;

public class PokedexResponse {

    private int count;
    private String next;
    private String previous;
    private ArrayList<PokemonResponse> results;

    public ArrayList<PokemonResponse> getResults() {
        return results;
    }

    public void setResults(ArrayList<PokemonResponse> results) {
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }
}

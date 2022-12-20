package com.pokedex.pokedex.controllers;

import com.pokedex.pokedex.Dto.PokemonDto;
import com.pokedex.pokedex.Dto.PokemonListDto;
import com.pokedex.pokedex.model.Pokemon;
import com.pokedex.pokedex.model.PokemonListResponse;
import com.pokedex.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("pokedex")
@RestController
public class PokedexController {

    @Autowired
    PokemonService pokemonService;

    //Metodo GET el cual va a traer la lista de pokemones.
    @GetMapping()
    public PokemonListDto getPokemonList() {
        PokemonListDto response = new PokemonListDto();
        try {
            response.setPokemonList(pokemonService.getPokemonResults());
        }catch (Exception e){
            response.setError(e.getMessage());
        }
        return response;

    }
    //Metodo GET el cual va a traer un pokemon con sus detalles.
    @GetMapping("/{id}")
    public PokemonDto getDetail(@PathVariable("id") int id)  {
        PokemonDto response = new PokemonDto();
        try{
            response.setPokemon(pokemonService.getPokemonDetail(id));

        }catch (Exception e){
            response.setError(e.getMessage());
        }
        return response;
    }

}

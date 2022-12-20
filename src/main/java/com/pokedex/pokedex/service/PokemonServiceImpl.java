package com.pokedex.pokedex.service;

import com.pokedex.pokedex.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class PokemonServiceImpl implements PokemonService {


    @Override
    public ArrayList<Pokemon> getPokemonResults() throws Exception {
            // //Llamada a la pokeApi para traer la lista de los pokemones
            String uri = "https://pokeapi.co/api/v2/pokemon?offset=0&limit=150";
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<PokedexResponse> result = restTemplate.getForEntity(uri, PokedexResponse.class);
            ArrayList<Pokemon> pokemons =  getPokemonsList(result.getBody().getResults());
            return pokemons;

    }

    @Override
    public Pokemon getPokemonDetail(int number) throws Exception {
        //Llamada a la pokeApi para traer los datos del pokemon en base al id que se le pasa por parametro.
        RestTemplate restTemplatePokemon = new RestTemplate();
        String uriPokemon = "https://pokeapi.co/api/v2/pokemon/" + number;
        ResponseEntity<Pokemon> resultPokemon = restTemplatePokemon.getForEntity(uriPokemon, Pokemon.class);
        Pokemon pokemon = resultPokemon.getBody();

        //Llamada a la pokeApi para traer los descripcion del pokemon en base a su numero de id .Se busca la descripcion en español y se agrega al objeto pokemon.
        String uri = "https://pokeapi.co/api/v2/characteristic/" + number;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Descriptions> result = restTemplate.getForEntity(uri, Descriptions.class);
        ArrayList<Description> descriptions =  result.getBody().getDescriptions();
        for(Description desc : descriptions){
            if("es".equals(desc.getLanguage().getName())){
                pokemon.setDescription(desc.getDescription());
            }

        }

        return pokemon;
    }


    public ArrayList<Pokemon> getPokemonsList  (ArrayList<PokemonResponse> pokemonUrls) throws Exception{
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        for (PokemonResponse pokemon :  pokemonUrls) {
            RestTemplate restTemplatePokemon = new RestTemplate();
            ResponseEntity<Pokemon> resultPokemon = restTemplatePokemon.getForEntity(pokemon.getUrl(), Pokemon.class);
            pokemonList.add(resultPokemon.getBody());
        }

        return pokemonList;
    }
}

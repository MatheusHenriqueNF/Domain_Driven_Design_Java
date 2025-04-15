package br.com.fiap.service;

import br.com.fiap.model.Pokemon;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class PokemonService {

    public Pokemon getPokemon(String nomeOuId) throws IOException {
        Pokemon pokemon = null;

        // request
        HttpGet request = new HttpGet("https://pokeapi.co/api/v2/pokemon/"+nomeOuId.toLowerCase());

        // client
        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        // response
        CloseableHttpResponse response = httpClient.execute(request);

        // entity
        HttpEntity entity = response.getEntity();

        if(entity != null) {
            String result = EntityUtils.toString(entity);

            // precisamos converter a string para json
            JsonObject jsonObject = JsonParser.parseString(result).getAsJsonObject();

            // pegar o valor do json
            int id = jsonObject.get("id").getAsInt();
            String name = jsonObject.get("name").getAsString();
            int height = jsonObject.get("height").getAsInt();
            int weight = jsonObject.get("weight").getAsInt();

            // pega o array de tipos de pokemon
            JsonArray typesArray = jsonObject.getAsJsonArray("types");

            // pega o primeiro tipo
            JsonObject tipoObj = typesArray.get(0).getAsJsonObject();

            // pega a informação do tipo do pokemon
            JsonObject tipoInfo = tipoObj.getAsJsonObject("type");

            // pega o nome do tipo, como por exemplo: "eletric" -> ao inserir picachu por exemplo
            String tipo = tipoInfo.get("name").getAsString();

            pokemon = new Pokemon(id, name, height, weight, tipo);

        }

        return pokemon;

    }

}

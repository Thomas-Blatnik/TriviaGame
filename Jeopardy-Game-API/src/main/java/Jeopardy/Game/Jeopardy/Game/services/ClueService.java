package Jeopardy.Game.Jeopardy.Game.services;

import Jeopardy.Game.Jeopardy.Game.Model.Clue;
import Jeopardy.Game.Jeopardy.Game.Model.Game;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ClueService {

    private static final String API_BASE_URL = "https://jarchive-json.glitch.me/game/";
    private final RestTemplate restTemplate = new RestTemplate();

    public Game getGame(String date){
        Game game = null;
        try {
            game = restTemplate.getForObject(API_BASE_URL + date, Game.class);
        } catch (RestClientResponseException e) {

        } catch (ResourceAccessException e) {

        }
        return game;
    }
}

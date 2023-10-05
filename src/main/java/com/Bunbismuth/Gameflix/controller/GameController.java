package com.Bunbismuth.Gameflix.controller;

import com.Bunbismuth.Gameflix.game.Game;
import com.Bunbismuth.Gameflix.game.GameRepository;
import com.Bunbismuth.Gameflix.game.GameRequestDTO;
import com.Bunbismuth.Gameflix.game.GameResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// Isso aqui serve para mapear o request que vai cair nesse controller, que neste caso é game
@RequestMapping("game")
public class GameController {
    // Para explicitarmos que quando instanciarmos a classe GameController precisamos injetar essa dependência
    // usamos a notação Autowired.
    @Autowired
    private GameRepository repository;

    @PostMapping
    public void saveGame(@RequestBody GameRequestDTO data){
        Game gameData = new Game(data);
        repository.save(gameData);
    }

    // Aqui, o GetMapping indica que esse método será utilizado toda vez dar um get no end-point game.
    @GetMapping
    // Para pegar todos os dados no nosso banco de dados
    public List<GameResponseDTO> getAll(){

        List<GameResponseDTO> gameList = repository.findAll().stream().map(GameResponseDTO::new).toList();

        return gameList;
    }
}

package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //Método para retorna todos os games
    public List<GameDTO> findAll() {
        var result = gameRepository.findAll();

        return result.stream().map(GameDTO::new).toList();
    }
}

package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //Método para buscar game por id
    @Transactional(readOnly = true) //Garante que a transação com o banco de dados vai acontecer
    public GameDTO findById(Long id) {
       var result = gameRepository.findById(id).get();

       return new GameDTO(result);
    }

    //Método para retorna todos os games
    @Transactional(readOnly = true) //Garante que a transação com o banco de dados vai acontecer
    public List<GameMinDTO> findAll() {
        var result = gameRepository.findAll();

        return result.stream().map(GameMinDTO::new).toList();
    }
}

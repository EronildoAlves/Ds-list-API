package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    //Método para retorna todos os games apenas com o id e name
    @Transactional(readOnly = true) //Garante que a transação com o banco de dados vai acontecer
    public List<GameListDTO> findAll() {
        var result = gameListRepository.findAll();

        return result.stream().map(GameListDTO::new).toList();
    }
}

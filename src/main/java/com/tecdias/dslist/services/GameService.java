package com.tecdias.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecdias.dslist.dto.GameMinDTO;
import com.tecdias.dslist.entities.Game;
import com.tecdias.dslist.repositories.GameRepository;

// registra a classe como componente do sistema para que seja gerenciado pela framework
@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}

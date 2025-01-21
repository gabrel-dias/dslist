package com.tecdias.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecdias.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

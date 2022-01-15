package com.devsuperior.DSMovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.DSMovie.entities.Score;
import com.devsuperior.DSMovie.entities.User;

public interface ScoreRepository extends JpaRepository<User, Long>{

	Score saveAndFlush(Score score);

}

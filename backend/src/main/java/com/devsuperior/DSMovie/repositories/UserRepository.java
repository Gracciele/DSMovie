package com.devsuperior.DSMovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.DSMovie.entities.Score;
import com.devsuperior.DSMovie.entities.ScorePK;
import com.devsuperior.DSMovie.entities.User;

public interface UserRepository extends JpaRepository<Score, ScorePK>{

	User findByEmail(String email);

	User saveAndFlush(User user);
	
}

package com.springreact.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreact.dsmovie.entities.Score;
import com.springreact.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score,ScorePK> {
	
	

}

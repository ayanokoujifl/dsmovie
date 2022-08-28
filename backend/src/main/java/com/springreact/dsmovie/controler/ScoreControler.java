package com.springreact.dsmovie.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.dsmovie.dto.MovieDTO;
import com.springreact.dsmovie.dto.ScoreDTO;
import com.springreact.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreControler {
	
	@Autowired
	ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		MovieDTO MovieDTO = service.saveScore(dto);
		return MovieDTO;
	}
}

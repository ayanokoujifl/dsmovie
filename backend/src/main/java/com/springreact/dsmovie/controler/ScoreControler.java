package com.springreact.dsmovie.controler;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.dsmovie.dto.MovieDTO;
import com.springreact.dsmovie.dto.ScoreDTO;

@RestController
@RequestMapping(value = "/scores")
public class ScoreControler {
	
	
	@PutMapping(value="/{id}")
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		return null;
	}
}

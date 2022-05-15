package com.springreact.dsmovie.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.dsmovie.dto.MovieDTO;
import com.springreact.dsmovie.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieControler {
	
	@Autowired
	private MovieService movieservice;

	@GetMapping
	public Page<MovieDTO> findALL(Pageable pageable) {
		return movieservice.findAll(pageable);
	}
	
	@GetMapping(value="/{id}")
	public MovieDTO findById(@PathVariable Long id) {
		return movieservice.findById(id);
	}
}

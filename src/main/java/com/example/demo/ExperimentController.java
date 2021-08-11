package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperimentController {
	
	@Autowired
	private ExperimentRepository experimentRepository;

	@PostMapping("/create")
	public Experiment createExperiment(@RequestBody Experiment experiment) {
		return experimentRepository.save(experiment);
		
	}
	 
	
	
}

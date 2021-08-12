package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiment")
public class ExperimentController {
	
	@Autowired
	private ExperimentRepository experimentRepository;

	@PostMapping("/create")
	public Experiment createExperiment(@RequestBody Experiment experiment) {
		return experimentRepository.save(experiment);
		
	}
	
	@GetMapping("/list")
	public List<Experiment> listExperiments() {
		return experimentRepository.findAll();
		
	}
	

	@GetMapping("/getbyid")
	public Experiment getExperimentById(@RequestBody Integer experimentID) {
		return experimentRepository.findById(experimentID).get();
		
	}
	 
	 
	
	
}

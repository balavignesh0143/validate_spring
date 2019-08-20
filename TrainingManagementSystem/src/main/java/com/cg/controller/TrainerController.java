package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Trainers;
import com.cg.service.ITrainer;

@RestController
@RequestMapping("/trainee")
public class TrainerController {
	@Autowired
	private ITrainer trainee;
	
	@GetMapping(value="/all")
	public List<Trainers> findAll(){
		return trainee.findAll();
	}
	
	@GetMapping(value="/get/{id}")
	public Trainers findTrainersById(@PathVariable int id)
	{
		return trainee.findTrainersById(id);
	}
	
	@PostMapping(value="/add")
	public List<Trainers> addTrainee(@RequestBody Trainers tran)
	{
		return trainee.addTrainers(tran);
	}
	
	@PutMapping(value="/edit/{id}")
	public List<Trainers> updateTrainee(@RequestBody int id, Trainers trans){
		return trainee.updateTrainers(id,trans);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteTrainee(@PathVariable int id)
	{
		trainee.deleteTrainee(id);
	}
}

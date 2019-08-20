package com.cg.service;

import java.util.List;

import com.cg.entities.Trainers;

public interface ITrainer {

	List<Trainers> findAll();

	Trainers findTrainersById(int id);

	Trainers addTrainers(Trainers tran);

	List<Trainers> updateTrainers(int id, Trainers trans);

	void deleteTrainee(int id);

}

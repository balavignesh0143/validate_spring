package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ITrainerDao;
import com.cg.entities.Trainers;

@Service
public class TrainerServiceImpl implements ITrainer{

	@Autowired
	private ITrainerDao dao;
	
	@Override
	public List<Trainers> findAll() {
		return dao.findAll();
	}

	@Override
	public Trainers findTrainersById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public Trainers addTrainers(Trainers tran) {
		
		return dao.save(tran);
	}

	@Override
	public List<Trainers> updateTrainers(int id,Trainers trans) {
		Optional<Trainers> optional=dao.findById(id);
		if(optional.isPresent())
		{
			Trainers train=optional.get();
			train.setName(trans.getName());
			train.setFees(trans.getFees());
			train.setDuration(trans.getDuration());		
			dao.save(train);
		}
		return findAll();
	}

	@Override
	public void deleteTrainee(int id) {
		dao.deleteById(id);
	}

}

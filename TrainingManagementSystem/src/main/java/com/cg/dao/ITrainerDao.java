package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Trainers;

public interface ITrainerDao extends JpaRepository<Trainers,Integer>{

}

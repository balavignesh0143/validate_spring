package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Trainers;
@Repository
public interface ITrainerDao extends JpaRepository<Trainers,Integer>{

}

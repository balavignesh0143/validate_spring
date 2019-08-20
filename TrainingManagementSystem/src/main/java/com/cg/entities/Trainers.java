package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "trainee")
public class Trainers {
	@Id
	@NotNull(message="ID Not Null")
	private int id;
	@NotNull(message="Name Not Null, Min Length 3  and  Max Length 20")
	@Size(min=3,max=20)
	private String name;
	@Max(value=50000,message="FEES Max Value should not exceed 50,000/-")
	private int fees;
	@Size(min=2,max=3,message="DURATION numbers of hours should be 2 to 3 digits")
	private int duration;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}

package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CandidateReg {
    
	@Id
	private int id;
	private String name, district, partyName, residency;
	private int age, vote=0;
	
	
	public CandidateReg(int id,String name, String district, String party, String residency, int age) {
	this.id=id;
	this.name = name;
	this.district = district;
	this.partyName = party;
	this.residency = residency;
	this.age = age;
	}
	@Override
	public String toString() {
	return "CandidateReg [id=" + id + ", name=" + name + ",district=" + district + ", partyName=" + partyName
	+ ", residency=" + residency + ", age=" + age + "]";
	}

	public String getName() {
	return name;
	}

	public int getVote() {
    return vote;
	}
	public int getId()
	{
	return id;
	}
	public String getParty() 
	{
	return partyName;
	}
	public void setVote(int vote)
	{
	this.vote=this.vote+1;	
	}

}

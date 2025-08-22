package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VoterReg {
	
	@Id
	private int id;
	private String name , address;
	private long aadharNo;
	private String birthDate;
	private int age;
	@Override
	public String toString() {
		return "VoterReg [id=" + id + ",name="+name+",address="+address+",aadharNo="+aadharNo+",birthDate="+birthDate+",age="+ age +"]";}
	
    private boolean voting;
  
    
    public String  getName() {
    	return name; 		
    }
    public void isVoting(Boolean voting) {
    	this.voting=voting;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public int getId() {
    	return id;
    }
    public boolean getVoting() {
    	return voting;
    } 
    public VoterReg(int id, String name, String address, long aadharNo, String date, int age) {
    	this.id=id;
    	this.name=name;
    	this.address=address;
    	this.aadharNo=aadharNo;
    	this.birthDate=date;
    	this.age=age;
    }
}

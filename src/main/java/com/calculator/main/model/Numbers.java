package com.calculator.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Numbers {
	
	@Id
	@GeneratedValue
	private int id;
	private int firstNumber;
	private int secondNumber;
	private int thirdNumber;
	private String operation;

	public Numbers(int firstNumber, int secondNumber, int thirdNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getFirstNumber() {
		return firstNumber;
	}


	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}


	public int getSecondNumber() {
		return secondNumber;
	}


	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}


	public int getThirdNumber() {
		return thirdNumber;
	}


	public void setThirdNumber(int thirdNumber) {
		this.thirdNumber = thirdNumber;
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}


	@Override
	public String toString() {
		return "Numbers [firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + ", thirdNumber=" + thirdNumber
				+ "]";
	}

}

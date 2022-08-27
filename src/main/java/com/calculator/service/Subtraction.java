package com.calculator.service;

import org.springframework.stereotype.Service;

import com.calculator.main.model.Numbers;

@Service
public class Subtraction implements PerformOperation{

	@Override
	public int performOperation(Numbers values) {
		
        int difference = values.getFirstNumber()-values.getSecondNumber()-values.getThirdNumber();
		return difference;
		
	}
	
}

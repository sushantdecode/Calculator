package com.calculator.service;

import org.springframework.stereotype.Service;

import com.calculator.main.model.Numbers;

@Service
public class Addition implements PerformOperation{

	@Override
	public int performOperation(Numbers values) {
		
        int sum = values.getFirstNumber()+values.getSecondNumber()+values.getThirdNumber();
		return sum;
		
	}
	
}

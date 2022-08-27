package com.calculator.service;

import org.springframework.stereotype.Service;

import com.calculator.main.model.Numbers;

@Service
public class Multiplication implements PerformOperation{

	@Override
	public int performOperation(Numbers values) {
		
        int product = values.getFirstNumber()*values.getSecondNumber()*values.getThirdNumber();
		return product;
		
	}
	
}

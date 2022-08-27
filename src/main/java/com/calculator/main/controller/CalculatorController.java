package com.calculator.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.main.model.Numbers;
import com.calculator.service.Addition;
import com.calculator.service.Multiplication;
import com.calculator.service.PerformOperation;
import com.calculator.service.Subtraction;

@RestController
public class CalculatorController {

	PerformOperation performOperation;

	@GetMapping("/")
	public String home() {
		System.out.println("Started");
		return "home";
	}

	@GetMapping("/calculate")
	public String calculateResult(@ModelAttribute("values") Numbers values) {

		if (values.getOperation().equals("add")) {
			
			PerformOperation addition = new Addition();
			int result = addition.performOperation(values);
			return "Result:" + result;
			
		} else if (values.getOperation().equals("subtract")) {
			
			PerformOperation subtraction = new Subtraction();
			int result = subtraction.performOperation(values);
			return "Result:" + result;
			
		} else if (values.getOperation().equals("multiply")) {
			
			PerformOperation multiplication = new Multiplication();
			int result = multiplication.performOperation(values);
			return "Result:" + result;
			
		} else {
			
			return "Invalid Request. Please try with different operation";
			
		}
	}

}

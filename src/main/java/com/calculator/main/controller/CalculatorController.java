package com.calculator.main.controller;

import java.util.logging.Logger;

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
	
	private static final Logger log = Logger.getLogger("CalculatorController");
	PerformOperation performOperation;

	@GetMapping("/")
	public String home() {
		log.info("Home Page Initiated");
		return "Welcome!";
	}

	@GetMapping("/calculate")
	public String calculateResult(@ModelAttribute("values") Numbers values) {

		if (values.getOperation().equals("add")) {
			log.info("Addition Operation Called");
			PerformOperation addition = new Addition();
			int result = addition.performOperation(values);
			return "Result:" + result;
			
		} else if (values.getOperation().equals("subtract")) {
			log.info("Subtract Operation Called");
			PerformOperation subtraction = new Subtraction();
			int result = subtraction.performOperation(values);
			return "Result:" + result;
			
		} else if (values.getOperation().equals("multiply")) {
			log.info("Multiply Operation Called");
			PerformOperation multiplication = new Multiplication();
			int result = multiplication.performOperation(values);
			return "Result:" + result;
			
		} else {
			log.warning("Inavlid Request");
			return "Invalid Request. Please try with different operation";
			
		}
	}

}

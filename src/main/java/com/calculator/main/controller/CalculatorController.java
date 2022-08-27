package com.calculator.main.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.main.model.Numbers;
import com.calculator.service.Addition;
import com.calculator.service.CalculationFactory;
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

		PerformOperation operation = CalculationFactory.getOperation(values.getOperation());
		String result;
		
		log.info("Calculate Result Method Called");
		
		try {
			result = "Result is: " + operation.performOperation(values);
		}
		catch(Exception e){
			log.warning("Inavlid Request");
			return "Invalid Request. Please try with different operation \n" + e;
		}
		
		return result;
	}

}

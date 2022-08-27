package com.calculator.service;

import java.util.HashMap;
import java.util.Map;

public class CalculationFactory {

	static Map<String, PerformOperation> operationMap = new HashMap<String, PerformOperation>();

	  static {
	    operationMap.put("add", new Addition());
	    operationMap.put("subtract", new Subtraction());
	    operationMap.put("multiply", new Multiplication());
	  }

	  public static PerformOperation getOperation(String operator) {
	    return operationMap.get(operator);
	  }
	
}

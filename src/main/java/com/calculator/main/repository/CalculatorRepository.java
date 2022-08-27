package com.calculator.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calculator.main.model.Numbers;

public interface CalculatorRepository extends JpaRepository<Numbers, Integer>{

}

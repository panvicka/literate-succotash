package com.ev.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ev.demo.model.Parameter;
import com.ev.demo.repository.ParameterRepository;

@Service
public class ParameterService {

	@Autowired
	private ParameterRepository parameterRepository;

	public List<Parameter> getAll() {
		return (List<Parameter>) parameterRepository.findAll();
	}

	public Optional<Parameter> getOne(Integer id) {

		return parameterRepository.findById(id);

	}

	public void addNew(Parameter parameter) {
		parameterRepository.save(parameter);
	}

	public void update(Parameter parameter) {
		parameterRepository.save(parameter);

	}

	public void delete(Integer id) {
		System.out.println(id);
		parameterRepository.deleteById(id);
	}

}

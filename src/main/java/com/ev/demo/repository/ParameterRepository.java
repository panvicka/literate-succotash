package com.ev.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ev.demo.model.Parameter;


@Repository
public interface ParameterRepository  extends CrudRepository<Parameter, Integer>{

}

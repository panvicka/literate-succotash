package com.ev.demo.controllers;

import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ev.demo.model.Parameter;
import com.ev.demo.services.ParameterService;

@Controller
@RequestMapping("/parameters")
public class ParameterController {
////
//	@Autowired
//	private ParameterService parameterService;
//
//	@RequestMapping("/getAll")
//	public String getAll(Model model) {
//		List<Parameter> parameters = parameterService.getAll();
//		model.addAttribute("parameters", parameters);
//		System.out.println("getAll");
//		return "parameters";
//	}
//
//	@RequestMapping("/getOne")
//	@ResponseBody
//	public Optional<Parameter> getOne(Integer Id) {
//
//		return parameterService.getOne(Id);
//
//	}
//
//	@PostMapping("/addNew")
//	public String addNew(Parameter parameter) {
//		System.out.println("addNew");
//
//		parameterService.addNew(parameter);
//		return "redirect:/parameters/getAll";
//	}
//
//	@RequestMapping(value = "/update", method = { RequestMethod.PUT, RequestMethod.GET })
//	public String update(Parameter parameter) {
//
//		parameterService.update(parameter);
//		return "redirect:/parameters/getAll";
//
//	}
//
//	@RequestMapping(value = "/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
//	public String delete(Integer Id) {
//		System.out.println("delete");
//		parameterService.delete(Id);
//		return "redirect:/parameters/getAll";
//	}

}

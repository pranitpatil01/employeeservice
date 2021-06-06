package com.secure.be.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/v1")
public class EmployeeController {
	
	@ApiOperation(value = "Api to get hello")
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String addStudent(@RequestParam String name, HttpServletResponse response) throws IOException {
			return "Hey Hello "+name;

	}
	
	@ApiOperation(value = "Api to get helloword")
	@RequestMapping(value = "/world", method = RequestMethod.GET)
	@ResponseBody
	public String addStudent(HttpServletResponse response) throws IOException {
			return "Hey Hello world";

	}

}

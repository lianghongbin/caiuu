package com.meishihome.edit.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/{type}/user/{id}", method= RequestMethod.GET)
	public ModelAndView test(@PathVariable String type,@PathVariable Long id,HttpServletRequest request, HttpServletResponse response) throws IOException{

        request.setAttribute("type", type);

		return new ModelAndView("home", "id", id);
	}
}

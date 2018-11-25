package com.cg.assignmentrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.assignmentrest.entity.RegisteredCand;
import com.cg.assignmentrest.service.IService;

@Controller
public class CourseController {
	
	@Autowired
	IService service;
	
	@RequestMapping(value="home")
	public String openCourseDetails()
	{
		return "course";
	}
	
	
	
	@RequestMapping(value="courseDetails")
	public ModelAndView home()
	{
		List<RegisteredCand> list=service.getList();
		return new ModelAndView("enroll","data",list);
	}
	
	@RequestMapping(value="enroll")
	public ModelAndView doUpdate(@RequestParam("id") int id,@RequestParam("name") String course,@ModelAttribute("my") 
	RegisteredCand bean)
	{
		bean.setCourseId(id);
		bean.setCourse(course);
		bean.setId(1);
		return new ModelAndView("success","my",bean);
	}
}


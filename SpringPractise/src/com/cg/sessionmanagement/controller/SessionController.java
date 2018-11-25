package com.cg.sessionmanagement.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.sessionmanagement.dto.Student;
import com.cg.sessionmanagement.servcie.IStudentService;

@Controller
public class SessionController {

	@Autowired
	IStudentService studentService;

	@RequestMapping(value = "all", method = RequestMethod.GET)
	public String allValue() {
		return "home";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String addStudent(@ModelAttribute("my") Student student,
			Map<String, Object> model) {

		List<String> deptList = new ArrayList<>();
		deptList.add("ECE");
		deptList.add("EEE");
		deptList.add("MECH");
		deptList.add("CSE");
		model.put("dept", deptList);
		return "fillstudentdetails";

	}


	
	
	@RequestMapping(value = "final", method = RequestMethod.POST)
	public ModelAndView studentDetails(
			@Valid @ModelAttribute("my1") Student student, BindingResult result,
			Map<String, Object> model) {
		int value;

		List<String> deptList = new ArrayList<>();
		if (result.hasErrors()) {
			deptList.add("ECE");
			deptList.add("EEE");
			deptList.add("MECH");
			deptList.add("CSE");
			model.put("dept", deptList);
			return new ModelAndView("fillstudentdetails2");

		} else
			value = studentService.updateStudent(student);

		return new ModelAndView("studentsucessfinal", "data", value);

	}
	
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public String searchStudent() {
		return "searchstudent";

	}

	@RequestMapping(value = "dosearch", method = RequestMethod.GET)
	public ModelAndView studentSearch(@RequestParam("studentId") int studentId,
			Student student) {

		Student student1 = null;
		student1 = studentService.searchStudent(studentId);
		if (student1 != null) {
			return new ModelAndView("studentsearchfound", "searchvalue",
					student1);
		} else {
			return new ModelAndView("SearchFailed");
		}

	
	}
	

	
	@RequestMapping(value="insertvaluestoupdatesearch")
	public ModelAndView updateSearch(@RequestParam("studentId") int studentId,
			@ModelAttribute("my1") Student student,Map<String,Object> model){
		
		//Student s2=studentService.
		
		List<String> deptList = new ArrayList<>();
		deptList.add("ECE");
		deptList.add("EEE");
		deptList.add("MECH");
		deptList.add("CSE");
		model.put("dept", deptList);
		
		return new ModelAndView("fillstudentdetails2","venky",deptList);
		
				//return null;
		
	}
	
	@RequestMapping(value = "insertstudentdetails1", method = RequestMethod.POST)
	public ModelAndView insertStudent(
			@Valid @ModelAttribute("my1") Student student, BindingResult result,
			Map<String, Object> model) {
		int value;

		List<String> deptList = new ArrayList<>();
		if (result.hasErrors()) {
			deptList.add("ECE");
			deptList.add("EEE");
			deptList.add("MECH");
			deptList.add("CSE");
			model.put("dept", deptList);
			return new ModelAndView("fillstudentdetails");

		} else
			value = studentService.addStudent(student);

		return new ModelAndView("studentsucess", "data", value);

	}
	
	
	
	
	
	
	
}


/*
 * @RequestMapping(value="search",method=RequestMethod.GET) public ModelAndView
 * searchStudent(@RequestParam("id") int id){ List<Student> studentList=null;
 * studentList=studentService.searchStudent(id); if(studentList==null){ return
 * ModelAndView("searchfailed"); } else return
 * ModelAndView("searchsucess","search",studentList);
 * 
 * 
 * }
 */


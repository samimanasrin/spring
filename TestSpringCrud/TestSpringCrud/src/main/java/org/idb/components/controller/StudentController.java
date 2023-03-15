package org.idb.components.controller;



import java.util.List;

import org.idb.components.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import dao.StudentDao;

@Controller
public class StudentController {
	@Autowired
	private StudentDao dao;

	@RequestMapping("/")
	public String home(Model m) {
		
		List<Student> list=dao.getAll();		
		
		m.addAttribute("list",list);
		m.addAttribute("title","S all Student");
		

		return "/home";
	}

	@RequestMapping("/student-form")
	public String studentForm(Model m) {

		
		m.addAttribute("title", "Student Form");
		
		return "/student-form";
	}

	@RequestMapping(value = "/create-student", method = RequestMethod.POST)
	public RedirectView createStudent(@ModelAttribute() Student s) {
		
		dao.createStudent(s);
		RedirectView r = new RedirectView();
		r.setUrl("/");
	

		return r;

	}
	
	@RequestMapping("/delete-student/{id}")
	public RedirectView deleteStudent(@PathVariable("id")int id){
		dao.delete(id);
		
		RedirectView r = new RedirectView();
		r.setUrl("/");
	

		return r;
			
	}
	
	@RequestMapping("/edit-student/{id}")
	public String editStudent(@PathVariable("id")int id,Model model){
		
		Student s=dao.getById(id);
		
		model.addAttribute("student",s);
		
		model.addAttribute("title","Edit Student");
		
		return "edit-student";
	}

}

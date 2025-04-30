package com.myToDoList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myToDoList.pojo.MyToDoList;
import com.myToDoList.service.MyToDoListService;

@RestController
@RequestMapping("/todolist")
public class MyToDoListController {
	@Autowired
	public MyToDoListService myToDoListService;
	
	// reading all existing task	
	@GetMapping
	public List<MyToDoList> readAllToDoList(){
		return  myToDoListService.getAllToDoList();
	}
	
	//reading a existing task by id
	@GetMapping("/{/id}")
	public MyToDoList readToDoListById(Long Id) {
		return myToDoListService.getToDoListById(Id);
	}
	
	//creating a new task 
	@PostMapping
	public String createNewToDoList(MyToDoList myToDoList) {
		myToDoListService.createNewToDoList(myToDoList);
		return "New to do list added";
	}
	
	//updating a existing task by id
	@PutMapping("{/id}")
	public String updateToDoList(Long Id,MyToDoList myToDoList) {
		myToDoListService.updateToDoList(Id,myToDoList);
		return "To do list updated";		
	}
	
	//deleting a existing task by id
	@DeleteMapping("{/id}")
	public String deleteToDoList(Long Id) {
		myToDoListService.deleteToDoList(Id);
		return "To do list deleted";
	}

}

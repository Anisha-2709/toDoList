package com.myToDoList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myToDoList.dao.MyToDoListDao;
import com.myToDoList.pojo.MyToDoList;

@Service
public class MyToDoListServiceImple implements MyToDoListService {
	@Autowired
	public MyToDoListDao myToDoListDao;

	// reading all existing task	
	@Override
	public List<MyToDoList> getAllToDoList() {
		return myToDoListDao.findAll();		 
	}

	//reading a existing task by id
	@Override
	public MyToDoList getToDoListById(Long Id) {
		return myToDoListDao.findById(Id).orElseThrow();
	}

	//creating a new task 
	@Override
	public void createNewToDoList(MyToDoList myToDoList) {
		myToDoListDao.save(myToDoList);
	}

	//updating a existing task by id
	@Override
	public void updateToDoList(Long id,MyToDoList myToDoList) {
		if(myToDoListDao.existsById(id)==true) {
			myToDoListDao.save(myToDoList);
		}
				
	}

	//deleting a existing task by id
	@Override
	public void deleteToDoList(Long id) {
		if(myToDoListDao.existsById(id)==true) {
			myToDoListDao.deleteById(id);
		}
	}
		
}

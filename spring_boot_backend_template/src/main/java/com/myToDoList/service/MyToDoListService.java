package com.myToDoList.service;

import java.util.List;

import com.myToDoList.pojo.MyToDoList;

public interface MyToDoListService {

	public List<MyToDoList> getAllToDoList();

	public MyToDoList getToDoListById(Long Id);

	public void createNewToDoList(MyToDoList myToDoList);

	public void updateToDoList(Long id,MyToDoList myToDoList);

	public void deleteToDoList(Long id);

}

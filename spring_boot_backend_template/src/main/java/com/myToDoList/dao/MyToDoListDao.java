package com.myToDoList.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myToDoList.pojo.MyToDoList;

public interface MyToDoListDao extends JpaRepository<MyToDoList, Long> {

}

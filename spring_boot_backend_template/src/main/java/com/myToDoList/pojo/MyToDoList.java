package com.myToDoList.pojo;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

@Entity
@Table(name="myToDoList")

//@NoArgsConstructor
//@Getter
//@Setter
//@ToString

public class MyToDoList {
	@Id
	@Column(name="task_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long taskId;
	
	@Column(name="task_name")
	public String taskName;
	
	@Column(name="created_on")
	@CreationTimestamp
	public LocalDate createdOn;
	
	@Column(name="updated_on")
	@UpdateTimestamp
	public LocalDate updatedOn;
	
	@Column(name="task_desc")
	public String taskDesc;
	
	//no args contructor
	public MyToDoList() {
		super();
	}

	//parameterized constructor
	public MyToDoList(Long taskId, String taskName, LocalDate createdOn, LocalDate updatedOn, String taskDesc) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.taskDesc = taskDesc;
	}
	
	//getter and setters

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public Long getTaskId() {
		return taskId;
	}

	//toString method to display
	@Override
	public String toString() {
		return "MyToDoList [taskId=" + taskId + ", taskName=" + taskName + ", createdOn=" + createdOn + ", updatedOn="
				+ updatedOn + ", taskDesc=" + taskDesc + "]";
	}
		
}

package com.javah2example.demo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Worker")
public class Worker {
	
	@Id
	@Column(name ="WORKER_ID")
	int worker;

	@Column(name ="FIRST_NAME")
	String firstName;
	
	@Column(name ="LAST_NAME")
	String lastName;
	
	@Column(name ="SALARY")
	int salary;
	
	@Column(name = "JOINING_DATE")
	String joiningDate;
	
	@Column(name = "DEPARTMENT")
	String department;

	
	/*
	 * @OneToMany(targetEntity = Title.class)
	 * 
	 * @JoinColumn(name = "worker_fk",referencedColumnName = "worker") private
	 * List<Title> title;
	 */
	 
	
	/*
	 * @OneToOne
	 * 
	 * @PrimaryKeyJoinColumn(name="WORKER_ID") private List<Title> title;
	 */
	 
	
	public int getWorker() {
		return worker;
	}

	public void setWorker(int worker) {
		this.worker = worker;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

	public Worker(int worker, String firstName, String lastName, int salary, String joiningDate, String department,
			Title title) {
		super();
		this.worker = worker;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.department = department;
	}

	public Worker() {
		super();
	}

	@Override
	public String toString() {
		return "Worker [worker=" + worker + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", joiningDate=" + joiningDate + ", department=" + department + "]";
	}
	
}

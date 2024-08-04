package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMP_SYSTEM")
public class Employee {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private String email;
		private String department;
		private String position;
		private String salary;
		private String dateofjoin;
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public String getDateofjoin() {
			return dateofjoin;
		}
		public void setDateofjoin(String dateofjoin) {
			this.dateofjoin = dateofjoin;
		}
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department
					+ ", position=" + position + ", salary=" + salary + ", dateofjoin=" + dateofjoin + "]";
		}
		
		
		
		
		
}

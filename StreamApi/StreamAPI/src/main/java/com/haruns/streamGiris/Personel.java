package com.haruns.streamGiris;

public class Personel implements Comparable<Personel> {
	private Integer id;
	private String name;
	private String surname;
	private String department;
	private double salary;
	
	public Personel(Integer id, String name, String surname, String department, double salary) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.salary = salary;
	}
	public void increaseSalary(double oran){
		salary+=(salary*oran)/100;
	}
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Personel{"
				+ "id=" + id
				+ ", name='" + name + '\''
				+ ", surname='" + surname + '\''
				+ ", department='" + department + '\''
				+ ", salary=" + salary + '}';
	}
	
	@Override
	public int compareTo(Personel o) {
		return (int) (this.salary-o.salary);
		//return  (this.name.compareTo(o.name));
	}
}
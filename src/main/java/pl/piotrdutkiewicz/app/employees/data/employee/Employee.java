package pl.piotrdutkiewicz.app.employees.data.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public final class Employee {

	private int id;
	private String name;
	private String surname;
	private String position;
	private String department;
	// private Date employmentDate;
	private int salary;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// public Date getEmploymentDate() {
	// return employmentDate;
	// }
	//
	// public void setEmploymentDate(Date employmentDate) {
	// this.employmentDate = employmentDate;
	// }

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {

		return name + " " + surname + " " + position + " " + department + " " + " " + salary;

	}
}

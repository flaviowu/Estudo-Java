package entities;

public class Worker {

	private int idnumber;
	private String name;
	private double salary;

	public Worker(int idnumber, String name, double salary) {
		this.idnumber = idnumber;
		this.name = name;
		this.salary = salary;
	}
	public Worker(int idnumber) {
		this.idnumber = idnumber;
	}

	public int getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	public String toString() {
		return idnumber + ", " + name + ", " + salary;
	}
	
	public void raiseSalary(double raise) {
		this.salary = (1 + raise/100) * this.salary;
	}
}
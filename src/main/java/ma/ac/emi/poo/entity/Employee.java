package ma.ac.emi.poo.entity;

public class Employee{
	private String name;
	private int matricule;

	private double salary;


	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", salary=" + salary +
				'}';
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int matricule, double salary) {
		super();
		this.setName(name);
		this.matricule = matricule;
		this.salary = salary;
	}
	
	public void setName(String newName) {
		if(newName == null || newName.trim().equals(""))
			throw new RuntimeException("Attention le nom ne doit pas etre nul ! ");
		this.name = newName;
	}

	public String getName(){
		return this.name;
	}

	public double getSalary(){
		return this.salary;
	}
}

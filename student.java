package amrita;

public class student 
{
	private String name;
	private String department;
	private String degree;
	private String year;
	private int rno;
	
	public student(String name, String department, String degree, String year, int rno) {
		super();
		this.name = name;
		this.department = department;
		this.degree = degree;
		this.year = year;
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}
	
	public void display()
	{
		System.out.println("Student details :");
		System.out.println("Nmae : "+name);
		System.out.println("Department : "+department);
		System.out.println("Degree : "+degree);
		System.out.println("Year : "+year);
		System.out.println("Roll Number: "+rno);
	}

	
	
}

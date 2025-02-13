package Classes;

public class Student {
	
	private int StudentID;
	private String name;
	private double marks;
	
	public Student() {
		
	}
	
	public Student(int sid, String sname) {
		StudentID = sid;
		name = sname;
	}
	
	public void setID(int sid) {
		StudentID = sid;
	}
	
	public void setName(String sname) {
		name = sname;
	}
	
	public int getID() {
		return StudentID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMarks(double smarks) {
		marks = smarks;
	}
	
}

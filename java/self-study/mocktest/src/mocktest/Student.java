package mocktest;

public class Student {

	private int studentId;
    private String name;
    private String email;

    public Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", Email: " + email;
    }
	
}

package mocktest;

public class Registration {
	
	  private int regId;
	    private int studentId;
	    private int courseId;

	    public Registration(int regId, int studentId, int courseId) {
	        this.regId = regId;
	        this.studentId = studentId;
	        this.courseId = courseId;
	    }

	    public int getStudentId() {
	        return studentId;
	    }

	    public int getCourseId() {
	        return courseId;
	    }
}
